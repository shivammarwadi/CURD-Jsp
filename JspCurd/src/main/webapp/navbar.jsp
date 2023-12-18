<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>navbar</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark ">
		<a class="navbar-brand  text-white" href="index.jsp">Student</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse pl-4" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active px-2"><a class="nav-link  text-white" href="index.jsp">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item px-2"><a class="nav-link  text-white" href="#"
					data-toggle="modal" data-target="#addmodel">Add Student</a></li>
				<li class="nav-item px-2"><a class="nav-link  text-white" href="show.jsp">Show
						Student</a></li>

			</ul>
		</div>
	</nav>
	
	<!--Add student -->

	<div class="modal" id="addmodel">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header text center bg-primary">
					<h4 class="modal-title">Add Student Here..</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form id="reg-form" action="AddStudent" method="Get">
						
						<div class="form-group">
							<label>Student Id</label> <input type="text" class="form-control"
								placeholder="Enter Studid" name="studid">
						</div>

						<div class="form-group">
							<label>First Name</label> <input type="text" class="form-control"
								placeholder="Enter first name" name="studfirname"> <small
								id="emailHelp" class="form-text text-muted"></small>
						</div>

						<div class="form-group">
							<label>Last Name</label> <input type="text" class="form-control"
								placeholder="enter last name" name="studlstname">
						</div>

						<div class="form-group">
							<label>Address</label><br> <input type="text"
								class="form-control" placeholder="address" name="address">
						</div>


						<div class="form-group">
							<label>City</label><br> <input type="text"
								class="form-control" placeholder="city" name="city">
						</div>

						<button type="submit" class="btn btn-outline-success float-right">Submit</button>
						<button class="btn btn-outline-warning float-right"
							style="margin-right: 7px">Reset</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!--Add student End -->










</body>
</html>