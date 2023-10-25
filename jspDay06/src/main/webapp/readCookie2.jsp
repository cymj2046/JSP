<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쿠키에 저장된 책 정보</h3>
<%
	//item 시리즈로 저장된 쿠키 정보 가져오기
	Cookie [] cookies = request.getCookies();
	for(Cookie cookie: cookies) {
		//쿠키 이름 가져오기
		String name = cookie.getName();
		//쿠키 이름에 "item" 포함되었는지를 확인
		if(name.contains("item")) {
			String value = cookie.getValue();
			//쿠키 출력
			out.print(name +":"+ value +"<br>");
		}
	}

%>
</body>
</html>