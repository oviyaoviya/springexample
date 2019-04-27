<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% String val = request.getParameter("name"); %> 

 <% String value = request.getParameter("AddressLine1"); %> 
<h1>Edit Employee</h1>  
       <form:form method="POST" action="/springexample/editsave">    
       <table>
       <tr>
				<td>Employee Id:</td>
				<td><input type="hidden" name="id" value="1"/></td>
			</tr>
			
			<tr>
				<td>Employee Name:</td>
				<td><input name="name" value="${employee.name}" id="name" /></td>
			</tr>
			
			 <tr>
				<td>Employee Dob:</td>
				<td><input type="date" value="${employee.dob}" name="dob" id="dob" /></td>
			</tr> 
              
               <tr>
				<td>Employee Joining Date:</td>
				<td><input type="date" value="${employee.joiningDate}" name="joiningDate" id="joiningDate" /></td>
			</tr>  
			<tr>
				<td>Employee Relieving Date:</td>
				<td><input type="date" value="${employee.relievingDate}" name="relievingDate" id="relievingDate" /></td>
			</tr>  
			
			<tr>
				<td>Designation :</td>
				<td><select name="designation" id="designation" value="${employee.designation}">
						<option value="Java">Java</option>
						<option value="php">PHP</option>
						<option value="C">C</option>	
				</select></td> 
			</tr>
			
			<tr>
				<td>AddressLine1</td>
				<td><input name="AddressLine1" value="${employee.addressLine1}" id="AddressLine1" /></td>
			</tr>
			<tr>
				<td>AddressLine2</td>
				<td><input name="AddressLine2" value="${employee.addressLine2}" /></td>
			</tr>
			<tr>
				<td>city</td>
				<td><input name="city" value="${employee.city}"/></td>
			</tr>
			<tr>
				<td>state</td>
				<td><input name="state" value="${employee.state}" /></td>
			</tr>
			<tr>
				<td>pincode</td>
				<td><input name="pincode" value="${employee.pincode}" /></td>
			</tr>
			
			
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" name="gender" value="MALE" <c:if test="${employee.gender eq 'MALE'}">checked="checked" </c:if> />Male</td>
				<td><input type="radio" name="gender" value="FEMALE" <c:if test="${employee.gender eq 'FEMALE'}"> checked="checked" </c:if> />Female</td>
			</tr>
			<c:if test = "${fn:contains(employee.skill, 'c')}"> checked </c:if>
			
			<tr>
				<td><label>Skill</label></td>

				<td><input type="checkbox" name="skill"  value="c" <c:if test = "${fn:contains(employee.skill, 'c')}"> checked </c:if>>C</td>
				<td><input type="checkbox" name="skill" value="C++" <c:if test = "${fn:contains(employee.skill, 'C++')}"> checked </c:if>>C++</td>
				<td><input type="checkbox" name="skill" value="c#" <c:if test = "${fn:contains(employee.skill, 'c#')}"> checked </c:if>>C#</td>
				<td><input type="checkbox" name="skill" value="java" <c:if test = "${fn:contains(employee.skill, 'java')}"> checked </c:if>>Java</td>
				<td><input type="checkbox" name="skill" value="php" <c:if test = "${fn:contains(employee.skill, 'php')}"> checked </c:if>>PHP</td>
			<tr>
			                      
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="mobile" value="${employee.mobile}"></td>
			</tr>
			
			<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<c:out value="${employee.email}" />" ></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="${employee.password}"></td>
			</tr>
			
			<tr>
			<td>description</td>
			<td><textarea rows="5" cols="5" name="description" value="${employee.description}"></textarea></td>
			</tr>
			<tr>
			<td><input type="submit" value="save" /></td>
			</tr>
		</table>
        <%-- <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>  --%>   
       </form:form>    
</body>
</html>