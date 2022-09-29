<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이 출력</title>
<link href="resources/css/bootstrap.css" type="text/css" rel="stylesheet">
<style>
	.container{width:80%; margin-top:10%}
	span{color:orange}
</style>
</head>
<body>
<div class="container">
	<h5>요청 주소 <span>${url}</span> 처리하는 list.jsp 입니다.</h5>
	<table class="table">
		<tr>
			<th>나이</th><td>${age}</td>
		</tr>
	</table>
</div>
</body>
</html>