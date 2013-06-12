package com.kozlowski.geektic;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private long id;    
    private String nom;    
    private String prenom;    
    private String email;

    /**
     * Constructeur de la classe Geek
     */
    public Geek() {
        super();
    }
    
    /**
     * 
     * @param id identifiant du geek
     * @param nom nom du geek
     * @param prenom prenom du geek
     * @param email email du geek
     */
    public Geek(Long id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
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
    
    
    
}