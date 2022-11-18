/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author faouzia
 */
@Entity
public class Marque implements Serializable{
    @Id
    private int id ;
    private String nom;
    @OneToMany(targetEntity=Produit.class,mappedBy = "marque", fetch = FetchType.EAGER)
    List<Produit> produits;
    public Marque() {
    }

    public Marque(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
