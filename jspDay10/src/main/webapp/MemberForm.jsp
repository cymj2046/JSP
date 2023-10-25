<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MemberServlet" method="post">
<input type="text" name="name" placeholder="이름입력"><br>
<input type="password" name="pwd" placeholder="비밀번호"><br>
<input type="email" name="email" placeholder="이메일"><br>
<input type="submit" value="Send">
</form>
</body>
</html>