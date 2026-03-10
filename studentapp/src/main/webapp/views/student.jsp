<%@ page language="java" isELIgnored="false"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered Students</title>
</head>
<body>

<h2>Registered Students</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Course</th>
    <th>Fee</th>
</tr>

<c:forEach var="s" items="${students}">
<tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.course}</td>
    <td>${s.fee}</td>
</tr>
</c:forEach>

</table>

</body>
</html>
