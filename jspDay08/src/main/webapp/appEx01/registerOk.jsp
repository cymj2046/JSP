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
	
%>
<!-- useBean으로 사용자 요청 정보를 Member 빈에 저장하기 -->
<jsp:useBean id="member" class="com.model.Member" scope="session"></jsp:useBean>

<!-- setProperty로 setter 메소드 호출 -->
<jsp:setProperty property="*" name="member"/>

<h3>회원 가입 정보</h3>
<fieldset>
<legend>결과</legend>
<table border width="400">

	<tr>
		<td>이름</td>
		
		<td> <!-- getProperty로 getter 메소드 호출 -->
		<jsp:getProperty property="name" name="member"/>
		</td>
	</tr>
	
	<tr>
		<td>아이디</td>
		<td><jsp:getProperty property="id" name="member"/></td>
	</tr>
	
	<tr>
		<td>별명</td>
		<td><jsp:getProperty property="nickName" name="member"/></td>
	</tr>
	
	<tr>
		<td>비밀번호</td>
		<td><jsp:getProperty property="pwd" name="member"/></td>
	</tr>
	
	<tr>
		<td>이메일</td>
		<td><jsp:getProperty property="email" name="member"/></td>
	</tr>
	
	<tr>
		<td>전화번호</td>
		<td><jsp:getProperty property="tel" name="member"/></td>
	</tr>
	
</table>
<a href="loginForm.jsp">로그인</a>
</fieldset>

</body>
</html>