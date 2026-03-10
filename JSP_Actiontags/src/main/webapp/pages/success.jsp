<%@page import="com.wipro.beans.Product"%>
<%@ page language="java" import="com.wipro.beans.Product" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SUCCESS PAGE</h1>


  Session using Scriplet <br>
  <% 
  
  	Product p = (Product)	session.getAttribute("p1");
  
  		out.print(p);
  
  %>
  
  <br>
  Session using JSP Exp <br>
  
  <%=  session.getAttribute("p1") %>
  
  <br>
  Session using EL Exp <br>
  
   ${ p1 }
  
  <br>
  
  
  Using getProperty in jsp action tag <br>
  
  <jsp:useBean id="p1"  class="com.wipro.beans.Product" scope="session"></jsp:useBean>
  
  	<jsp:getProperty property="pid" name="p1" />
  	<jsp:getProperty property="pname" name="p1"/>
  	<jsp:getProperty property="price" name="p1"/>
  
  
  
  
  
  
  
  
  

</body>
</html>