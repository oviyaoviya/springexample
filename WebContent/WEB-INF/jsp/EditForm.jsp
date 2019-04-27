<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee Details</h1>
	<form method="post" action="add" id="employeeProfile">
		<table>
			<tr>
				<td>Employee Name:</td>
				<td> <%= request.getParameter("name")%></td>
			</tr>
			<tr>
				<td>Employee Dob:</td>
				<td><input name="Dob" /></td>
			</tr>

			<tr>
				<td>Designation :</td>
				<td><select name="designation">
						<option value="1">Java</option>
						<option value="2">PHP</option>
						<option value="2">PHP</option>
				</select></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input name="Address"/></td>
			</tr>
			<tr>
				<label>Gender</label>
				<label><input type="radio" name="Male" value="male">Male</label>
				<label><input type="radio" name="Female">Female</label>
			</tr>
			<tr>
                <label>Skill</label>
                 <td><input type="checkbox" name="C">C</td>
                 <td><input type="checkbox" name="C++">C++</td>
                 <td><input type="checkbox" name="C#">C#</td>
                 <td><input type="checkbox" name="java">Java</td>
                 <td><input type="checkbox" name="php">PHP</td>
			<tr>
			
			<tr>
			<td>Phone Number</td>
			<td><input type="text" name="phone"> </td>
			</tr>
			<td>Phone Number</td>
			<td><input type="text" name="email"> </td>
			</tr>
			<td>description</td>
			<td><textarea rows="5" cols="5"></textarea> </td>
			</tr>
				<td><input type="submit" value="update" /></td>
			</tr>
		</table>
	</form>

</body>
</html>