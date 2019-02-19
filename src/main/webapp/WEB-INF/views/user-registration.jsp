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

	<form action="/user-registration-result" method="post">
		<table>
			<tr>
				<td><label for="firstName">First Name:</label> <input type="text" name="firstName" id="firstName" required minlength="2" maxlength="10" />
				</td>
				
				
				<td><label for="lastName">Last Name:</label> <input type="text" id="lastName" name="lastName" pattern="[A-Z][a-z]*"/>
				</td>
			</tr>
			<tr>
				<td><label for="socialSecurity">SSN#:</label><input type="password" name="socialSecurity"  id="socialSecuirty">
				</td>
				<td><label for="shoeSize" >Shoe Size:</label><input type="number" name="shoeSize" id="shoeSize" max="18">
			</td>
			</tr>
		
		</table>
		<button>Submit</button>
	</form>
	
</body>
</html>