<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

th {
	background: SteelBlue;
	color: white;
}

td, th {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
	padding: 5px 10px;
}

.test {
	color: red;
}
</style>
</head>
<body>
	<form method="POST" th:object="${customer}" th:action="@{/addCustomer}"
		enctype="multipart/form-data">
		<table>
			<tr>
				<th colspan="2">Add Customer Details</th>
			</tr>
			<tr>

				<td><label>FirstName:</label></td>
				<td><input type="text" th:field="*{firstName}" /></td>
			</tr>
			<tr>

				<td><label>secondName:</label></td>
				<td><input type="text" th:field="*{secondName}" /></td>
			</tr>

			<tr>

				<td><label>EmailAddress:</label></td>
				<td><input type="text" th:field="*{emailAddress}" /></td>
			</tr>
			<tr>

				<td><label>Mobile:</label></td>
				<td><input type="text" th:field="*{mobile}" /></td>
			</tr>

			<tr>

				<td><label>Gender:</label></td>
				<td><input type="radio" value="MALE" th:field="*{gender}" />Male
					<input type="radio" value="FEMALE" th:field="*{gender}" />Female</td>
			</tr>
			<tr>

				<td><label>dob:</label></td>
				<td><input type="date" th:field="*{dob}" /></td>
			</tr>
			<tr>
				<td><label>Image:</label></td>
				<td><input type="file" th:field="*{image}" multiple="multiple" /></td>
			</tr>
			
			<tr>
				<td><label>Image:</label></td>
				<td><input type="file" th:field="*{image2}" multiple="multiple" /></td>
			</tr>
			
			<tr>

				<td><label>Address:</label></td>
				<td><input type="text" th:field="*{address}" /></td>
			</tr>

			<tr>

				<td><label>State:</label></td>
				<td><select th:field="*{state}">
						<option th:value="TamilNadu">Tamil Nadu</option>
						<option th:value="Kerala">Kerala</option>
						<option th:value="Goa">Goa</option>
						<option th:value="Gujarat">Gujarat</option>
				</select></td>
			</tr>

			<tr>

				<td><label>Languages Known:</label></td>
				<td><input type="checkbox" th:value="Tamil"
					th:field="*{language}" checked="checked" />Tamil <input
					type="checkbox" th:value="English" th:field="*{language}" />English
					<input type="checkbox" th:value="Hindi" th:field="*{language}" />Hindi
					<input type="checkbox" th:value="Malayalam" th:field="*{language}" />Malayalam
				</td>
			</tr>

			<tr>
				<td><label>Status:</label></td>
				<td><input type="text" th:field="*{status}" /></td>
			</tr>

			<tr>
				<td><label>Description:</label></td>
				<td><input type="text" th:field="*{description}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"
					class="blue-button" /></td>

			</tr>
		</table>
	</form>

</body>
</html>