<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>   
<title>MVC 게시판</title>   
<jsp:include page="header.jsp" />
<script src="../resources/js/modify.js" charset="utf-8"></script>
<style>
.container{width:60%}
h1{font-size:1.5rem; text-align:center; color:#1a92b9}
#upfile{display:none}
textarea{resize:none}
</style>
<script>
   if('${result}'=='passFail'){
      alert("비밀번호가 다릅니다.")
   }
</script>
</head>
<body>
   <!-- 게시판 수정 -->
   <div class="container">
      <form action="modifyAction" method="post" name="modifyform" enctype="multipart/form-data">
         <input type="hidden" name="BOARD_NUM" value="${boarddata.BOARD_NUM}">
         <input type="hidden" name="BOARD_FILE" value="${boarddata.BOARD_FILE}">
         <h1>MVC 게시판 - 수정</h1>   
         <div class="form-group">
            <label class="board_name">글쓴이</label>
            <input type="text" name="BOARD_NAME"
                    class="form-control" value="${boarddata.BOARD_NAME}" readOnly>
         </div>
         
         <div class="form-group">
            <label class="board_subject">제목</label>
            <textarea name="BOARD_SUBJECT" id="board_subject"
                     class="form-control" rows="1" maxlength="100">${boarddata.BOARD_SUBJECT}</textarea>
         </div>
         
         <div class="form-group">
            <label class="board_content">내용</label>
            <textarea name="BOARD_CONTENT" id="board_content"
                     class="form-control" rows="15">${boarddata.BOARD_CONTENT}</textarea>
         </div>      
         
      <%-- 원문글인 경우에만 파일 첨부 수정 가능합니다 --%>
      <c:if test="${boarddata.BOARD_RE_LEV==0 }">
         <div class="form-group read">
            <label for="board_file">파일 첨부</label>
            <label for="upfile">
               <img src="../resources/image/attach.png" alt="파일첨부" width="20px">
            </label>
            <input type="file" id="upfile" name="uploadfile">
            <span id="filevalue">${boarddata.BOARD_ORIGINAL}</span>
            <img src="../resources/image/remove.png" alt="파일삭제" width="10px" class="remove">
         </div>
      </c:if>
      
      <div class="form-group">
         <label for="board_pass">비밀번호</label>
         <input name="BOARD_PASS"
               id="board_pass" type="password" size="10" maxlength="30"
               class="form-control" placeholder="Enter password">
      </div>
      <div class="form-group">
         <button type=submit class="btn btn-primary">수정</button>
         <button type=reset class="btn btn-danger" onClick="history.go(-1)">취소</button>
      </div>
         
      </form>
   </div><%-- class="container" end --%>
</body>
</html>