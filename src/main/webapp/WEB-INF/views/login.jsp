<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
    <h2>로그인</h2>
    <form action="/jpabasics/main"  method = "post" id = "login">
		<ul type="none">
		<li>아이디<input type="text" name="memberid"></li>
		<li>비밀번호<input type="password" name="memberpw"></li>
		<button type="submit">로그인</button></li>
	</form>
</body>
</html>

