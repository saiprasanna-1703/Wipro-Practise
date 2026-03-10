package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","rps@123");
			System.out.println("Connection Successful");
		}
		catch(Exception e)
		{	}
	}		

}