<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td>1. Register a New Employee</td>
		</tr>
		<tr>
			<td>2. View All Employees</td>
		</tr>
		<tr>
			<td>3. Search Employee By Id</td>
		</tr>
		<tr>
			<td>4. Change your Password</td>
		</tr>
	</table>
	
</body>
</html>



