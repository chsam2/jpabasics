<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>signin</title>
</head>
<body>
    <h2>회원가입</h2>
    <form action="/jpabasics/signin"  method = "post" id = "signin">
		<li>아이디<input type="text" name="memberid"></li>
		<li>비밀번호<input type="password" name="memberpw"></li>
        <li>생년월일<input type="text" name="memberbirth"></li>
        <li>핸드폰 번호<input type="text" name="membernumber"></li>
		<button type="submit">회원가입</button></li>
    </form>
</body>
</html>

