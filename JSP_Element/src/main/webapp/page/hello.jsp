<%@ page language="java" import="java.util.* , java.sql.* , java.io.* "  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO JSP</h1> <br>
	
	hello world
	
	
	<%
	out.print("hi friends");
	int x = 10;
	
	out.print(x);
	
	List<String> list = new ArrayList<String>();
			list.add("king");  list.add("javeed");
	
	out.print(list);	
			
	%>
	
	<%!
	
	static String name;
	int  sid;
	
	public void m1(){
		
		
	}
	
	%>


</body>
</html>