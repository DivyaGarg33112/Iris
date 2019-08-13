<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Form</title>
</head>
<body>

<div align="center">
	<fieldset>
		<legend>${frmLabel}</legend>
		<f:form action="${pageContext.request.contextPath}/submitCategory" method="post" modelAttribute="cObj">
			<table>
				<c:if test="${cObj.categoryId ne 0}">
				<tr>
					<td>Category Id : </td>
					<td><f:input type="text" path="categoryId" readonly="true"/>
				</tr>
					
				</c:if>
				<tr>
					<td>Category Name : </td>
					<td><f:input type="text" path="categoryName"/>
				</tr>
				<tr>
					<td>Category Desc : </td>
					<td><f:input type="text" path="cDescription"/>
				</tr>
				<tr>
					<td>
						<input type="submit" value="${btnLabel}">
					</td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</div>
	
</body>
</html>