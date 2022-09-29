<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<!-- 
*****  pencil2.png를 클릭하는 경우(수정) *****
 1.선택한 내용을 변수 before에 저장합니다.
 2.$("#content")에 before의 내용을 보여줍니다.
 3.수정할 글 번호를 num(전역변수)이라는 변수에 저장합니다.
 4.$("#write")의 "등록" 라벨을 "수정완료"로 변경합니다.
 5. "수정완료" 옆에 "취소"버튼을 생성합니다.
     <button class="btn btn-danger float-right cancel">취소</button>
 6. 선택한  행의 배경색은   'lightgray'로 나타납니다. 
    선택하지 않은 행의 배경색은 'white'입니다. 
       
         
*****  취소를 클릭하는 경우  *****   
1. 모든 행의 배경색은 'white'로 설정합니다.
2. 선택한 취소 버튼을 제거합니다.
3. $("#write")의 "수정완료" 라벨을 "등록"으로 변경합니다.
4. $("#content")의 값을 초기화 합니다.
*****  delete.png를 클릭하는 경우 *****
1. "정말 삭제하시겠습니까?" 확인을 클릭하면 ajax진행하고 취소를 클릭하면 클릭이벤트 종료합니다.
2. 확인을 클릭한 경우
   (1) 댓글 번호 구해옵니다.
   (2) 전송방식은 "post"
   (3) 요청주소는 "../comment/delete"
   (4) 전송할 데이터는 "num="+(1번에서 구한 댓글 번호)
   (5) 요청 성공하면 받은 데이터가 1인 경우 getList(page);호출합니다.
 -->
<title>MVC 게시판 - view</title>
<jsp:include page="header.jsp"/>
<script src="../resources/js/view.js" charset="UTF-8"></script>
<script>

   var result="${result}";
   if(result == 'passFail') {
      alert("비밀번호가 일치하지 않습니다.")
   }
   $(function(){
      $("form[action=delete]").submit(function(){
         if($("#board_pass").val() == ''){
            alert("비밀번호를 입력하세요");
            $("#board_pass").foucs();
            return false;
         }
         
      })
   })
</script>
<style>
body > div > table > tbody >tr:nth-child(1) {
	text-align: center
}

td:nth-child(1) {
	width: 20%
}

a {
	color: white
}

body > div > table > tbody tr:last-child {
	text-align: center;
}

.btn-primary {
	background-color: #4f97e5
}

#myModal {
	display: none
}

#comment > table > tbody > tr > td:nth-child(2){
 width:60%
}
#count{
    position: relative;
    top: -10px;
    left: -10px;
    background: orange;
    color: white;
    border-radius: 30%;
}

textarea{resize:none}

form[action=down] > input[type=submit]{
    position: relative;
    top: -20px;
    left: 10px;
    border: none;
    cursor : pointer;
}

</style>
<link rel="stylesheet" href="resources/css/view.css">
</head>
<body>
<input type = "hidden" id = "loginid" value="${id}" name="loginid">
<div class="container">
	<table class="table table-striped">
		<tr>
			<th colspan="2">MVC 게시판-view페이지</th>
		</tr>
		<tr>
			<td>
			  <div>글쓴이</div>
			</td>
			<td>
			  <div>${boarddata.BOARD_NAME}</div>
			</td>
		</tr>
		<tr>
			<td>
			  <div>제목</div>
			</td>
			<td><c:out value="${boarddata.BOARD_SUBJECT}" /></td>
		</tr>
		<tr>
			<td>
			  <div>내용</div>
			</td>
			<td style="padding-right: 0px"><textarea class="form-control"rows="5" 
				  readOnly>${boarddata.BOARD_CONTENT}</textarea></td>
		</tr>
		<c:if test="${boarddata.BOARD_RE_LEV==0}">
			<%-- 원문글인 경우에만 첨부파일을 추가 할 수 있습니다. --%>
			<tr>
				<td>
				  <div>첨부파일</div>
				</td>
				<c:if test="${!empty boarddata.BOARD_FILE}">
					<%-- 파일첨부한 경우 --%>
	               <td><img src="../resources/image/down.png" width="10px">
	                  <form method="post" action="down" style="height:0px">
	                     <input type="hidden" value="${boarddata.BOARD_FILE}" name="filename">
	                     <input type="hidden" value="${boarddata.BOARD_ORIGINAL}" name="original">
	                     <input type="submit" value="${boarddata.BOARD_ORIGINAL}">
	                  </form>
	               </td>
				</c:if>
				<c:if test="${empty boarddata.BOARD_FILE}">
					<td></td>
				</c:if>	
			</tr>
		</c:if>
		<tr>
			<td colspan="2" class="center">
				<button class="btn btn-primary">댓글</button>
                 <span id="count">${count}</span>
				<c:if test="${boarddate.BOARD_NAME == id || id == 'admin'}">
					<a href="modifyView?num=${boarddata.BOARD_NUM}">
						<button class="btn btn-warning">수정</button>
					</a>
					<%-- href의 주소를 #으로 설정합니다. --%>
					<a href="#">
						<button class="btn btn-danger" data-toggle="modal" data-target="#myModal">삭제</button>
					</a>
				</c:if>
				
				 <a href="replyView.bo?num=${boarddata.BOARD_NUM}">
				 	<button class="btn btn-info">답변</button>
				 </a>
				 
				 <a href="list">
				 	<button class="btn btn-success">목록</button>
				 </a>

			</td>
		</tr>
	</table>
	<%-- 게시판 view end --%>
	
	<%-- modal 시작 --%>
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<%-- Modal body --%>
				<div class="modal-body">
					<form name="deleteForm" action="delete" method="post">
						<%-- http://localhost:8088/Board/BoardDetailAction.bo?num=22
											주소를 보면 num을 파라미터로 넘기고 있습니다.
											이 값을 가져와서 ${param.num}를 사용
											또는 ${boarddata.board_num}
						 --%>
						<input type="hidden" name="num" value="${param.num}" id="board_num">
						<div class="form-group">
							<label for="pwd">비밀번호</label>
							<input type="password"
								   class="form-control" placeholder="Enter password"
								   name="BOARD_PASS" id="board_pass">						  
						</div>
						<button type="submit" class="btn btn-primary">전송</button>
						<button type="button" class="btn btn-danger" data-dismiss="modal">취소</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%-- id="myModal" end --%>
	
	<div id="comment">
		<button class="btn btn-info float-left">총 50까지 가능합니다.</button>
		<button id="write" class="btn btn-info float-right">등록</button>
		<textarea rows=3 class="form-control"
				  id="content" maxlength="50"></textarea>
		<table class="table table-striped">
		<thead>
		  <tr><td>아이디</td><td>내용</td><td>날짜</td></tr>
		</thead>
		<tbody>
		
		</tbody>	
		</table>
		 <div id="message"></div>
	</div><%-- comment-area end --%>
</div><%-- class="container" end --%>
</body>
</html>