package com.wipro.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
	public static void main(String[] args) {
       
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC","root","rps@123");
			System.out.println("conncection successfull");
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM dept";
			ResultSet rs=stmt.executeQuery(query);
			while (rs.next()) {
				int dno=rs.getInt("dno");
				String dname=rs.getString("dname");
				String location=rs.getString("location");
				System.out.println(dno+" "+dname+" "+location);
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
