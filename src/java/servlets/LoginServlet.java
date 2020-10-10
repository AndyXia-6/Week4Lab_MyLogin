/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 762212
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String username = request.getParameter("username");
        
                String password = request.getParameter("password");
                
                AccountService userService = new AccountService();
                User user = userService.login(username, password);
                
                request.setAttribute("username", username);
                
                if (user != null)
                {
                    response.sendRedirect("home");  
                    request.getSession().setAttribute("userObject", user);
                }
                else
                {
                            request.setAttribute("message", "Invalid Data");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);                    
                }
                        
    }

}
