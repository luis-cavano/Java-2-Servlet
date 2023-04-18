package exservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class PrimeiroServlet  extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            String n = request.getParameter("nome"); 
            //response.getWriter().print("Olá "+n);
            request.getRequestDispatcher("/index.jsp");
    }
}