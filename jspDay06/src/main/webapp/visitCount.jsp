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
	//application 객체를 이용하여 사이트 방문자수 카운트하기
	//서비스 최초 접속인 경우와 아닌 경우를 구분해서 방문자 수 카운트한다.
	 Object strCnt = application.getAttribute("counter");
	//int cnt = 0;
	//System.out.println("방문자 counter: "+ strCnt);
	if(strCnt==null){
		//최초 접속인 경우 처리
		application.setAttribute("counter", 1);
		//System.out.println("최초접속 counter: "+ application.getAttribute("counter"));
	}else {
		int cnt = (Integer)strCnt;
		
		//새로운 세션인지 확인 후 카운터 증가
		if(session.isNew()) cnt++;
		application.setAttribute("counter", cnt);
	}
	
	out.print("방문자 수: "+ application.getAttribute("counter"));
	

%>
</body>
</html>