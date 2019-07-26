<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td>1. View Profile</td>
		</tr>
		<tr>
			<td>2. Update Profile</td>
		</tr>
		<tr>
			<td>3. Add your Address</td>
		</tr>
		<tr>
			<td>3. Change Password</td>
		</tr>
		
	</table>
	
</body>
</html>



