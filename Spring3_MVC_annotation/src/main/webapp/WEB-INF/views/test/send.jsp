<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<html>
<head>
<link href="resources/css/bootstrap.css" type="text/css" rel="stylesheet">
<title>send.jsp</title>
</head>

<body>
<div class="container">
<h3>회원 가입 정보</h3>
   <table class="table">
         <tr>
         	 <th> ID </th>
         	 <td><c:out value="${join.id}"/></td>
         </tr>
         <tr>
         	 <th> 비밀번호 </th>
         	 <td><c:out value="${join.pass}"/></td>
         </tr>
         <tr>
         	 <th> 주민번호 </th>
         	 <td>
         	    <c:out value="${join.jumin1} - ${join.jumin2}"/>
         	 </td>   
         </tr>
         <tr>
         	 <th> E-Mail </th>
         	 <td><c:out value="${join.email}@${join.domain}"/></td>
         </tr>
         <tr>
         	   <th> 성별 </th>
            <td>
               <c:set var="gender" value="${join.gender}"/>
               <c:choose>
                  <c:when test='${gender.equals("m")}'>
                     <c:out value="남자"/>
                  </c:when>
                  <c:otherwise>
                     <c:out value="여자"/>
                  </c:otherwise>
               </c:choose>
            </td>
         </tr>
         <tr>
            <th> 취미 </th>
            <td>
               <c:forEach var="hobby" items="${join.hobby}">
                  ${hobby}&nbsp;
               </c:forEach>
            </td>
         </tr>
         <tr>
            <th> 우편번호 </th>
            <td><c:out value="${join.post1}"/></td>
         </tr>
         <tr>
            <th> 주소 </th>
            <td><c:out value="${join.address}"/></td>
         </tr>
         <tr>
            <th> 자기소개 </th>
            <td><c:out value="${join.intro}"/></td>
         </tr>          
   </table>

</div>

</body>
</html>