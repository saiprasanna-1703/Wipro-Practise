package com.wipro.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcSteps {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","rps@123");
			System.out.println("connection done");
			Statement stmt=conn.createStatement();
			// String  insertQuery = "insert into dept values(60,'Training','Mysore')";
			
			//String updateQuery ="update Dept set location = 'Jaipur' , dname = 'L&D' where dno = 60";	
				
				int dno = 60;
				
				String deleteQuery = "delete from Dept where dno ="+dno;
				
				int count =    stmt.executeUpdate(deleteQuery);
				
				System.out.println(count +" record effected...");
				
				  conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
