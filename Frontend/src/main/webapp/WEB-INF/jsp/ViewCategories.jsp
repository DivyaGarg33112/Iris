<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Form</title>
</head>
<body>

<div align="center">

	<c:if test="${msg ne null}">
		<h3 style="color:green;font-style:italic;">${msg}</h3>
	</c:if>

	<h1>View Categories</h1>
	<table border="1">
		<tr>
			<th>Category Name</th>
			<th>Category Desc</th>
			<th colspan="2">Admin Operations</th>
		</tr>
		<c:forEach items="${categories}" var="category">	
			<tr>
				<td>${category.categoryName}</td>
				<td>${category.cDescription }</td>
				<td><a href="updateCategory/${category.categoryId}">Update</a></td>
				<td><a href="deleteCategory/${category.categoryId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
	
</body>
</html>