package com.wipro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {
 public static Connection getDBConnection() {
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
