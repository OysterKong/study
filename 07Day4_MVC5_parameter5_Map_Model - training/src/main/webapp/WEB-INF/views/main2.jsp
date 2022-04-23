<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main2.jsp</h1>
${username}<br>
${age}<br>
${address}
<hr>

<%= request.getAttribute("username") %><br>
<%= request.getAttribute("age") %><br>
<%= request.getAttribute("address") %>
</body>
</html>