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
response.addCookie(new Cookie("a", "222222"));
response.addCookie(new Cookie("a", "1111111"));

//response.sendRedirect("test.jsp");

System.out.println(request.getParameter("e"));
System.out.println(request.getParameterValues("e"));
%>
</body>
</html>