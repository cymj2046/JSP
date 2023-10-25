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
<c:set var="name" value="page man" scope="page"/>
<c:set var="name" value="request man" scope="request"/>
<c:set var="name" value="session man" scope="session"/>
<c:set var="name" value="application man" scope="application"/>

[표현언어로 내장 객체 접근: Scope]
name: ${name}<br>
session name: ${sessionScope.name}
</body>
</html>