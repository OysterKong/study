<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login2.jsp<br>

id : ${login.userid }<br>
passwd : ${login.passwd }<br>
<%
	LoginDTO dto = (LoginDTO)request.getAttribute("login");
	out.print(dto.getUserid()+"<br>");
	out.print(dto.getPasswd());
%>

</body>
</html>