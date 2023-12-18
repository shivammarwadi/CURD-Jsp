package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.model.student;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
	   String id=request.getParameter("StudID");
 		
		int id1=Integer.parseInt(id);
		student demp=new student(id1);
		try 
		{
			 int i=StudentDao.deleteStudent(demp);
			 
			 if(i>0)
			 {
				pw.println("<h2>Data Deleted</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
				rd.include(request, response);

			 }
			 else
			 {
				 pw.println("Data not Deleted");
			 }
			 
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		response.getWriter();
	}


}
