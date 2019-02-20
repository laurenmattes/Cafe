<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Encapsulation</title>
</head>
<body>

	Welcome, click <a href="user-registration">here</a> to be encapsulated!
	<div class="container">
		<h1>Items</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="items" items="${items}">
				<tr>
					<td><a href ="/" ${items.name }></a></td>
					<td>${items.description}</td>
					<td>${items.quantity}</td>
					<td>${items.price}</td> 
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>