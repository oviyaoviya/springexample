<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
 <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="Welcome to oviya"/>  
  
<c:if test="${fn:containsIgnoreCase(String, 'oviya')}">  
   <p>Found oviya string<p>  
</c:if>  
<%-- <c:import var="result" url="http://www.google.com"/>  
<c:out value="${result}"/>   --%>
  
<c:if test="${fn:containsIgnoreCase(String, 'oviYa')}">  
   <p>Found OVIYA string<p>  
</c:if>  

<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>Index-1 : ${fn:indexOf(string1, "first")}</p>  
<p>Index-2 : ${fn:indexOf(string2, "second")}</p>  


<c:set var="str1" value="    Welcome to       JSP programming         "/>  
<p>length of string :${fn:length(str1)}</p>	
<p>trim:${fn:trim(str1)}</p>

<c:set var="string" value="This is the first string."/>  
<p>substring of: ${fn:substring(string, 3, 17)} </p>
<p>substring of: ${fn:substring(string, 10, 14)} </p>
<c:set var="string" value="welcome oviya"/>  
${fn:substringAfter(string, "welcome")} 

	<c:set var = "balance" value = "1250003.350" />
	<fmt:parseNumber var = "i" type = "number" value = "${balance}" /> 
	parse number <c:out value="${i}"></c:out>
	<fmt:parseNumber var = "j" type = "number" integerOnly="true" value = "${balance}" /> 
	parse number <c:out value="${j}"></c:out>
	
	<c:set var="date" value="12-08-2016" />  
  
<fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
<p><c:out value="${parsedDate}" /></p>  


<h2>Vegetable Information:</h2>  
<c:set var="vegetable">  
<vegetables>  
    <vegetable>  
      <name>onion</name>  
      <price>40/kg</price>  
    </vegetable>  
 <vegetable>  
      <name>Potato</name>  
      <price>30/kg</price>  
    </vegetable>  
 <vegetable>  
      <name>Tomato</name>  
      <price>90/kg</price>  
    </vegetable>  
</vegetables>  
</c:set>  
<x:parse xml="${vegetable}" var="output"/>  
<b>Name of the vegetable is</b>:
	<x:out select="$output/vegetables/vegetable[1]/name" />
	<br>  
<b>Price of the Potato is</b>:  
<x:out select="$output/vegetables/vegetable[2]/price" />  
</body>
</html>