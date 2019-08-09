<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h1 align="center">Add Category Form</h1>
	<hr/>
	
	<br/><br/><br/>
	
	<form:form  action="addCategory" modelAttribute="categoryObj" method="post"> 
		<table>
			<tr>
				<td>Category Id : </td>
				<td><form:input path="categoryId"/></td>
			</tr>
			<tr>
				<td>Category Name : </td>
				<td><form:input path="categoryName"/></td>
			</tr>
			<tr>
				<td>Category Description : </td>
				<td><form:input path="description"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Category"></td>
			</tr>
		</table>
	</form:form>
	
	
</body>
</html>