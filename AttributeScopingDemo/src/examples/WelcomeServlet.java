package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//Here we want to fetch the email of the user which is coming in request parameter
		//to ValidateServlet , we can access it directly bcz we have used RequestDispatcher
		String email=request.getParameter("t1");
		
		
		//Here we will fetch the full name which we have set in the previous servlet
		//Object getAttribute(String name)
		String str=(String)request.getAttribute("userName");
		
		out.println("Welcome : "+str+"<br/>");
		out.println("<a href='ComposeMail.html'>Compose</a><br/><br/>");
		
		
		try {
			
			
		/*
		 * Here we want to do database connectivity , so instead of creating the
		 * Database Connection we can access the connection object from the 
		 * object of ServletContext
		*/
		Connection conn=(Connection)getServletContext().getAttribute("connObj");
		PreparedStatement ps=conn.prepareStatement("select * from MailTable where mailTo=?");
		ps.setString(1,email);
		
		ResultSet rs=ps.executeQuery();
		
		
		while(rs.next()){
			out.println(rs.getString(3)+ " : "+rs.getString(4)+"<br/>");
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
