<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="UserInfo2.jsp" method="post">
<table>

<tr>
<td><b>이름</b><input type="text" name="name"></td>
</tr>

<tr>
<td><b>나이</b><input type="text" name="age"></td>
</tr>

<tr>
<td><b>성별</b>
남<input type="radio" name="gender" value="남자">
여<input type="radio" name="gender" value="여자">
</td>
</tr>

<tr>
<td><b>좋아하는 음식</b>
<select name="food">
<option value="김치찌개">김치찌개</option>
<option value="떡볶이">떡볶이</option>
<option value="라면">라면</option>
<option value="김밥">김밥</option>
</select></td>
</tr>

<tr>
<td><b>관심 분야</b></td>
</tr>

<tr>
<td>
<input type="checkbox" name="interest" value="웹프로그램">웹프로그램
<input type="checkbox" name="interest" value="네트워크관리">네트워크관리
<input type="checkbox" name="interest" value="보안">보안
<input type="checkbox" name="interest" value="게임프로그램">게임프로그램
<input type="checkbox" name="interest" value="데이터분석">데이터분석
</td>
</tr>

<tr>
<td><input type="submit" value="제출"></td>
</tr>

</table>
</form>
</body>
</html>