<jsp:include page="Header.jsp"/>

	<h3>Welcome ${sessionScope.userObj.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="RegistrationForm.jsp">1. Register a New Employee</a></td>
		</tr>
		<tr>
			<td><a href="viewAllEmployees">2. View All Employees</a></td>
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



