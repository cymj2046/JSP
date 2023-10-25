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
	//session이 존재하는지 확인
	if(session.getAttribute("id")!=null){
		
%>
<%= session.getAttribute("id") %>님 환영합니다.
  <%} else {response.sendRedirect("loginForm.jsp");
	  }%>
</body>
</html>