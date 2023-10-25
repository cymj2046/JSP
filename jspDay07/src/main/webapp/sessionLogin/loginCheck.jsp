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
	//한글 인코딩 지정
	request.setCharacterEncoding("UTF-8");

	//데이터 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String url = "";
	
	if(id!=null){
		//id, pwd 같은지 비교(회원인지 비교)
		if(id.equals("test")&&pwd.equals("1234")){
			//회원 인증 성공 -> 세션정보 저장 -> main.jsp로 이동
			session.setAttribute("name", "쿠키몬스터");
			url = "main.jsp";
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
		}else{
			//회원 정보가 맞지 않을 경우 -> loginForm.jsp로 이동
			url = "loginForm.jsp";
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
		}
	}else{
		//회원 정보가 없습니다. -> loginForm.jsp로 이동
		url = "loginForm.jsp";
		RequestDispatcher disp = request.getRequestDispatcher(url);
		disp.forward(request, response);	
		}
		

%>
</body>
</html>