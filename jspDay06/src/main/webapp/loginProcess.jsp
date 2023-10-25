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
	//한글 인코딩 방식 지정
	request.setCharacterEncoding("utf-8");

	//데이터 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	String url = "";
	
	if(id!=null){  //main.jsp로 바로 접근하고자 할 때를 판단함
				
		if((id.equals("smart"))&&pwd.equals("1234")){
			//id가 smart이고 pwd가 1234일 경우
			//main.jsp로 페이지 이동 -> RequestDispatcher객체의 forward() 이용하기
			//url = "main.jsp?id="+ id;
			
			//session 객체 이용하여 페이지 확인하기
			//1.session.setAttribute() 이용하여 로그인 정보를 저장함
			session.setAttribute("id", id);
			url = "main.jsp";
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
		}else{
			//아닐 경우 login.jsp로 이동
			url = "login.jsp";
			response.sendRedirect(url);
		}
	}else {
		url = "login.jsp";
		response.sendRedirect(url);
	}

%>
</body>
</html>