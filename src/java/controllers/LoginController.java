/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.UserServices;

/**
 *
 * @author DELL
 */
@WebServlet(name = "/Login", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {
private UserServices loginServices;
 
public void init() {
        loginServices = new UserServices();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
       if(loginServices.LoginUser(email,password)){
           
           // response.sendRedirect("login-success.jsp");
       RequestDispatcher dispatcher = request.getRequestDispatcher("login-success.jsp");
         dispatcher.forward(request, response);
       } else {
          throw new Exception("Login not successful..");
      }
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (Exception ex) {
        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
