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
	//로그아웃을 위한 세션 제거
	session.invalidate();
	//loginForm.jsp로 이동
	response.sendRedirect("loginForm.jsp");

%>
</body>
</html>