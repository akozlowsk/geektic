package com.kozlowski.geektic;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.SequenceGenerator;


/**
*
* @author adam kozlowski
*/

@Entity
public class Geek implements Serializable {
    

private static final long serialVersionUID = -8776320965095867751L;

    @Id
    @SequenceGenerator(name = "generateurDeGeek", sequenceName = "GEEK_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generateurDeGeek")

    @Column(name = "id_geek")
    private long id;    
    private String nom;    
    private String prenom;   
    private String email;
    private String naissance;
    private String avatar;
    private Type type;
    @ManyToMany(mappedBy = "geek")
    private List<Interet> langage;


    /**
     * Constructeur de la classe Geek
     */
    public Geek() {
    	this.langage = new ArrayList<Interet>();
    }
    
    /**
     * 
     * @param id identifiant du geek
     * @param nom nom du geek
     * @param prenom prenom du geek
     * @param email email du geek
     * @param naissance date de naissance du geek
     * @param avatar lien vers l'avatar du geek
     * @param type le type de Geek
     */
    public Geek(Long id, String nom, String prenom, String email, String naissance, String avatar, Type type, List<Interet> langage) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;       
        this.email = email;
        this.naissance = naissance;
        this.avatar = avatar;
        this.type = type;
        this.langage = langage;
    }
    
    /**
     * récuperer l'identifiant du geek
     * @return retourne l'identifiant du geek
     */
    public long getId() {
        return id;
    }
    
    /**
     * Modifier l'identifiant du geek
     * @param id le nouvel identifiant
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * récuperer le nom du geek
     * @return retourne le nom du geek
     */
    public String getNom() {
        return nom;
    }

    /**
     * modifier le nom du geek
     * @param nom le nouveau nom du geek
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * récuperer le prénom du geek
     * @return retourne le prénom du geek
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * modifier le prenom du geek
     * @param prenom le nouveau prenom du geek
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * recuperer l'adresse mail du geek
     * @return retourne l'adresse mail du geek
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * modifier l'adresse mail du geek
     * @param email la nouvelle adresse mail du geek
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * recuperer la date de naissance du geek
     * @return retourne la date de naissance du geek
     */
    public String getNaissance() {
        return naissance;
    }
    
    /**
     * modifier la date de naissance du geek (YYYY-MM-DD)
     * @param naissance la nouvelle date de naissance du geek
     */
    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }
    
    /**
     * recuperer l'avatar du geek
     * @return retourne le lien vers l'avatar du geek
     */
    public String getAvatar() {
        return avatar;
    }
    
    /**
     * modifier le lien vers l'avatar du geek
     * @param avatar le nouveau lien vers l'avatar du geek
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
    /**
     * recupere le sexe du geek
     * @return le sexe du geek 
     */
    public Type getType(){
    	return this.type;
    }
    
    /**
     * modifier le sexe du Geek
     * @param type le nouveau sexe du geek
     */
    public void setType(Type type){
    	this.type = type;
    }
    
    /**
     * recupere la liste des langages du geek
     * @return liste des langages du geek
     */
    public List<Interet> getLangage(){
    	return this.langage;
    }
    
    /**
     * modifier les langages du geek
     * @param langage nouvelle liste de langage
     */
    public void setLangage(List<Interet> langage){
    	this.langage = langage;
    }   
    
}