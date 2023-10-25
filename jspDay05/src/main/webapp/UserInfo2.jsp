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
  //클라이언트에서 보내온 데이터를 가져오기 -> request객체에 한글이 포함될 경우..인코딩
  request.setCharacterEncoding("utf-8");
  String name = request.getParameter("name");
  int age = Integer.parseInt(request.getParameter("age"));
  String gender = request.getParameter("gender");
  String food = request.getParameter("food");
  String [] interests = request.getParameterValues("interest");
  
  int num = age/10; //연령대 계산식 (20~50대)
  String result = "";
  switch (num){
  case 2: result=age +"(20)대"; break;
  case 3: result=age +"(30)대"; break;
  case 4: result=age +"(40)대"; break;
  case 5: result=age +"(50)대"; break;
  default: result=age +"(예외)";	  
  }
%>
<fieldset>
<legend>사용자 정보</legend>
<table border>
<tr><td>이름</td><td>나이</td><td>성별</td><td>좋아하는 음식</td><td>관심분야</td>
</tr>
<tr><td><%=name %></td><td><%=result %></td><td><%=gender %></td>
<td><%=food %></td>
<td>
<%  
  //관심분야 출력
   for(int i=0; i<interests.length; i++){
%>	
	<%=interests[i] %> <br>
<% } %> 

</td>
</tr>
</table>
</fieldset>



</body>
</html>