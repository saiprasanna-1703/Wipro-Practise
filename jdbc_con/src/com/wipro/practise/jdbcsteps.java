package com.wipro.practise;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcsteps {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","rps@123");
			System.out.println("conncection succesfull");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
