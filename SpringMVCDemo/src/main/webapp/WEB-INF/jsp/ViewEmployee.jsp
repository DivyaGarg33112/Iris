<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${msg}</title>
</head>
<body  style="background-color:lightgrey">
	<div align="center">
		<fieldset>
			<legend>Add Employee</legend>
				<table>
					<tr>
						<td>Employee Id : </td>
						<td>
						${empObj.employeeId}
						</td>
					</tr>
					<tr>
						<td>Employee Name : </td>
						<td>
						${empObj.employeeName}
						</td>
					</tr>
					<tr>
						<td>Date of Birth : </td>
						<td>
						${empObj.dateOfBirth}
						</td>
					</tr>
		 		<tr>
						<td>Email : </td>
						<td>
						${empObj.email}
						</td>
					</tr>
					<tr>
						<td>Contact Number : </td>
						<td>
						${empObj.contactNumber}
						</td>
					</tr>
					
				</table>
			
		</fieldset>
	</div>
	
</body>
</html>