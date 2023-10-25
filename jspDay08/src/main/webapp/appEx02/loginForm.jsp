<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset style="width: 300px">
<legend>로그인</legend>
<form action="../Login" method="post">
	<input type="text" name="id" required placeholder="아이디 입력"><br>
	<input type="password" name="pwd" required placeholder="비밀번호 입력"><br>
	<input type="submit" value="로그인"><br>
</form>
</fieldset>
</body>
</html>