<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression Language</title>
</head>
<body>
	
	
	
	<!-- 
	set is the jstl tag which will set one attribute in the specified scope.
	if scope has  not been specified then by default will set the attribute
	in page scope -->
	<c:set var="sp" value="Java , Salesforce" scope="page"/>
	
	
	<!--
	requestScope,applicationScope or sessionScope are not the objects of
	HttpServletRequest , ServletContext or HttpSession .  They are the maps 
	which have stored the data of request , context or session in key 
	and value pair. 
	 -->
	Name 		   : ${requestScope.name} <br/>
	Designation    : ${applicationScope.designation }<br/>
	Employer       : ${sessionScope.employerName } <br/>
	Specialization : ${pageScope.sp} <br/>
	
	<!-- param.t1 is equivalent to request.getParameter("t1") -->
	Textfield's Data : ${param.t1}
 	
 	<br/>
 	
 	Selected Qualifications are :
 	
 	<c:forEach begin="0" end="3" var="i">
 		${paramValues.qualification[i]}
 	</c:forEach> 
 	
 	<br/>
 	
 	Header Info :
 	<hr/>
 
 	Accept :  ${header.accept}<br/>
 	Host   : ${header.host}
 	 <br/>
 	 
 	 Cookie : ${cookie.biscuit.value}
 	
 	<br/>
 	
 	<!-- initParam is same as config.getInitParameter(); -->
 	
 	
 	<!-- HttpServletRequest has a method getMethod which will return the type
 	of method used for making request -->
 	Method of request : 
 	<%=request.getMethod() %>
 	
 	${pageContext.request.method}
	<!-- pageContext is an implicit object in EL which can be used
	to access the object of HttpServletRequest , HttpSession or ServletContext
	in EL -->
	
	<br/>
	
	
</body>
</html>








