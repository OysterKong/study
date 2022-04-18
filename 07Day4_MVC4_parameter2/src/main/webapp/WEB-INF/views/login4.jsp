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
login4.jsp<br>

id : ${login.userid }<br>  <!-- ket가 없을 경우 소문자 Class 이름.멤버변수 -->
passwd : ${login.passwd }<br>
<%
	LoginDTO dto = (LoginDTO)request.getAttribute("login");
	out.print(dto.getUserid()+"<br>");
	out.print(dto.getPasswd());
%>
<hr>
</body>
</html>