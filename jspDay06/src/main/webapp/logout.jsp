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
	//세션 정보를 무효화 시킴(세션 제거)
	session.invalidate();
%>
<p>로그아웃되었습니다.</p>
<a href="login.jsp">로그인하기</a>
</body>
</html>