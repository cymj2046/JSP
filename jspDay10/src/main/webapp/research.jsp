<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사용자의 다중 선택 처리(스크립트릿)</h3>
<%
	String [] seasons = request.getParameterValues("season");
	out.print("당신이 좋아하는 계절: ");
	
	for(String season : seasons){
%>		
	<%=season %>
<%  }%>	

<hr>
<h3>사용자의 다중 선택 처리(EL)</h3>
<c:forEach items="${paramValues.season}" var="season">
${season}
</c:forEach>



</body>
</html>