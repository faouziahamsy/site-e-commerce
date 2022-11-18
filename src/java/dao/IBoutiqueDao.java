/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Categorie;
import entities.Produit;
import java.util.List;

/**
 *
 * @author faouzia
 */
public interface IBoutiqueDao {
    public Long AddCategorie (Categorie c);
    public List<Categorie> listCategories();
    public Categorie getCategorie(int idCat);
    public void deleteCategorie(int idCat);
    public void updateCategorie(Categorie c);
    
    
    public Long AddProduit(Produit p, Long idCat);
    public List<Produit> listProduits();
    public List<Produit> produitParMotCle(String motCle);
    public List<Produit> produitsParCategorie(int idCat);
    public List<Produit> produitSelectionnes();
    public Produit getProduits(int idProduit);
    public void deleteProduit(int idProduit);
    public void updateProduit(Produit p);
    
    
  
}
