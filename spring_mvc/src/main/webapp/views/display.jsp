<%@ page language="java"  import="com.example.demo.entity.*"  isELIgnored="false"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>DISPLAY JSP PAGE</h1>

<%
Product product=(Product)session.getAttribute("product");
 out.print(product);

%>
<br>


${ product }

</body>
</html>