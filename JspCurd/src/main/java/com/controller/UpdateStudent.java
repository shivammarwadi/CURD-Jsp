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


@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();	
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
			 int i=StudentDao.updateStudent(s);
			 
			 if(i>0)
			 {
				pw.println("<h2>Data Updated</h2>");
				RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
				rd.include(request, response);
			 }
			 else
			 {
				 pw.println("<h2>Data not Updated</h2>");
			 }
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
