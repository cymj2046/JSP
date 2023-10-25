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
	//id, pwd 값 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//id, pwd가 등록된 값이랑 맞는지 확인
	if((id.equals("smart"))&&(pwd.equals("123"))){
		response.sendRedirect("main.jsp?id="+ id);
	}else{
		response.sendRedirect("login.jsp");
	}

%>
</body>
</html>