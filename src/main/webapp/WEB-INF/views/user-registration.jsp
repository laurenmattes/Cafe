<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Registration</title>
</head>
<body>

	<form action="/user-registration-result">
		<table>
			<tr>
				<label for="firstname">First Name:</label> <input type="text" name="firstname" id="firstname" required minlength="2" maxlength="10" />
			
				<label> Last Name:</label> <input id="lasntname" name="lastname" pattern="[A-Z][a-z]*"/>
			</tr>
				
		
		</table>
		<button>Submit</button>
	</form>
	
</body>
</html>