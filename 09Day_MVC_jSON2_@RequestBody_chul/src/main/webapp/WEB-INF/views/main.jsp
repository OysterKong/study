<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	$(function(){
		$("#aaa").on("click", function() {
			$.ajax({
				url:"aaa",
				type:"post", //post방식전송
				dataType:"text",
				headers: { 
					"Content-Type":"application/json"
				},
				data: JSON.stringify({userid:"홍길동", passwd:"1234"}),//json => 문자열 
				success: function (data, status, xhr) {
					console.log(data);			
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end aaa

		
		$("#bbb").on("click", function() {
			$.ajax({
				url:"bbb",
				type:"post", //post방식전송
				dataType:"text",
				headers: { 
					"Content-Type":"application/json"
				},
				data: JSON.stringify(
				[ //배열로 전송
				{userid:"홍길동", passwd:"1234"},
				{userid:"이순신", passwd:"4567"}	
				]
				),
				success: function (data, status, xhr) {
					console.log(data);
				
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end bbb

		$("#ccc").on("click", function() {
			$.ajax({
				url:"ccc",
				type:"get",
				dataType:"text",
				data: {userid:"홍길동", passwd:"1234"},
				success: function (data, status, xhr) {
					console.log(data);			
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end ccc
		
		$("#ddd").on("click", function() {
			$.ajax({
				url:"ddd",
				type:"get",
				dataType:"text",
				data: {userid:"홍길동"},
				success: function (data, status, xhr) {
					console.log(data);			
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end ddd

		
		
		
	})


</script>
<title>Insert title here</title>
</head>
<body>
main.jsp<br>
<button id="aaa">aaa호출</button><br>
<button id="bbb">bbb호출</button><br>
<button id="ccc">ccc호출</button><br>
<button id="ddd">ddd호출</button><br>
<div id="result"></div>
</body>
</html>