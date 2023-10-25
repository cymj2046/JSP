<%@page import="com.beans.Member"%>
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

	//id, pwd, name 데이터 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	
	//자바빈 이용하기 1. Member 객체 생성  
	Member member = new Member();
	
	//2. id, pwd, name 데이터 저장
	member.setId(id);
	member.setPwd(pwd);
	member.setName(name);
	
	//3. 객체에 저장된 값을 가져와서 출력
	
%>
<h3>가입 회원 정보</h3>
id : <%=member.getId()%><br>
pwd : <%=member.getPwd()%><br>
name : <%=member.getName()%>

</body>
</html>