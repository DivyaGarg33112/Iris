<%@page import="java.util.List,com.portal.entities.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="Header.jsp"/>

	
	<table>
		<tr>
			<th>Emp Id</th>
			<th>Emp Name</th>
			<th>Gender</th>
			<th>Contact No</th>
			<th>Qualification</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.employeeName}</td>
				<td>${e.gender}</td>
				<td>${e.contactNo}</td>
				<td>${e.qualification}</td>
				<td>${e.emailAddress}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>



