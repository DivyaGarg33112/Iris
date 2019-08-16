<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${msg}</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body  style="background-color:lightgrey">
	<div align="center">
		<fieldset>
			
			<legend>Add Employee</legend>
			<form:form action="getEmployeeForm" method="post" modelAttribute="empObj">
				<table>
					<tr>
						<td>Employee Id : </td>
						<td>
						<form:input type="text" path="employeeId"/>
						<form:errors path="employeeId" cssClass="error"/>
						</td>
					</tr>
					<tr>
						<td>Employee Name : </td>
						<td>
						<form:input type="text" path="employeeName"/>
						<form:errors path="employeeName" cssClass="error"/>
						</td>
					</tr>
					<tr>
						<td>Date of Birth : </td>
						<td>
						<form:input type="date" path="dateOfBirth"/>
						<form:errors path="dateOfBirth" cssClass="error"/>
						</td>
					</tr>
				 <tr>
						<td>Email : </td>
						<td>
						<form:input type="email" path="email"/>
						<form:errors path="email" cssClass="error"/>
						</td>
					</tr>
					<tr>
						<td>Contact Number : </td>
						<td>
						<form:input type="tel" path="contactNumber"/>
						<form:errors path="contactNumber" cssClass="error"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="Add Employee"/>
						</td>
					</tr>
				</table>
			</form:form>
		</fieldset>
	</div>
	
</body>
</html>