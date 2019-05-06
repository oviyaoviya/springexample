<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  width:25%;
  float-right;500px;

}
th, td {
  padding: 5px;
}
th {
  text-align: left;
}
</style>
<body>
<form action="viewemp">
<h1>Employee Details</h1>
<table>

  <tr>
 <th>Employee Description</th>
  <th>Employee Details</th>
 
  </tr>
  <tr>
    <td>Employee Name</td>
    <td>${employee.name}</td>

  </tr>
  <tr>
    <td>Employee Date of Birth</td>
    <td> ${employee.dob}</td>

  </tr>
  <tr>
    <td>Employee JoiningDate</td>
    <td>${employee.joiningDate}</td>
  </tr>
  
   <tr>
    <td>Employee RelievingDate</td>
    <td>${employee.relievingDate}</td>
  </tr>
  
   <tr>
    <td>Employee Designation</td>
    <td>${employee.designation}</td>
  </tr>
   <tr>
    <td>Employee AddressLine1</td>
    <td>${employee.addressLine1}</td>
  </tr>
   <tr>
    <td> Employee AddressLine2</td>
    <td> ${employee.addressLine2}</td>
  </tr>
   <tr>
    <td> Employee City</td>
    <td>${employee.city}</td>
  </tr>
   <tr>
    <td> Employee State</td>
    <td>${employee.state}</td>
  </tr>
   <tr>
    <td> Employee Pincode</td>
    <td>${employee.pincode}</td>
  </tr>
   <tr>
    <td> Employee Gender</td>
    <td>${employee.gender}</td>
  </tr>
   <tr>
    <td> Employee Skill</td>
    <td>${employee.skill}</td>
  </tr>
   <tr>
    <td>Employee Mobile</td>
    <td> ${employee.mobile}</td>
  </tr>
<tr>
    <td> Employee Email</td>
    <td>${employee.email}</td>
  </tr><tr>
    <td> Employee Password</td>
    <td> ${employee.password}</td>
  </tr>
  <tr>
    <td> Employee Description</td>
    <td>${employee.description}</td>
  </tr>

 </table>
  </form>
 <br><br>
<a href="../viewEmployee">Back</a>
</body>
</html>