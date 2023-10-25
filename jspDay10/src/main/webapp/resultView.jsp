<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--  //스크립트릿 이용한 결과 표현
	int num1 = (Integer)request.getAttribute("num1");
	int num2 = (Integer)request.getAttribute("num2");
	int result = (Integer)request.getAttribute("result");
--%>
<p>[표현식 이용한 결과 출력]</p>
<%--<%=num1 --%> + <%--=num2 --%> = <%--=result --%>

<p>[표현언어 이용한 결과 출력]</p>
${num1 } + ${num2 } = ${result }
</body>
</html>