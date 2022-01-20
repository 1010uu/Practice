<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
	<h2>form 데이터 받기</h2>
	
	<h3>@pathVariable 어노테이션으로 폼 값 받기</h3>
	
	<ul>
		<li>회원 아이디 : ${memberId }</li>
		<li>회원 이름 : ${memberName }</li>
	</ul>
	
	<div class="row mt-5">
		<h3>이미지 경로 확인</h3>
		<img src="../../resources/images/4.png" alt="댕댕" />
	</div>
</div>
</body>
</html>