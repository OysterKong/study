<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ccc.jsp</h1>

${loginDTO}
<hr>
<hr>
${loginDTO.userid}<br>
${loginDTO.passwd}<br>
<hr>
<%= request.getAttribute("loginDTO") %>
<hr>


</body>
</html>