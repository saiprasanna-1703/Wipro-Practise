package com.wipro.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStmtSelect {
	public static void main(String[] args) {
		Connection conn=DBUtil.getDBConnection();
		String selectQuery="SELECT * FROM DEPT";
		try {
			PreparedStatement stmt=conn.prepareStatement(selectQuery);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("dname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
