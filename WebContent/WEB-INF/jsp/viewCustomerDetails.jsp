<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>

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
<form  th:action="@{/viewCustomerDetails}">
<h1>Customer Details</h1>
<table>

  <tr>
 <th>Customer Description</th>
  <th>Customer Details</th>
 
  </tr>
  <tr>
    <td>Customer FirstName</td>
    <td th:text="${viewOfCustomer.firstName}"></td>

  </tr>
   <tr>
    <td>Customer SecondName</td>
    <td th:text="${viewOfCustomer.secondName}"></td>

  </tr>
  
  <tr>
    <td> Customer Email</td>
    <td th:text="${viewOfCustomer.emailAddress}"></td>
  </tr>
  
  <tr>
    <td> Customer Mobile</td>
    <td th:text="${viewOfCustomer.mobile}"></td>
  </tr>
  <tr>
    <td> Customer Gender</td>
   <td th:text="${viewOfCustomer.gender}"></td>
  </tr>
  <tr>
    <td>Customer Date of Birth</td>
   <td th:text="${viewOfCustomer.dob}"></td>

  </tr>
 
   <tr>
    <td> Customer Image</td>
   
    <td><img th:src="@{'data:image/jpeg;base64,'+ ${imageSource}}" /></td>
   
  </tr>
  
  <tr>
    <td> Customer Image2</td>
   
    <td><img th:src="@{'data:image/jpeg;base64,'+ ${imageSource}}" /></td>
   
  </tr>
  
   <tr>
    <td> Customer Address</td>
  <td th:text="${viewOfCustomer.address}"></td>
  </tr>
   <tr>
    <td> Customer State</td>
 <td th:text="${viewOfCustomer.state}"></td>
  </tr>
   <tr>
    <td> Customer Languages known</td>
    <td th:text="${viewOfCustomer.language}"></td>
  </tr>
   <tr>
    <td> Customer Status</td>
   <td th:text="${viewOfCustomer.status}"></td>
  </tr>

  <tr>
    <td> Customer Description</td>
    <td th:text="${viewOfCustomer.description}"></td>
  </tr>

 </table>
  </form>
</body>
</html>