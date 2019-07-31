
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
<style>
	body {
		background-image: url("images\\error.png");
	}
</style>
</head>
<body> 
	<h3 style="color:red;text-align:center">
		Exception is : ${pageContext.exception}
		
	</h3>
</body>
</html>