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
		//response.sendRedirect("main.jsp?id="+ id);
		//RequestDispatcher객체의 forward()메소드 이용한 페이지 강제 이동
		//1. Request 객체에 전달하고자 하는 정보를 저장
		request.setAttribute("id", id);
		//2. Request 객체로부터 RequestDispatcher 객체 얻기
		RequestDispatcher disp = request.getRequestDispatcher("main2.jsp");
		//3. forward() 메소드 호출
		disp.forward(request, response);
	}else{
		response.sendRedirect("login.jsp");
	}

%>
</body>
</html>