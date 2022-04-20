<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list.jsp</h1>



${list}
<hr>
<form action="add" method="get">
deptno :<input type="text" name="deptno"><br>
dname : <input type="text" name="dname"><br>
loc : <input type="text" name="loc"><br>
<input type="submit" value="전송">
</form>
<hr>
삭제: <a href="del?deptno=51">삭제하기</a>
<Hr>
<form action="update" method="get">
deptno :<input type="text" name="deptno"><br>
dname : <input type="text" name="dname"><br>
loc : <input type="text" name="loc"><br>
<input type="submit" value="전송">
</form>
</body>
</html>