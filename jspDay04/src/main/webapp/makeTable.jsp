<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 클라이언트가 요청한 정보대로 방 만들기 -->
<table border>
<tr>
<%
	//데이터 가져오기
	int roomCnt = Integer.parseInt(request.getParameter("roomCnt"));
	for(int i=1; i<=roomCnt; i++){
		//out.print("<td>" + i +"</td>");
%>
	<td><%=i %></td>
<% 	} %>

</tr>
</table>
</body>
</html>