package com.wipro.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutil {
  public static void main(String[] args) {
	 
	  
  }
  public static Connection getConnection() {
	  Connection conn=null;
	  try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","rps@123");
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  return conn;
  }
}
