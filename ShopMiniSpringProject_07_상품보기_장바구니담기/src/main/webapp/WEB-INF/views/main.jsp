<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:if test="${!empty success }">
	<script>alert("${success}")</script>
</c:if>
</head>
<body>
<h1>메인화면입니다.</h1>
<%-- ${goodsList } --%> <!-- GoodController에서 ModelAndView 에 담은 카테고리가 top인 항목들이 잘 전달되는가 확인용 -->
<jsp:include page="common/top.jsp" flush="true" /><br>
<jsp:include page="common/menu.jsp" flush="true" />
<hr>
<jsp:include page="goods/goodsList.jsp" flush="true" />
</body>
</html>