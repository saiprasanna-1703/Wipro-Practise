package com.wipro.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
	public static void main(String[] args) {
		Connection conn=dbUtil.getConnection();
		String DeleteQuery="delete from customers where customer_name=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(DeleteQuery);
			pstmt.setString(1,"govinda");
			int count=pstmt.executeUpdate();
			System.out.println(count+ " rows effected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}