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
			<div id="container-login-right">
			</div>
		</div>
	</div>
</body>
</html>