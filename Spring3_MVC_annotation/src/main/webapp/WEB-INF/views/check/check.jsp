<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 화면입니다.</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
</head>

<body>
<h1>check.jsp - 결과 화면입니다.</h1>
<input type="checkbox" name="hobby" value="1">운동
<input type="checkbox" name="hobby" value="2">피아노
<input type="checkbox" name="hobby" value="3">게임
<input type="checkbox" name="hobby" value="4">수면   

<script>
var result='${hobby}';
var trans_result = result.split(",");

for(var i=0; i<trans_result.length; i++){
   var index = trans_result[i]-1;
   $("input").eq(index).prop("checked",true)
}

</script>

</body>
</html>