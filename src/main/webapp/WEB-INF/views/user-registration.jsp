<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/style.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cafe Registration</title>
</head>
<body>

	<form action="/user-registration-result" method="post">
		<table>
			<tr>
			<td><label>First Name </label></td>
				<td><input type="text" name="firstName" id="firstName" placeholder="Lauren" required minlength="2" maxlength="10" />
				</td>
				
				<td><label>Last Name </label></td>
				<td><input type="text" id="lastName" name="lastName" placeholder="Mattes" pattern="[A-Z][a-z]*"/>
				</td>
			</tr>
			<tr>
			<td><label>Social Security Number </label></td>
				<td><input type="password" name="socialSecurity"  id="socialSecuirty" placeholder="238568">
				</td>
				<td><label>Shoe Size</label></td>
				<td><input type="number" name="shoeSize" id="shoeSize" placeholder="8" max="18">
			</td>
			</tr>
		
		</table>
		<button href="user-registration-result" class="btn btn-dark">Submit</button>
	</form>
	<!-- BOOTSTRAP -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	
</body>
</html>