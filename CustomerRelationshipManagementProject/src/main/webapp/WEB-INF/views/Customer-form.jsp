<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
		 background-color:green;
		    width: 100vw;
            height:100px;  
            text-align:center;
	}
	
	.title-container h3{
		color:black;
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

	<div class="container">

          <br>
		
		<p class="h4 mb-4">Save Customer</p>

		<form action="save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Customer.id}" />

			
			<table class="formcontrols" > 

    <tr>
        <td>
            <label for="first_Name">First Name:</label>
        </td>
        <td  style="padding-left:100px;" text-align:center>
            <input id="first_Name" input type="text" name="first_Name" value="${Customer.firstName}"  placeholder="First Name"/>
            
        </td>
    </tr>
    
    <tr>
        <td>
            <label for="last_Name">Last Name:</label>
        </td>
        <td  style="padding-left:100px;">
            <input id="last_Name" input type="text" name="last_Name" value="${Customer.lastName}" placeholder="Last Name"/>
        </td>
    </tr>


    <tr>
        <td>
            <label for="email">Email:</label>
        </td>
        <td  style="padding-left:100px;">
            <input id="email" input type="text" name="email" value="${Customer.email}"  placeholder="Email"/>
        </td>
    </tr>


<tr>
        <td>
            <label > </label>
             <label > </label>
              <label > </label>
        </td>
    </tr>

</table>

<button type="submit" class="btn btn-info col-2">Save</button>

		</form>
		
		 <br>
		 <br>
		 
		<a href="list">Back to Customer List</a>

	</div>
	
</body>
</html>