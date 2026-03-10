package com.wipro.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectQuery {
	public static void main(String[] args) {
		Connection conn=dbUtil.getConnection();
		String SelectQuery="select * from customers";
		try {
			PreparedStatement pstmt=conn.prepareStatement(SelectQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
