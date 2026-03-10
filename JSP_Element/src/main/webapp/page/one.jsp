<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String name = "javeed";

   session.setAttribute("name",name);
   
 String myname = (String)  session.getAttribute("name");

 		out.print(myname);
 		
 		application.setAttribute("city","Hyderabad");

%>

<BR>

Name using JSP EXP: <%= session.getAttribute("name") %>

<br>

City Name using EL Exp:  ${ city }



</body>
</html>