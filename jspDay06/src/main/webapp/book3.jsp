<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>html/css를 쿠키로 저장</h3>
<%
//책 이름을 item시리즈로 쿠키에 저장하기 book1.jsp book2.jsp book3.jsp
	//1.쿠키 생성
	Cookie cookie = new Cookie("item3", "html/css");
	//2.쿠키 유효기간 설정(초단위)
	cookie.setMaxAge(60*60);
	//3. response 객체 추가
	response.addCookie(cookie);
	
%>
</body>
</html>