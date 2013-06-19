package com.kozlowski.geektic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.kozlowski.geektic.Geek;

@Repository
public class Dao {

	@PersistenceContext
	private EntityManager em;
	
	public Dao(){
	}
	
	public Dao(EntityManager em) {
		this.em = em;
	}
	
	public void persist(Geek geek) {
		em.persist(geek);
	}
	
	public List<Geek> trouverTousLesGeek() {
		String requete = "select geek from Geek geek order by geek.nom";
		return em.createQuery(requete, Geek.class).getResultList();
	}
	
	public Geek trouverParId(Long id) {
		return em.find(Geek.class, id);
	}
		
	
	public List<Geek> trouverParLangage(Type sexe, String[] langage) {		
		String sql = "SELECT g FROM Geek g JOIN g.interet h";	
		System.out.println(em.createQuery(sql, Geek.class).getResultList().get(0).getEmail());
		
		return em.createQuery(sql, Geek.class).getResultList();
	}
}

