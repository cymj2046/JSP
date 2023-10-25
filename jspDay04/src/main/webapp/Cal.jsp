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
//html에서 정수 2개와 연산 기호를 입력받아
//jsp에서 연산 결과를 출력하시오.
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String op = request.getParameter("op");
	out.print("<h2>사칙연산기</h2>");
	
	int result = 0;
	switch(op){
	case "+": result = num1 + num2;
		break;
	case "-": result = num1 - num2;
		break;
	case "*": result = num1 * num2;
		break;
	case "/": result = num1 / num2;
		break;
	}
	
	out.print(num1 +"+"+ num2 +"="+ result);
%>
</body>
</html>