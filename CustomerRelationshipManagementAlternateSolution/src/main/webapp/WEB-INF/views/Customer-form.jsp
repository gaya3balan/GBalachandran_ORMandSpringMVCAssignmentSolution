<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
<style>
	
	.title-container{
		 background-color:purple;
		    width: 100vw;
            height:100px;  
            text-align:center;
	}
	
	.title-container h3{
		color:white;
		padding:35px;
		text-align:center;
	}
	
	
</style>

<title>Save Customer</title>
</head>

<body>
		<div class="title-container"> 
			<h3>CUSTOMER RELATIONSHIP MANAGEMENT</h3>
		</div>
		
		<hr>

<body>

	<div class="container">

         <br>
         <br>
		<h3>Save Customer</h3>
		<hr>

		<p class="h4 mb-4"></p>

		<form action="/CustomerRelationshipManagementAlternateSolution/customers/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Customer.id}" />

			<div class="form-inline">
				<input type="text" name="firstname" value="${Customer.firstname}"
					class="form-control mb-4 col-4" placeholder="First Name">

			</div>

			<div class="form-inline">

				<input type="text" name="lastname" value="${Customer.lastname}"
					class="form-control mb-4 col-4" placeholder="Last Name">

			</div>

			<div class="form-inline">

				<input type="text" name="email" value="${Customer.email}"
					class="form-control mb-4 col-4" placeholder="Email">

			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/CustomerRelationshipManagementAlternateSolution/customers/list">Back to List</a>

	</div>
</body>

</html>










