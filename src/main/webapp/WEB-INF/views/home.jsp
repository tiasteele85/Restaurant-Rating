<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class="container">
		<h3>Restaurant Rating Review</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Restaurant Name</th>
					<th>Rating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="restaurant" items="${restaurants}">
					<tr>
						<td>${ restaurant.name }</td>
						<td>${ restaurant.rating }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>