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
				type:"get",
				dataType:"json",
				success: function (data, status, xhr) {
					console.log(data.userid,"\t", data.passwd);
					$("#result").text(JSON.stringify(data)); // 데이터의 문자열화
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			}); //end ajax
		});//end aaa

		
		$("#bbb").on("click", function() {
			$.ajax({
				url:"bbb",
				type:"get",
				dataType:"json",
				success: function (data, status, xhr) {
					console.log(data.length);
					for (var i = 0; i < data.length; i++) {
						console.log(data[i].userid,"\t", data[i].passwd);
					}
					$("#result").text(JSON.stringify(data)); // 데이터의 문자열화s
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
				dataType:"json",
				success: function (data, status, xhr) {
					console.log("==================");			
					console.log(data.length);			
					console.log(data.one);			
					console.log(data.two);
					
					$("#result").text(JSON.stringify(data)); // 데이터의 문자열화s
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
				dataType:"json",
				success: function (data, status, xhr) {				
					console.log(data);
					$("#result").text(JSON.stringify(data)); // 데이터의 문자열화s
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end ddd
		
		
		$("#eee").on("click", function() {
			$.ajax({
				url:"eee",
				type:"get",
				dataType:"text",
				success: function (data, status, xhr) {				
					console.log(data);
					$("#result").text(data);
				},
				error: function(xhr, status, error) {
					console.log(error);
				}			
			});
		});//end eee
		
		
		
	})


</script>
<title>Insert title here</title>
</head>
<body>
main.jsp~~~~~~~~~~~~~~~~~~~~~~<br>
<button id="aaa"> aaa호출 :login 호출</button><br>
<button id="bbb"> bbb호출 : ArrayList</button><br>
<button id="ccc">ccc호출 :HashMap </button><br>
<button id="ddd">ddd호출 :String </button><br>
<button id="eee">eee호출 :String </button>
<div id="result"></div>

<hr>
<a href="Test.html">test.html</a>
</body>
</html>