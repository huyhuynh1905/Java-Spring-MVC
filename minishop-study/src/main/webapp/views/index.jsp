<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/views/header.jsp"/>
<title>Login</title>
</head>
<body id="#body-login">
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">
				<div id="header-top-left" class="header-login">
					<span id="text-logo">Welcome</span> <br/>
					<span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng minishop</span>
				</div>
				<div id="header-bottom-left">
					<p><img alt="oval" src='<c:url value="/resources/img/oval.png"/>' /><span>Luôn cập nhật xu hướng thời trang mới nhất</span></p>
					<p><img alt="oval" src='<c:url value="/resources/img/oval.png"/>' /><span>Giảm 20% cho khách vip</span></p>
					<p><img alt="oval" src='<c:url value="/resources/img/oval.png"/>' /><span>Tận tình phục vụ cho bạn</span></p>
				</div>
			</div>
			<div id="body-login-right">
				<div id="login-right-top">
					<span>Login</span>
				</div>
				<div id="login-right-form">
					<form action="login" method="post">
						<input id="input-email" placeholder="abcdefgh@email.xyz" class="material-input" type="text" name="email"> <br>
						<input id="input-pass" placeholder="pass word" class="material-input" type="password" name="password"> <br>
						<input class="material-button" type="submit" value="Submit">
					</form>
				</div>
				<div id="login-right-register">
					<span>You don't have account? </span><span class="actived">Register!</span>
				</div>
			</div>
		</div>
	</div>
</body>
</html>