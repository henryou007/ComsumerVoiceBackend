package edu.upenn.cis350.util;

import java.sql.*;

public class DBHelper {

	private Connection con=null;
	private Statement stmt=null;
	ResultSet rs=null;


	public DBHelper() throws Exception{

		String url = "jdbc:mysql://fling.seas.upenn.edu:3306/youjin?useUnicode=true&characterEncoding=utf8";
		Class.forName("com.mysql.jdbc.Driver");
		
		String userName = "youjin";
		String password = "youjin";
		this.con = DriverManager.getConnection(url,userName,password);

	}
	
	public  ResultSet executeQuery(String sql) throws Exception
	{
		try
		{   
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   
			rs=stmt.executeQuery (sql);
		}
		catch(SQLException e){throw e;}
		return rs;
	}
	
	
	
	public boolean executeUpdate(String sql) throws Exception
	{
		try
		{  
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   
			stmt.executeUpdate(sql);
			return true;
		}
		catch(SQLException ex) 
		{
			System.err.println("SQL Exception: " + ex.getMessage());
			return false;
		}
	}

	public void all_close()  
	{  
		try{
			if(con!=null)
				con.close();

			if(rs!=null)
				rs.close();
		}  
		catch(SQLException e){e.printStackTrace();}  
	}  

	public static void main(String[] args) throws Exception
	{
		DBHelper db = new DBHelper();
	}
}
