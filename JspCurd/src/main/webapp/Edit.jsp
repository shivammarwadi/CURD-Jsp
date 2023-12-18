<%@page import="java.sql.Connection"%>
<%@page import="com.utility.connect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.dao.StudentDao"%>
    
<%@page import="java.util.Iterator"%>
<%@page import="com.model.student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<%!
  StudentDao dao;

public void init() throws ServletException{
	
	dao=new StudentDao();
}

%>

<%

	 int cid=Integer.parseInt(request.getParameter("StudID")); 
	 student s=dao.getElementById(cid);
%>
			<form id="reg-form" action="UpdateStudent" method="Get">
						
					<div class="form-group">
							<label>Student Id</label> 
							<input type="text" value="<%=cid %>"  class="form-control"
								placeholder="Enter Studid" name="studid" readonly>
						</div>

						<div class="form-group">
							<label>First Name</label> <input type="text" class="form-control"
								placeholder="Enter first name" name="studfirname" value="<%=s.getFirst_name()%>"> <small
								id="emailHelp" class="form-text text-muted"></small>
						</div>

						<div class="form-group">
							<label>Last Name</label> <input type="text" class="form-control"
								placeholder="enter last name" name="studlstname" value="<%=s.getLast_name()%>">
						</div>

						<div class="form-group">
							<label>Address</label><br> <input type="text"
								class="form-control" placeholder="address" name="address" value="<%=s.getAddress()%>">
						</div>


						<div class="form-group">
							<label>City</label><br> <input type="text"
								class="form-control" placeholder="city" name="city" value="<%=s.getCity()%>">
						</div>

						<button type="submit" class="btn btn-outline-success float-right">Submit</button>
						<button class="btn btn-outline-warning float-right"
							style="margin-right: 7px">Reset</button>
					</form>
		
</body>
</html>