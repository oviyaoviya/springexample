<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set value="10" var="n1"></c:set>
<c:set value="20" var="n2"></c:set>
<c:out value="${n1}"></c:out><br>
<c:out value="${n2}"></c:out>
<!-- import -->
<c:import url="https://www.google.com/"></c:import>


<!-- catch -->
<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  

<c:if test="${catchtheException!=null}">
<p>The type of Exception is: ${catchtheException}<br>
 exception is :${catchtheException.message}</p>
</c:if>


<!-- choose & when -->
<c:choose>
  <c:set var="salary" value="${4000*2}"></c:set>
  <c:when test="${salary<=100}">
  <p>income is not good</p>
  </c:when>
  <c:when test="${salary>800}">
    <p>income is not good</p>
  </c:when>
</c:choose>

<c:forEach var = "list" begin = "1" end = "5">
         Item <c:out value = "${list}"/><p>
      </c:forEach>
	
	 <c:forTokens items = "Zara,nuha,roshy" delims = "," var = "names">
         <c:out value = "${names}"/><p>
      </c:forTokens>
      <c:set var="String" value="Welcome to javatpoint"/>  
  <c:set var="String" value="Welcome to oviya"/>  
<c:if test="${fn:containsIgnoreCase(String, 'oviya')}">  
   <p>Found  string<p>  
</c:if>  
</body>
</html>