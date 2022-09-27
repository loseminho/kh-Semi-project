<%@page import="com.earthpurging.notice.model.vo.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	Notice n =(Notice)request.getAttribute("n");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" href="/css/default.css">
    <link rel="stylesheet" href="/css/newsWrite.css">
    <link rel="stylesheet" href="/css/news.css">
    <link rel="stylesheet" href="/css/newsView.css">
    
    
</head>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp" %>
	<div class="page-content">
		<div class="page-title">공지사항 수정</div>
		<form action="/noticeUpdate.do" method="post" enctype="multipart/form-data">
			<table class="tbl" id="noticeUpdateFrm">
				<tr>
					<th class="th">제목</th>
					<td>
						<input type="hidden" name="noticeNo" class="input-form" value="<%=n.getNoticeNo()%>">	
						<!-- 기존파일을 지웠는지 체크용도 -->
						<input type="hidden" name="status" value="stay">			
						<input type="text" name="noticeTitle" class="input-form" value="<%=n.getNoticeTitle()%>">
					</td>
				</tr>
				<tr>
					<th class="th">첨부파일</th>
					<td>
						<%if(n.getFilepath() != null) {%>
						<img src="/img/file.png" width="16px" class="delFile">
						<span class="delFile"><%=n.getFilename() %></span>
						<button type="button" class="btn bc1 delFile">삭제</button>
						<input type="file" name="upfile" style="display: none;">
						<input type="hidden" name="oldFilename" value="<%=n.getFilename() %>">
						<input type="hidden" name="oldFilepath" value="<%=n.getFilepath() %>">
					<%}else { %>
						<input type="file" name="upfile">
					<%} %>
					</td>
				</tr>
				<tr>
					<th class="th">내용</th>
					<td>
						<textarea name="noticeContent" class="input-form" ><%=n.getNoticeContent() %></textarea>
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<button type="submit" class="btn updateBtn">수정완료</button>
					</th>
				</tr>
			</table>
		</form>
	</div>
	<script>
		$("button.delFile").on("click",function(){
			$(".delFile").hide();
			$(this).next().show();
			$("[name=status]").val("delete");
		});
	</script>
	<%@include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>