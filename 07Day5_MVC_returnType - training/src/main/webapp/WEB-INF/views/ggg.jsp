<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ggg.jsp</h1>
${name}<br>
${age}<br>


<%= request.getAttribute("name") %><br>
<%= request.getAttribute("age") %><br>



</body>
</html>