<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Success Page</h3>
	
<%-- <p>	your are successfully logged in and your email address is ${email}</p> --%>
<%! String name="oviya"; %>
<%="declared name is :"+name %>
<% 
String email=request.getParameter("email"); 
String password=request.getParameter("password"); 
/* out.print("Name: "+email+" Password: "+password); */
%> 
<% 
String emailId=request.getAttribute("email").toString();
String Repassword=request.getAttribute("password").toString(); 
/* out.print("Email: "+emailId+" RePassword: "+Repassword); */
%> 
<%="Email: "+emailId+" RePassword: "+Repassword %>



	<br><br>
	<a href="logout">Logout</a>
	<a href="viewEmployee">ViewEmployeeListing</a>
	<a href="getAllCountries">GetAllCountries</a>
</body>
</html>