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
	request.setCharacterEncoding("UTF-8");

	//request객체의 데이터 가져오기 -> 배열
	String [] books = request.getParameterValues("book"); //checkbox name이 book
	
	//목록(선택 항목)에 대한 쿠키 생성
	for(int i=0; i<books.length; i++){
		String book = "book" +(i+1);
		//1.쿠키 생성
		Cookie cookie = new Cookie(book, books[i]);
		//2.쿠키 유효기간 설정(초단위)
		cookie.setMaxAge(60*60);
		//3. response 객체 추가
		response.addCookie(cookie);
	}
	
	response.sendRedirect("shoppingBook.jsp");
	
%>
</body>
</html>