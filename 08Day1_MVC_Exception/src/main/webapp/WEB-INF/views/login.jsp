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

${login}
<hr>
${sessionScope.login.userid}<br>
${sessionScope.login.passwd}<br>
<hr>
${login.userid}<br>
${login.passwd}<br>
<hr>
<%= session.getAttribute("login") %>
<hr>
<a href="logout">로그아웃</a>

</body>
</html>