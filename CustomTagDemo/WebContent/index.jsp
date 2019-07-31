<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="cust" uri="/WEB-INF/DateTag.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<cust:getDate/>
	
	<br/>
	
	<cust:reverseString input="HelloJSP"/><br/>
	<cust:reverseString input="${param.t1}"/><br/>
	
	<cust:looper end="${param.t2}" start="${param.t3}">
		Hi I am Custom Tag <br/>
	</cust:looper>
	
</body>
</html>