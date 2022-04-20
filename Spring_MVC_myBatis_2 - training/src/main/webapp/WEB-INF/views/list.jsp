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
<hr>
DB에 있는 부서정보 아래에 나열<br>
${list }
<hr>
<form action="add" method="get">
부서번호 : <input type="text" name="deptno"><br>
부서이름 : <input type="text" name="dname"><br>
위치 : <input type="text" name="loc"><br>
<input type="submit" value="등록">
</form>
<Hr>
<form action="update" method="get">
부서번호 : <input type="text" name="deptno"><br>
부서이름 : <input type="text" name="dname"><br>
위치 : <input type="text" name="loc"><br>
<input type="submit" value="수정">
<hr>
<form action="del" method="get">
부서번호: <input type="text" name="deptno"> - 삭제할 번호를 입력</a><br>
<input type="submit" value="삭제">
</form>
</body>
</html>