package com.kozlowski.geektic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.kozlowski.geektic.Dao;
import com.kozlowski.geektic.Type;
import com.kozlowski.geektic.Geek;


@Transactional
public class Service {

	
	private Dao dao;

	@Autowired
	public Service(Dao dao) { 
		this.dao = dao; 	
	}
	
	public Service() {
		super();
	}

	public List<Geek> trouverTousLesGeek() {
		return dao.trouverTousLesGeek();
	}

	public Geek trouverParId(long id) {
		return dao.trouverParId(id);
	}

	public boolean create(Geek geek){

	dao.persist(geek);
		return true;
	}
	
	public List<Geek> trouverGeekParLangage(String pSex, String[] langage) {
		return dao.trouverParLangage(Type.valueOf(pSex), langage);
	}
}
