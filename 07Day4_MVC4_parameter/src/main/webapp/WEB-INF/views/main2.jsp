<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main2.jsp<br>

1. el 태그 이름 : ${username}<br>
1. e1 태그 나이 : ${age}<br>
2. req.getAtt : <%=request.getAttribute("username") %><br>
3. req.getParam : <%=request.getParameter("username") %><br>
4. session. : <%=session.getAttribute("username") %><br>
5. login : ${login.name}<br>
<img alt="aaa" src="resources/images/a.jpg">
</body>
</html>