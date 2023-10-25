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
	String id = (String)request.getAttribute("id");
%>
<%=id %>님 환영합니다.<br>
<a href="login.jsp">로그아웃</a>
</body>
</html>