<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>PRODUCT JSP PAGE</h1>
 
 	<jsp:useBean id="p1"  class="com.wipro.beans.Product"  scope="session"></jsp:useBean>
 		
 		
 		
 	<%-- <jsp:setProperty property="pid" name="p1"  param="pid"/>   
 	<jsp:setProperty property="pname" name="p1"  param="pname" />
 	<jsp:setProperty property="price" name="p1"  param="price"/> --%>
 	
 	<jsp:setProperty property="*" name="p1"/>
 	
 
 	<jsp:include page="success.jsp"></jsp:include>



 	
 	

</body>
</html>