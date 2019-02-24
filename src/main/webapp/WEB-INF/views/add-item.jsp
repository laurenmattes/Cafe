<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<main class="container">
		<h1>${ items }</h1>
		
		<!-- A form without an action submits back to the same URL, which is what we want here. -->
		<form action="add-item" method="post">
			<!-- We need to keep the ID and submit it with the form, but we don't want the user to have to see it. -->
			<input type="hidden" name="id" value="${item.id}" />
			<div class="form-group">
			    <label for="name">Name</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="name" name="name" value="${item.name}" required minlength="2" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="category">Description</label>
			    <input class="form-control" id="description" name="description" value="${item.description}" required>
			</div>
			<div class="form-group">
			    <label for="description">Quantity</label>
			    <input class="form-control" id="quantity" name="quantity" value="${item.quantity}">
			</div>
			<div class="form-group">
			    <label for="description">Price</label>
			    <input class="form-control" id="price" name="price" value="${item.price}">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/admin" class="btn btn-link">Cancel</a>
		</form>
	</main>

</body>
</html>