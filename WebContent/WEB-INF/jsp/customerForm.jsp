<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
.test {
color :red;
}
</style>
</head>
<body>
	<form:form method="POST" modelAttribute="customer"
		action="${pageContext.request.contextPath}/addCustomer" enctype="multipart/form-data">
		<table>
			<tr>
				<th colspan="2">Add Customer Details</th>
			</tr>
			<tr>
				<form:hidden path="id" />
				<td><form:label path="firstName">FirstName:</form:label></td>
				<td><form:input path="firstName" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="secondName">SecondName:</form:label></td>
				<td><form:input path="secondName" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="emailAddress">EmailAddress:</form:label></td>
				<td><form:input path="emailAddress"></form:input><p class="test"> ${error}</p></td>
				<p class="test"> ${error}</p>
			</tr>
			<tr>
				<td><form:label path="mobile">Mobile:</form:label></td>
				<td><form:input path="mobile"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender:</form:label></td>
				<td><form:radiobutton path="gender" value="MALE" />Male <form:radiobutton
						path="Gender" value="FEMALE" />Female</td>
			</tr>


			<tr>
				<td><form:label path="dob">Dob:</form:label></td>
				<td><form:input type="date" path="dob"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="image">ProfileImage:</form:label></td>
				<td><form:input type="file" path="image"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="address">Address:</form:label></td>
				<td><form:input path="address"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="status">Status:</form:label></td>
				<td><form:input path="status"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="Description">Description:</form:label></td>
				<td><form:input path="Description"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="blue-button" /></td>
			</tr>
		</table>
	</form:form>
	<%-- </br>
	<h3>Customer List </h3>
	<a href="addCustomer">AddCustomer</a>
	<c:if test="${!empty listOfCustomer}">
		<table class="tg">
			<tr>
				<th width="80">Id</th>
				<th width="120">First Name</th>
				<th width="120">Second Name</th>
				<th width="120">Email Address</th>
				<th width="120">Mobile Number</th>
				<th width="120">Gender</th>
				<th width="120">SDate of Birth</th>
				<th width="120">Profile Image</th>
				<th width="120">Address</th>
				<th width="120">Status</th>
				<th width="120">Description</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listOfCustomer}" var="customer">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.firstName}</td>
					<td>${customer.secondName}</td>
					<td>${customer.emailAddress}</td>
					<td>${customer.mobile}</td>
					<td>${customer.gender}</td>
					<td>${customer.dob}</td>
					<td>${customer.profileImage}</td>
					<td>${customer.address}</td>
					<td>${customer.status}</td>
					<td>${customer.description}</td>
					<td><a href="<c:url value='/updateCustomer/${customer.id}' />">Edit</a></td>
					<td><a href="<c:url value='/deleteCustomer/${customer.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>  --%>
</body>
</html>