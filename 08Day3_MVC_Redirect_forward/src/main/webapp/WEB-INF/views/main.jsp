<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main.jsp<hr>

1. el태그 : ${userid}<br>
2. request.getAttribute(userid) : <%= request.getAttribute("userid") %><br>
3. request.getAttribute(passwd) : <%= request.getAttribute("passwd") %><br>
4. request.getParameter : <%= request.getParameter("userid") %><br>


</body>
</html>