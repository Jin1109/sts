<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 폼 입니다.</title>
<link href="resources/css/form.css" type="text/css" rel="stylesheet">
</head>
<body>
<form method=post action="param2.do">
	<h3>paramForm2.jsp</h3>
	<b>나이</b>
	<input type="text" name="age" required placeholder="Enter age">
	<div class="clearfix">
		<button type="submit" class="submitbtn">전송</button>
	</div>
</form>

</body>
</html>