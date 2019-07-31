
<script src="js\\checkpass.js"></script>
	

<jsp:include page="Header.jsp"/>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<h4 style="color:red">
		<c:if test="${msg ne null}">
			${msg}
		</c:if>
	</h4>
	<fieldset>
		<legend>Login Form</legend>
		<form action="change" method="post" onsubmit="return check()">	
			<table>
				<tr>
					<td>New Password : </td>
					<td>
						<input type="password" name="pass1" id="p1" placeholder="Enter your password" required/>
					</td>
				</tr>
				<tr>
					<td>Re-enter Password : </td>
					<td>
						<input type="password" name="pass2" id="p2" placeholder="Enter your password" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Change Password"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>

</body>
</html>



