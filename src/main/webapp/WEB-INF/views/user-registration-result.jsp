<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful!</title>
<link rel="stylesheet" href="/style.css"/>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cafe</title>
</head>
<body>
	Hello
	First Name: <p>${users.firstName}
	
	</p>
	Last Name: <p>
		${users.lastName }
	</p>
	Social Security Number: <p>${users.socialSecurity }
	</p>
	Shoe Size: <p>${users.shoeSize }
</p>
</body>
</html>