<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hhh.jsp</h1>
${personname}<br>
${personage}<br>
${personname2}<br>
${personage2}<br>


<%= request.getAttribute("personname") %><br>
<%= request.getAttribute("personage") %><br>
<%= request.getAttribute("personname2") %><br>
<%= request.getAttribute("personage2") %><br>



</body>
</html>