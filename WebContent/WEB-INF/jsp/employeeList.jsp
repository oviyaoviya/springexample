<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript">
function deleteRecord(id){
	
    var doIt=confirm('Do you want to delete the employee record with id ?'+id);
    alert("value of do it is: "+doIt);
  if(doIt){
	  alert("true block");
   return true;
    }
  else{
	  alert("else block");
return false;
    }
}
</script>
</head>
<body>
  
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
<th>Id</th>
<th>Name</th>
<th>dob</th>
<th>JoiningDate</th>
<th>relievingDate</th>
<th>Designation</th>
<th>AddressLine1</th>
<th>AddressLine2</th>
<th>City</th>
<th>State</th>
<th>Pincode</th>
<th>Gender</th>
<th>Skill</th>
<th>Mobile</th>
<th>Email</th>
<th>password</th>
<th>Description</th>
<th>Edit</th>
<th>Delete</th> 
<th>View</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.dob}</td>  
   <td>${emp.joiningDate}</td>
   <td>${emp.relievingDate}</td>
   <td>${emp.designation}</td> 
   <td>${emp.addressLine1}</td> 
   <td>${emp.addressLine2}</td> 
   <td>${emp.city}</td> 
   <td>${emp.state}</td> 
   <td>${emp.pincode}</td>
   <td>${emp.gender}</td> 
   <td>${emp.skill}</td> 
   <td>${emp.mobile}</td> 
   <td>${emp.email}</td> 
   <td>${emp.password}</td>
    <td>${emp.description}</td> 
   <td><a href="editemp/${emp.id}">Edit</a></td>  
  <td><a href="deleteemp/${emp.id}" onclick=" return deleteRecord(id)">Delete</a></td>  
  <td><a href="viewemp/${emp.id}">View</a></td> 
 <!--  <td><input type="button" name="delete" value="Delete" style="background-color:red;font-weight:bold;color:#ffffff;" onclick="deleteRecord(id);" ></td> -->
  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="employeeForm">Add New Employee</a>   
   <a href="success">Back</a> 
</body>
</html>