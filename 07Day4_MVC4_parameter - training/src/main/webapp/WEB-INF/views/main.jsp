<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : ${username}<br>
나이 : ${age}
<hr>
LoginDTO 속 이름꺼내오기 : ${loginDTO}<br>
<hr>
이름 : <%= request.getAttribute("username") %><br>
나이 : <%= request.getAttribute("age") %>
<hr>
LoginDTO 속 이름꺼내오기 : <%= request.getAttribute("loginDTO") %>
</body>
</html>