<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="resources/css/bootstrap.css" type="text/css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<html>
<head>
<title>이곳은 url.jsp입니다.</title>
</head>
<body>
<div class="container">
   <p>이곳은 url.jsp입니다.</p>
   <p><button class="btn btn-primary" id="url2">url2를 호출합니다.</button></p>
   <p><button class="btn btn-info"    id="url3">url3를 호출합니다.</button></p>
   <div id="result"></div>
</div>
<script>
   $("button").click(function(){
      var goUrl = $(this).attr('id');
      $.ajax({
         url:goUrl ,
         success:function(rdata){
            $("div#result").html(rdata).css('color','green');
         },
         error : function(request, status, error){
            $("body").append("<div id='error'>code :"
                  + request.status + "<br>"
                  + "받은 데이터 :" + request.responseText + "<br>"
                  + "error status : " + status + "<br>"
                  + "error 메시지 : " + error +"</div>");
         }
      })
   });
   
</script>
</body>
</html>