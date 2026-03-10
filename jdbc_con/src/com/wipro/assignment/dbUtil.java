package com.wipro.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
  public static Connection getConnection() {
	  Connection conn=null;
	  try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","rps@123");
		System.out.println("connected successfull");
		
	  }
	  catch(SQLException e) {
		  e.printStackTrace();
	  }
	  return conn;
	  
  }
}
