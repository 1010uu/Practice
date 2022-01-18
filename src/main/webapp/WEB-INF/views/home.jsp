<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="/Practice/resources/bootstrap5.1.3/css/bootstrap.css" />
<script src="/Practice/resources/jquery/jquery-3.6.0.js"></script>
</head>
<body>
<div class="container">
	<h2>Spring Framework 시작하기</h2>
	
	<h3>resource 폴더 사용하기</h3>
	<img src="./img_avatar1.png" alt="부트스트랩 아바타1" />
	<img src="./resources/images/img_avatar1.png" alt="아바타1" width="200"/>
	<img src="./static/images/1.png" alt="스펀지밥" width="200"/>
	
	<h3>첫번째 컨트롤러 만들기</h3>
	<ul>
		<li><a href="./home/hellospring" target="_blank">
		첫번째 컨트롤러 바로가기</a></li>
	</ul>
	
	<h3>form값 처리하기</h3>
	<ul>
		<li><a href="./form/servletRequest?id=kosmo&pw=1234" target="_blank">
		HttpServletRequest로 폼 값 받기</a></li>
	</ul>
</div>
</body>
</html>
