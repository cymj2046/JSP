<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>java를 쿠키로 저장</h3>
<%
	//1.쿠키 생성
	Cookie cookie = new Cookie("item2", "java");
	//2.쿠키 유효기간 설정(초단위)
	cookie.setMaxAge(60*60);
	//3. response 객체 추가
	response.addCookie(cookie);
	
%>
</body>
</html>