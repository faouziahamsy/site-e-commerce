/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author faouzia
 */
@Entity
public class LigneCommande implements Serializable{
    @EmbeddedId
    private LigneCommandePK commandePK;
    private double prixVente;
    private int quantité;
    @ManyToOne
    @JoinColumn(name = "produitId", insertable = false, updatable = false)
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "commandeId", insertable = false, updatable = false)
    private Commande commande;

    public LigneCommande() {
    }

    public LigneCommandePK getCommandePK() {
        return commandePK;
    }

    public void setCommandePK(LigneCommandePK commandePK) {
        this.commandePK = commandePK;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    
}
