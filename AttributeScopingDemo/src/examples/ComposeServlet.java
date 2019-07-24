package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/compose")
public class ComposeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String to=request.getParameter("t1");
		String sub=request.getParameter("t2");
		String con=request.getParameter("t3");
		
		try {
			Connection conn=(Connection)getServletContext().getAttribute("connObj");
			PreparedStatement ps=conn.prepareStatement("insert into MailTable values(mailidseq.nextval,?,?,?,?)");
			ps.setString(1, to);
			
			HttpSession session=request.getSession();
			String from =(String)session.getAttribute("userEmail");
			
			ps.setString(2,from);
			ps.setString(3,sub);
			ps.setString(4,con);
			
			int i=ps.executeUpdate();
			if(i!=0){
				out.println("Mail sent succesfully...");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
