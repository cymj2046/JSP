<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//특정 페이지로 유도(호출)하기 위한 sendRedirect(이동할 페이지 url) 메소드
	response.sendRedirect("http://www.naver.com");
	
%>
</body>
</html>