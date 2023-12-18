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

@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();	
		response.setContentType("text/html");
		
		String id=request.getParameter("studid");
		String fstname=request.getParameter("studfirname");
		String lstname=request.getParameter("studlstname");
		String add=request.getParameter("address");
		String city=request.getParameter("city");
		
		
		int id1=Integer.parseInt(id);
		
		student s=new student(id1,fstname,lstname,add,city);
		try
		{
			int i=StudentDao.addStudent(s);
			
			if(i>0)
			{
				out.print("<h2>Student Add Successfully</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.include(request, response);

			}
			else
			{
				out.print("Student Add Failed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
