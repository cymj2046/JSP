<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
 //전역 변수 메소드 선언하기 위한 영역
 int global_cnt = 0;
%>
<%
 //스크립트릿 기본 JSP 코드를 작성하는 영역
 //이곳에 선언된 변수는 지역변수가 됨
 int local_cnt = 0;

 out.print("global_cnt: "+ (++global_cnt) + "</br>");
 out.print("local_cnt: "+ (++local_cnt) + "</br>");

%>
</body>
</html>