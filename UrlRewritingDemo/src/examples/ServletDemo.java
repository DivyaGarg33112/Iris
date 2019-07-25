package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<div align='center'>");
		out.println("<h1>Enter first name , last name or part of any");
		out.println("<form  method='post'><input type='text' name='t1'>"
				+ "<input type='submit' value='Search'></form>");
		out.println("</div>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a=request.getParameter("t1");
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement ps=conn.prepareStatement
				("select * from Usertable where firstname like '%"+a+"%' or lastname like '%"+a+"%'");
		ResultSet rs=ps.executeQuery();
		
		doGet(request,response);
		
		out.println("<div align='center'>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>Email</th>");
		out.println("<th>Password</th>");
		out.println("<th>First Name</th>");
		out.println("<th>Last Name</th>");
		out.println("<th colspan='2'>Operations</th>");
		out.println("</tr>");
		while(rs.next()){
			out.println("<tr>");
			
			String em=rs.getString(1);
			
			out.println("<td>"+em+"</td>");
			out.println("<td>"+rs.getString(2)+"</td>");
			out.println("<td>"+rs.getString(3)+"</td>");
			out.println("<td>"+rs.getString(4)+"</td>");
			out.println("<td><a href='Delete?gg="+em+"'>Update</a></td>");
			out.println("<td><a href=''>Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table></div>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}


//?name=value&&nam2=value
