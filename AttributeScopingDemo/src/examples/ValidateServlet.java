package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		//Fetching the data i.e. email and password coming from the login form
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		
		//Doing the database connectivity
		try {
			
			//driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connection create
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			/*We needed this connection object in entire web application , so we
			 * want to share it in such a way that it is accessible to everyone 
			 * in complete application so we can share it through the object of 
			 * ServletContext*/
			
			/*getServletContext() is the method which will return the object of
			 * ServletContext which has been created at Web container at the start up 
			 * of the application*/
			ServletContext context=getServletContext();
			
			//Here we are setting the object of Connection conn in the context
			//with an identifer connObj
			context.setAttribute("connObj", conn);
			
			
			PreparedStatement ps=conn.prepareStatement("select * from UserTable where email=? and password=?");
			ps.setString(1,s1);
			ps.setString(2,s2);
			
			ResultSet rs=ps.executeQuery();
			
			
			//If email or password is correct , if will get evaluated
			if(rs.next()){
			
				HttpSession session=request.getSession();
				session.setAttribute("userEmail",s1);
				
				//Here we are fetching firstName and lastNAme of the user from the
				//3rd and 4th column
				String name=rs.getString(3)+" "+rs.getString(4);
				
				
				//Now we want to share this full name of user on next page.Now bcz
				//we are using RequestDispatcher to invoke another servlet so it means
				//same request and response object will go to the next servlet so we
				//can share the name of the User in the request object
				
				
				
				//request.setAttribute(String name,Object value);
				request.setAttribute("userName",name);
				
				
				//will invoke the servlet having url pattern welcome without involving
				//client and by passing its own request and response object. 
				//Bcz same request and response objects are going so request method
				//will also be same as that of this servlet
				RequestDispatcher rd=request.getRequestDispatcher("welcome");
				rd.forward(request, response);
				
				
				
			}
			else {
				out.println("Email or Password is incorrect");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
