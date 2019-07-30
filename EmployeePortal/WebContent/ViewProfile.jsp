<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Login Form</legend>
			
			<table>
				<tr>
					<td>Employee Id : </td>
					<td>
						${userObj.employeeId}
					</td>
				</tr>
				<tr>
					<td>Employee Name : </td>
					<td>
						${userObj.employeeName}
					</td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
						${userObj.gender}
					</td>
				</tr>
				<tr>
					<td>Email  : </td>
					<td>
						${userObj.emailAddress}
					</td>
				</tr>
				<tr>
					<td>Contact Number  : </td>
					<td>
						${userObj.contactNo}
					</td>
				</tr>
				<tr>
					<td>Qualification  : </td>
					<td>
						${userObj.qualification}
					</td>
				</tr>
				
				
			</table>
		</form>
	</fieldset>
	
	</div>

</body>
</html>



