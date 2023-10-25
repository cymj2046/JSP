<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:requestEncoding value="utf-8"/>
<h3>로그인 처리(기존 방식)</h3>
<%
	//한글 인코딩 지정
	//request.setCharacterEncoding("utf-8");
	
	//String id = request.getParameter("id");
	//String pwd = request.getParameter("pwd");
%>

<hr>
<h3>로그인 처리(EL 방식)</h3>
<!-- 표현언어로 request 객체에 있는 한글 인코딩 하기->jstl 이용 -->
ID: <c:out value="${param.id}"/><br>
PW: <c:out value="${param.pwd}"/><br>
</body>
</html>