<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
logined.jsp<br>
<%= session.getAttribute("session") %>
<hr>
${sessionScope.login.userid}<br>
${sessionScope.login.passwd}<br>
<hr>
아이디 : ${login.userid}<br>
패스워드 : ${login.passwd}
<hr>
${session}
<hr>
<a href="logout">로그아웃</a>

</body>
</html>