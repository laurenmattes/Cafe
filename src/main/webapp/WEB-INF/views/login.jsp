<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="partials/header.jsp" %>
<h1>Login</h1>

	<p class="message">${ message }</p>

<div class="form-group">
<form action="/login" method="post">
		<p>
			<label for="username">Username:</label> <input id="username" name="username" value="${ param.username }" required minlength="2" />
		</p>		<p>
			<label for="password">Password:</label> <input id="password" type="password" name="password" required minlength="2" />
		</p>
		<p>
			<button>Submit</button><br>
			Don't have an account yet? <a href="/user-registration">Sign up here</a>.
		</p>
	</form>
	</div>

</body>
</html>