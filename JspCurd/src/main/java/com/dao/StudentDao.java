package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.model.student;
import com.utility.connect;

public class StudentDao {
	
	

	public static int addStudent(student s) throws ClassNotFoundException, SQLException
	{
		Connection con=connect.getConnection();
		String sql="insert into studinfo values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.getStud_id());
		ps.setString(2, s.getFirst_name());
		ps.setString(3,s.getLast_name());
		ps.setString(4, s.getAddress());
		ps.setString(5, s.getCity());
		
		return ps.executeUpdate();
	}	
	
	
	
	public List<student> showStudent() throws ClassNotFoundException, SQLException
	{
		List<student> ls=new ArrayList<student>();
		Connection con=connect.getConnection();
		String sql="select * from studinfo";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet s=ps.executeQuery();
		
		while(s.next())
		{
			student sd=new student();
			sd.setStud_id(s.getInt(1));
			sd.setFirst_name( s.getString(2));
			sd.setLast_name(s.getString(3));
			sd.setAddress(s.getString(4));
			sd.setCity( s.getString(5));
			ls.add(sd);
		}
		
		return ls;
	}
	
	
	public student getElementById(int Stud_id) throws SQLException, ClassNotFoundException {
		Connection con = connect.getConnection();
		String sql = "select * from studinfo where StudID=?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, Stud_id); 
		student sd = new student();
		ResultSet s = ps.executeQuery();
		
		while(s.next())
		{
			sd.setStud_id(s.getInt(1));
			sd.setFirst_name( s.getString(2));
			sd.setLast_name(s.getString(3));
			sd.setAddress(s.getString(4));
			sd.setCity( s.getString(5));
		}
		return sd;

	}
	
	public static  int deleteStudent(student d) throws ClassNotFoundException, SQLException
	{
		Connection con=connect.getConnection();
		String sql="delete from studinfo where StudID=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,d.getStud_id());
		
		return ps.executeUpdate();
	}
	


	public static int updateStudent(student s) throws ClassNotFoundException, SQLException
	{
		Connection con=connect.getConnection();
		String sql="update studinfo set FirstName=?,LastName=?,Address=?,City=? where StudID=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, s.getFirst_name());
		ps.setString(2,s.getLast_name());
		ps.setString(3, s.getAddress());
		ps.setString(4, s.getCity());
		ps.setInt(5, s.getStud_id());
		
		return ps.executeUpdate();
	}
	
	
	
	
	
	
	
}






