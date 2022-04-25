<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!-- exception 처리 - isErrorPage -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Error 페이지</h1>
<%
	out.print(exception);
%>
<a href="../">메인화면으로</a><!-- ㅡmain controller 에 주소를 --> <!-- 나중에 if else 문 사용해서 세션에 로그인값이 있으면  -->
</body>
</html>