<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="MyErrorPage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demos</title>
</head>
<body>

	<!--  want to print the data coming in request parameter -->
	Name : <c:out value="${param.t1}" default="Not Specified	"/><br/>	
	Name : <c:out value="Divya Garg" default="Not Specified	"/>	<br/>
	Name : <c:out value="${20*30}" default="Not Specified	"/>	<br/>
	Name : <c:out value="${20 >= 30}" default="Not Specified	"/>	<br/>
	
	
	<!--
	 c:set :- is used to set an attribute in the specified scope
	 . default scope is page
		It is same as session.setAttribute("salary",50000);
	 -->
	 <c:set var="salary" value="50000" scope="session"/>
		
	<c:if test="${salary gt 20000}">
		Salary is Gud...
	</c:if>
	
	<br/>Before Salary = <c:out value="${sessionScope.salary}"/>
	
	<c:remove var="salary" scope="session"/>
	
	<br/>After Salary = <c:out value="${sessionScope.salary}"/>

	<br/>
	<c:set var="salary" value="30000" scope="session"/>
	<c:choose>
		<c:when test="${salary lt 20000}">
			 Salary is low
		</c:when>
		<c:when test="${salary le 30000}">
			Salary is OK..
		</c:when>
		<c:otherwise>
			Salary is Gud..
		</c:otherwise>
	</c:choose>
	
	<%--
	<%
	
		int x=30/0;
	%> --%>
	
	<%--
	<c:catch var="excep">
	<%
	
		int x=30/0;
	%>
	</c:catch>
	
	
	<br/>Exception is : <c:out value="${excep}"/>
	 --%>
	 
	 <!-- c:forEach -->
	 
	 <c:forTokens items="Ragini,Nilam,Priyanka,Sagnika" delims="," var="gname">
	 	<br/> <c:out value="${fn:toUpperCase(gname)}"/>		
	 </c:forTokens>
	 
	 <br/>
	 
	 <c:import url="MyForm.jsp"/>
	 
</body>
</html>






