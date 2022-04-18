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
login3.jsp<br>
dto.userid<br>
xxx.id : ${xxx.userid }<br>  <!-- ket가 없을 경우 소문자 Class 이름.멤버변수 -->
xxx.passwd : ${xxx.passwd }<br>
<hr>
<%
	LoginDTO dto = (LoginDTO)request.getAttribute("xxx");
	out.print(dto.getUserid()+"<br>");
	out.print(dto.getPasswd());
%>
<hr>
4번 : ${dto.userid }  <!-- el 태그의 특징 : 바인딩 된 값만 사용함 ( key 값이 dto가 아님, 맞지 않음 ) -->
</body>
</html>