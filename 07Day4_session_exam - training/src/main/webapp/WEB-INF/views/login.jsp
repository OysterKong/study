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
<h1>login.jsp</h1>
아이디 : ${login.userid}<br>
패스워드 : ${login.passwd}
<hr>
${login}
<hr>
<a href="logout">로그아웃</a>

</body>
</html>