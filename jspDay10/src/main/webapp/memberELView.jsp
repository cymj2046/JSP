<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:requestEncoding value="utf-8"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="300" border align="center">
		<tr>
			<td colspan="2" align="center">회원 입력 정보</td>
			<!-- td>1-2</td -->
		</tr>
		<tr>
			<td align="right">이름&nbsp;&nbsp;</td>
			<td>${member.name}</td>
		</tr>
		<tr>
			<td align="right">아이디&nbsp;&nbsp;</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td align="right">비밀번호&nbsp;&nbsp;</td>
			<td>${member.pwd}</td>
		</tr>
		<tr>
			<td align="right">이메일&nbsp;&nbsp;</td>
			<td>${member.email}</td>
		</tr>
		<tr>
			<td align="right">성별&nbsp;&nbsp;</td>
			<td>${member.gender}</td>
		</tr>
		<tr>
			<td align="right">좋아하는 음식&nbsp;&nbsp;</td>
			<td>${member.food}</td>
		</tr>
		<tr>
			<td align="right">관심영역&nbsp;&nbsp;</td>
			<td><c:forEach items="${member.interest}" var="intes" >${intes}<br></c:forEach>
			</td>
		</tr>
		<tr>
			<td align="right">좋아하는 색상&nbsp;&nbsp;</td>
			<td>${member.color}</td>
		</tr>
		<tr>
			<td align="right">생년월일&nbsp;&nbsp;</td>
			<td>${member.date}</td>
		</tr>
		
	</table>
</body>
</html>