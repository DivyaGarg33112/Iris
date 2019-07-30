<jsp:include page="Header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<h4 style="color:red">
		<c:if test="${msg ne null}">
			${msg}
		</c:if>
	</h4>		
	<fieldset>
		<legend>Login Form</legend>
		<form action="register" method="post">	
			<table>
				<tr>
					<td>Employee Name : </td>
					<td>
						<input type="text" name="ename" placeholder="Enter your Name" required/>
					</td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
						Male <input type="radio" name="gender" value="m" checked/>
						Female <input type="radio" name="gender" value="f" />
					</td>
				</tr>
				<tr>
					<td>Email  : </td>
					<td>
						<input type="email" name="email" placeholder="Enter your Email" required/>
					</td>
				</tr>
				<tr>
					<td>Contact Number  : </td>
					<td>
						<input type="text" name="contactNo" placeholder="Enter your Contact No" required/>
					</td>
				</tr>
				<tr>
					<td>Qualification  : </td>
					<td>
						<input type="text" name="qualification" placeholder="Enter your Qualification" required/>
					</td>
				</tr>
				<tr>
					<td>Password : </td>
					<td>
						<input type="password" name="emppass" placeholder="Enter your password" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Register"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>

</body>
</html>



