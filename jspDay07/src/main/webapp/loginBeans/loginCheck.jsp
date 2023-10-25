<%@page import="com.beans.LoginBean"%>
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
	//LoginBean으로 로그인 승인 여부 확인 코드
	
	//1.로그인 정보를 가져오기(request 객체로부터)
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//로그인 승인 여부를 위한 LoginBean의 checkUser() 호출
	LoginBean lb = new LoginBean();
	
	boolean ok = lb.checkUser(id, pwd);
	String url = "";
	
	if(ok){
		//승인 성공
		session.setAttribute("id", id);
		url = "main.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(url);
		disp.forward(request, response);
	}else{
		//승인 실패 -> loginForm.jsp로 이동
		url = "loginForm.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(url);
		disp.forward(request, response);
	}
	
	
	
	
%>
</body>
</html>