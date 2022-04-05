/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import data.UserDB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
/**
 *
 * @author drago
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url ="/index.jsp";
        String action = request.getParameter("action");
        if (action == null) {
            action = "return"; 
        }

        if (action.equals("return")) {
            url = "/index.jsp";   
        } 
        if (action.equals("login")){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String message = "Account does not exist";
            User user = new User(username,password);
            String path = request.getServletContext().getRealPath(getInitParameter("relativePathToFile"));
            UserDB userdb = new UserDB();
            if(userdb.userExisted(username, password, path)){
                url = "/welcome.jsp";
            }
            else {
                request.setAttribute("message", message);
            }
            request.setAttribute("user", user);
        }
        if(action.equals("register")){
            url="/register.jsp";
        }
        if(action.equals("signup")){
            url="/signup.jsp";
        }
    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);        
    }
}
