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
  //절대값을 구하는 함수 정의
  int abs(int num){
	if(num>0) return num;
	else return -num;
  }
%>
<%
  //스크립트릿 이용한 함수 호출
  //절대값 구하는 함수 호출
  //int result1 = abs(5);
  //int result2 = abs(-5);
  
  //out.print("5의 절대값: "+ abs(5) +"</br>");
  //out.print("-5의 절대값: "+ abs(-5) +"</br>");
%>


<!-- 표현식 이용한 함수 호출 -->
5의 절대값: <%=abs(5) %></br>
-5의 절대값: <%=abs(-5) %></br>

</body>
</html>