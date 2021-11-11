import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SummationServlet extends HttpServlet {

    private String message;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int res = a + b;
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Sum of" + n1 + " and " + n2 + " is " + res);
    }

}