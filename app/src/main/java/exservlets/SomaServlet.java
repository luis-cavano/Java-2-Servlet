import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/soma")
public class SomaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/soma.jsp");
        dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));
            int respSoma = numero1+numero2;

            request.setAttribute("resultado", respSoma);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/soma.jsp");
            dispatcher.forward(request, response);
    }    
}
