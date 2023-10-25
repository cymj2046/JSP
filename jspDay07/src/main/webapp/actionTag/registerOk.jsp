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

	//useBean 액션태그로 Member 객체 생성
	//useBean id="객체변수(빈이름)" class="사용할 자바빈 클래스명"
%>
	<jsp:useBean id="member" class="com.beans.Member"/>
		
<!-- setProperty로 필드값 저장 -->
<!-- setProperty property="필드이름" name="빈이름" -->
<!-- 주의: property="필드이름" 이름은 폼의 필드가 동일하게 설정한다. -->
<!-- 자바빈의 필드 이름은 폼의 필드 이름과 동일하게 설정한다. -->
	<!--<jsp:setProperty property="id" name="member"/>
	<jsp:setProperty property="pwd" name="member"/>
	<jsp:setProperty property="name" name="member"/>
-->

	<jsp:setProperty property="*" name="member"/>
	
<h3>가입 회원 정보</h3>
<!-- getProperty로 필드값 가져오기 -> getter 메소드 호출하는 것과 동일한 결과 -->
id : <jsp:getProperty property="id" name="member"/><br>
pwd : <jsp:getProperty property="pwd" name="member"/><br>
name : <jsp:getProperty property="pwd" name="member"/>

</body>
</html>