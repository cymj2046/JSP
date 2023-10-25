<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>회원 가입 성공</h3>
	<!-- 회원 정보 테이블 형식으로 출력(사용자에게 피드백) -->
		<table>
			<tr>
				<td>이름</td>
				<td>${name}</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${userid}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${pwd}</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${email}</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${phone}</td>
			</tr>
			<tr>
				<td>등급</td>
				<td>${admin}</td>
			</tr>
		</table>
	
	<a href="allMember.jsp"> 회원 전체 목록 보기 </a> 
</body>
</html>