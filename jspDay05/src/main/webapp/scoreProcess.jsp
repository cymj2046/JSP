<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	//평균구하는 함수 정의
	double average(int score[]){
		int total=0;
		for(int i=0; i<score.length; i++){
			total+=score[i];
		}
		return (double)total/score.length;
	}
%>
<%
	//response 객체로부터 데이터 가져오기
	//한글 인코딩 방식 지정하기
	request.setCharacterEncoding("utf-8");
	
	//점수 저장 배열 선언
	int score[] = new int[4];
	
	String name = request.getParameter("name");
	score[0] = Integer.parseInt(request.getParameter("java"));
	score[1] = Integer.parseInt(request.getParameter("web"));
	score[2] = Integer.parseInt(request.getParameter("iot"));
	score[3] = Integer.parseInt(request.getParameter("android"));
	
	//평균 구하기->average()호출
	double avg = average(score);
	
	//학점 구하기
	String grade="";
	if(avg>=95) grade="A+";
	else if(avg>=90) grade="A";
	else if(avg>=85) grade="B+";
	else if(avg>=80) grade="B";
	else if(avg>=75) grade="C+";
	else if(avg>=70) grade="C";
	else if(avg>=65) grade="D+";
	else if(avg>=60) grade="D";
	else grade="F";

%>
<!-- 결과 출력 -->
<fieldset style="width:500px;">
<legend>학점확인프로그램</legend>
<table width="500">
<tr>
	<td width="150">이름</td>
	<td><%=name %></td>
</tr>

<tr>
	<td>JAVA 점수</td>
	<td><%=score[0] %></td>
</tr>

<tr>
	<td>web 점수</td>
	<td><%=score[1] %></td>
</tr>

<tr>
	<td>IOT 점수</td>
	<td><%=score[2] %></td>
</tr>

<tr>
	<td>ANDROID 점수</td>
	<td><%=score[3] %></td>
</tr>

<tr>
	<td>평균</td>
	<td><%=avg %></td>
</tr>

<tr>
	<td>학점</td>
	<td><b><big><%=grade %></big></b></td>
</tr>
</table>
</fieldset>

</body>
</html>