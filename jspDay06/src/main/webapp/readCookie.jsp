<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키 정보 가져오기</h3>
<%
	//쿠키 정보 가져오기 -> 복수개: 배열처리
	Cookie [] cookies = request.getCookies();
	for(Cookie cookie: cookies) {
		//쿠키 이름 가져오기
		String name = cookie.getName();
		//쿠키 값 가져오기
		String value = cookie.getValue();
		//쿠키 출력
		out.print(name +":"+ value +"<br>");
	}
	
	

%>
</body>
</html>