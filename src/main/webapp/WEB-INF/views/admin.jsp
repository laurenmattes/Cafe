<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- BOOTSTRAP STYLE SHEET -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Admin</title>
</head>
<body>
<%@include file="partials/header.jsp" %>
<div class="container">
		<h1>Items</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th><th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="items" items="${items}">
				<tr>
					<td><a href ="/edit${id }"></a> ${items.name}</td>
					<td>${items.description}</td>
					<td>${items.quantity}</td>
					<td>${items.price}</td>
					<td> <a href="/item/update?id=${ items.id }" class="btn btn-light btn-sm">Edit</a>
						<a href="/item/delete?id=${ items.id }" class="btn btn-light btn-sm">Delete</a>
					</td> 
					
				
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/add-item" class="btn btn-info" role="button">Add Item</a>
	</div>

</body>
</html>