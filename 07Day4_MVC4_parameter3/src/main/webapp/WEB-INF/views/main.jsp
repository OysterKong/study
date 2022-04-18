<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main.jsp<hr>

${list}<br>
<% ArrayList<String> list = (ArrayList)request.getAttribute("list"); 
%>
<%= list %>
</body>
</html>