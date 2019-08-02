<%@page import="com.portal.listeners.SessionCounterListener"%>
<jsp:include page="Header.jsp"/>

	<h3>Welcome ${userObj.employeeName}</h3>
	
	<br/>
	
	<h3>No of Logged In User :  <%=SessionCounterListener.getActiveSessions() %> </h3>
	
	<table>
		<tr>
			<td><a href="ViewProfile.jsp">1. View Profile</a></td>
		</tr>
		<tr>
			<td><a href="UpdateProfile.jsp">2. Update Profile</a></td>
		</tr>
		<tr>
			<td>3. Add your Address</td>
		</tr>
		<tr>
			<td><a href="ChangePass.jsp">4. Change Password</a></td>
		</tr>
		<tr>
			<td><a href="logOut">5. LogOut</a></td>
		</tr>
		
	</table>
	
</body>
</html>



