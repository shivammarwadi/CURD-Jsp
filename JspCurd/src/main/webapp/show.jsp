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

<title>show data</title>
</head>
<body>
<%@include file="navbar.jsp" %>


 <div>
<form class="form-inline my-2 my-lg-0 p-3 d-flex justify-content-center" action="datashow.jsp">
	<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="sear">
	<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>
</div> 

<%!
       StudentDao dao;

		public void init() throws ServletException
		{
				dao=new StudentDao();
		}
%>

	<% List<student>list=dao.showStudent(); %>

	<% Iterator<student>itr=list.iterator(); %>
	
	
	
	<table class="table table-hover  table-striped text-center" id="dtBasicExample">
	<thead>
	<tr>
      <th scope="col">Id</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Address</th>
      <th scope="col">City</th>
      <th colspan="2">Action</th>
    </tr>
        
  </thead>
		<% 
         while(itr.hasNext()){
        	 student stud=itr.next();
         %>
 <tbody>
       <tr>
       <td><%=stud.getStud_id()%></td>
      <td><%=stud.getFirst_name()%></td>
      <td><%=stud.getLast_name()%></td>
       <td><%=stud.getAddress()%></td>
       <td><%=stud.getCity()%></td>
        <td><% out.print("<a href='DeleteStudent?StudID="+stud.getStud_id()+"'>"+"DELETE"+"</a>"); %>
        &nbsp;&nbsp;&nbsp;&nbsp;<% out.print("<a href='Edit.jsp?StudID="+stud.getStud_id()+"'>"+"UPDATE"+"</a>"); %></td> 
	   </tr> 
	          	 
      <%  } %>
 </tbody>
	</table>



</body>
</html>