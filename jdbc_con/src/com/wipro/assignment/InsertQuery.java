package com.wipro.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuery {
  public static void main(String[] args) {
	  try {
	  Connection conn=dbUtil.getConnection();
	  String InsertQuery="insert into  customers (customer_id, customer_name,phone__number) values(?,?,?)";
	
		PreparedStatement pstmt=conn.prepareStatement(InsertQuery);
		pstmt.setInt(1,88);
		pstmt.setString(2, "javeed");
		pstmt.setInt(3, 82937424);
		int count=pstmt.executeUpdate();
		System.out.println(count+"rows effected");
		 conn.close();
		
	} 
	  
	  catch(SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }}
	  
