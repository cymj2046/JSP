<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table { width:600px; background:gray;}
	tr { background: white;}
	td, th { cellpadding: 1px; }
</style>
</head>
<body>
<c:if test="${empty loginUser}">회원 가입 또는 로그인이 필요합니다.</c:if>

<!-- 회원 주소록 출력 -->
<c:if test="${not empty loginUser}">
<div style="width:650px;text-align:center">
<h3>회원 목록(${loginUser.name}님)</h3>
	<table>
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>전화번호</th>
			<c:if test="${loginUser.admin == 1}">
				<th>삭제</th>
			</c:if>
		</tr>
		<c:forEach items="${list}" var="member">
			<tr>
				<td>${member.name}</td>
				<td><a href="Detail.do?userid=${member.userid}">${member.userid}</a></td>
				<td>${member.phone}</td>
				<c:if test="${loginUser.admin == 1}">
					<td>
						<input type="button" value="삭제" onclick="location.href='delete.do?userid=${member.userid}'">
					</td>
				</c:if>	
			</tr>
		</c:forEach>
	</table>
</div>
</c:if>
</body>
</html>