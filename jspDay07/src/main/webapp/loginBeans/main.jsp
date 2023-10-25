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
	//세션 정보 읽기 -> 있다면 환영 메시지 출력
	//session.getAttribute() 리턴값은 Object이므로 리턴값을 String 타입으로 다운캐스팅한다.
	String id = (String)session.getAttribute("id");
	
	if(id!=null){
		out.print(id +"님 환영합니다.");
		out.print("<a href='logout.jsp'>로그아웃</a>");
	}else{
		//정상적인 경로로 요청한 것이 아니므로 loginForm.jsp로 이동
		response.sendRedirect("loginForm.jsp");
	}
	
	
%>
</body>
</html>