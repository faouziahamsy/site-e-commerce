/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Client;
import entities.Produit;
import org.hibernate.Hibernate;
import services.ProduitServices;
import services.UserServices;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test {
    public static void main(String[] args) {
      //  HibernateUtil.getSessionFactory().openSession();
        UserServices us = new UserServices();
        ProduitServices ps = new ProduitServices();
       // ps.AddProduit(new Produit("dell", "dell core i5", "pc dell", 25000, "xx", 2));
      
        //us.LoginUser("fouzia@gmail.com", "1234");
       // us.CreateClient(new Client("f", "f", "0666", "eljadida", "f@gmail.com", "123"));
       // System.out.println("done");        
    }
}
