package com.wipro.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {
 public static void main(String[] args) {
	 Connection conn=dbUtil.getConnection();
	 String UpdateQuery="update customers set customer_name=? where customer_id=?";
	 try {
		PreparedStatement pstmt=conn.prepareStatement(UpdateQuery);
		pstmt.setString(1, "govinda");
		pstmt.setInt(2, 88);
		int count=pstmt.executeUpdate();
		System.out.println(count+" row updated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
