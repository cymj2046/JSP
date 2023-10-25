<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test3.jsp" method="get">
	<input type="text" name="a"><br>
	<input type="text" name="b" value="5678"><br>
	
	<input type="radio" name="d" id="d1" value="y"><label for="d1">노랑</label>
	<input type="radio" name="d" id="d2" value="r"><label for="d2">빨강</label>
	<input type="radio" name="d" id="d3" value="b"><label for="d3">검정</label>
	<br>
	
	<input type="checkbox" name="e" value="t">티셔츠 
	<input type="checkbox" name="e" value="p">바지
	<input type="checkbox" name="e" value="c">모자
	
	<br>
	<input type="submit">
</form>
</body>
</html>