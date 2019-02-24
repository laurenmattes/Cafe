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
	<input type="hidden" name="id" value="${users.id}" />
		<table>
			<tr>
			<td class="form-group"><label for="firstName">First Name </label></td>
				<td><input class="form-control" type="text" name="firstName" value="${users.firstName }"id="firstName" required minlength="2" maxlength="10" />
				</td>
				</tr>
				<tr>
				
				<td class="form-group"><label for="lastName">Last Name </label></td>
				<td><input class="form-control"type="text" id="lastName" name="lastName" value="${users.lastName }" pattern="[A-Z][a-z]*"/>
				</td>
			</tr>
			<tr>
			<td class="form-group"><label for="socialSecurity">Social Security Number </label></td>
				<td><input class="form-control"type="password" name="socialSecurity" value="${users.socialSecurity }" id="socialSecuirty">
				</td>
				</tr>
			<tr>	
				<td class="form-group"><label for="shoeSize">Shoe Size</label></td>
				<td><input class="form-control" type="number" name="shoeSize" value="${users.shoeSize }"id="shoeSize" max="18">
			</td>
			</tr>
		
		</table>
		<button type="submit" class="btn btn-dark">Submit</button>
		<a href="/" class="btn btn-link">Cancel</a>
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