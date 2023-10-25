<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String data = null; %>
data: <%=data %><br>
data: ${data}
<hr>

<% String id = request.getParameter("id");
%>
[표현식]<%-- <%=id.equals("smart")%> --%>
<p>
[표현언어]${param.id == "smart"}

</body>
</html>