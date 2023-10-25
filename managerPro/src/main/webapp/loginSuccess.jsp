<%@page import="com.ks.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
  //닉네임 가져오기
  //1) session에 있는 데이터 가져오기
	MemberVO result = (MemberVO)session.getAttribute("info");
  //2)VO 안의 닉네임 가져오기
	String name = result.getName();
--%>

<!-- jstl core 문법 이용한 분기 -->
<c:if test="${empty info}">회원 가입 또는 로그인이 필요합니다.</c:if>

<c:if test="${not empty info}">
	<div style="width:250px; height:150px;text-align:center;border:1px solid black;">
	<h3>로그인 성공</h3>
	${info.name}님 <a href ="logout.jsp">로그아웃</a><br><br>
	<a href ="allMember.jsp">회원 정보 보기</a>
	</div>
</c:if>
</body>
</html>