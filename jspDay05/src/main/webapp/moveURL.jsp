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
	String url = request.getParameter("url");

	if(url.equals("naver"))
		response.sendRedirect("http://www.naver.com");
	else if(url.equals("daum"))
		response.sendRedirect("http://www.daum.net");
	else if(url.equals("google"))
		response.sendRedirect("http://www.google.com");
	else if(url.equals("bing"))
		response.sendRedirect("http://www.bing.com");
	
%>
</body>
</html>