package com.wipro.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CSDemo {
	public static void main(String[] args) {


		Connection conn =		DBUtil.getDBConnection();
		
		 CallableStatement cstmt;
		try {
			cstmt = conn.prepareCall("{ call INSERT_DEPT() }");
			
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
