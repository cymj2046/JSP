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
	request.setCharacterEncoding("utf-8");
	//forward() 이용할 때
	//String id = request.getParameter("id");
	
	//session 객체 이용하여 페이지 확인하기
	//1.session.getAttribute() 이용하여 로그인 정보를 읽어옴
	String id = (String)session.getAttribute("id");
	
	if(id!=null){
%>
<%=id %>님 환영합니다.<br>
<a href="logout.jsp">로그아웃</a>
<% } else {
	out.print("로그인하기 바랍니다.");
}
	
%>

</body>
</html>