<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>장바구니 목록</h3>

<form action="shoppingCart.jsp" method="post">
	<table width="400" style="border:1px solid black">
		<tr>
			<td align="center">책 제목</td>
			<td align="center">가격</td>
			<td align="center">장바구니 담기</td>
		</tr>
		
		<tr>
			<td align="center">서블릿</td>
			<td align="center">22000</td>
			<td align="center"><input type="checkbox" name="book" value="서블릿"></td>
		</tr>
		 
		<tr>
			<td align="center">자바</td>
			<td align="center">24000</td>
			<td align="center"><input type="checkbox" name="book" value="자바"></td>
		</tr>
		
		<tr>
			<td align="center">파이썬</td>
			<td align="center">20000</td>
			<td align="center"><input type="checkbox" name="book" value="파이썬"></td>
		</tr>
		
		<tr>
			<td align="center">머신러닝</td>
			<td align="center">28000</td>
			<td align="center"><input type="checkbox" name="book" value="머신러닝"></td>
		</tr>
		
		<tr>
			<td align="center">영상처리</td>
			<td align="center">33000</td>
			<td align="center"><input type="checkbox" name="book" value="영상처리"></td>
		</tr>
		
		<tr>
			<td colspan="3" align="center"><input type="submit" value="장바구니 담기"></td>
		</tr>
	
	</table>
</form>

<%
	//item 시리즈로 저장된 쿠키 정보 가져오기
	Cookie [] cookies = request.getCookies();
	int cnt = 1;
	for(Cookie cookie: cookies) {
		//쿠키 이름 가져오기
		String name = cookie.getName();
		//쿠키 이름에 "item" 포함되었는지를 확인
		if(name.contains("book")) {
			String value = cookie.getValue();
			//쿠키 출력
			out.print(cnt++ +". "+ value +"<br>");
		}
	}

%>
</body>
</html>