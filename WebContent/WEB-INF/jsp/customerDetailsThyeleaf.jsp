<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
<title>Insert title here</title>
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
</style>
</head>
<body>
	<h3>Customer List</h3>
	<table>
		<thead>
			<tr>
				<th width="80">Id</th>
				<th width="120">First Name</th>
				<th width="120">Second Name</th>
				<th width="120">Email Address</th>
				<th width="120">Mobile Number</th>
				<th width="120">Gender</th>
				<th width="120">Date of Birth</th>
				<th width="120">Profile Image</th>
					<th width="120">Profile Image2</th>
				<th width="120">Address</th>
				<th width="120">State</th>
				<th width="120">Language</th>
				<th width="120">Status</th>
				<th width="120">Description</th>
				<th width="60">Edit</th>
				<th width="60">View</th>
				<th width="60">Delete</th>
				
			</tr>
		</thead>
		<tr th:each=" customerTwo : ${listOfCustomer} ">
			<td th:text="${customerTwo.id}"></td>
			<td th:text="${customerTwo.firstName}"></td>
			<td th:text="${customerTwo.secondName}"></td>
			<td th:text="${customerTwo.emailAddress}"></td>
			<td th:text="${customerTwo.mobile}"></td>
			<td th:text="${customerTwo.gender}"></td>
			<td th:text="${customerTwo.dob}"></td>
			<td th:text="${customerTwo.profileImage}"></td>
			<td th:text="${customerTwo.profileImage2}"></td>
			<td th:text="${customerTwo.address}"></td>
			<td th:text="${customerTwo.state}"></td>
			<td th:text="${customerTwo.language}"></td>
			<td th:text="${customerTwo.status}"></td>
			<td th:text="${customerTwo.description}"></td>
			<td><a th:href="@{'/updateCustomer/' + ${customerTwo.id}}">Edit</a></td>
			<td><a th:href="@{'/viewCustomerDetails/' + ${customerTwo.id}}">View</a></td>
			<td><a th:href="@{'/deleteCustomer/' + ${customerTwo.id}}">Delete</a></td>
			
		</tr>
	</table>

</body>
</html>