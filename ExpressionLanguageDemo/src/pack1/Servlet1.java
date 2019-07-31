package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    
    	request.setAttribute("name","Divya Garg");
    	
    	ServletContext context=getServletContext();
    	context.setAttribute("designation","Senior Trainer");
    	
    	
    	HttpSession session=request.getSession();
    	session.setAttribute("employerName", "Almamamte Infotech Pvt. Ltd.");
    	
    	
    	Cookie c=new Cookie("biscuit","Marigold Biscuits");
    	response.addCookie(c);
    	
    	
    	RequestDispatcher rd=request.getRequestDispatcher("MyForm.jsp");
    	rd.forward(request, response);
    			
    			
    	
	}

	
}
