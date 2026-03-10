package com.wipro.practise;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statementpractise {
	public static void main(String[] args) {
		//inserting using statement
	//	Connection conn=dbutil.getConnection();
		//try {
		//	Statement stmt=conn.createStatement();
	//		String insertQuery="insert into customer values(88,'krishna','2026-01-01',23333,'guntur','kerela')";
		//	int count=stmt.executeUpdate(insertQuery);
//			System.out.println(count+"rows effected");
	//		conn.close();
	//	} catch (SQLException e) {
		//	// TODO Auto-generated catch block
//			e.printStackTrace();
	//	}
		//updating using statement
	//	Connection conn=dbutil.getConnection();
//		try {
	//	Statement stmt=conn.createStatement();
	//	String updateQuery="update customer set city='kerela' where cid=88";
//		int  count=stmt.executeUpdate(updateQuery);
	//	System.out.println(count+" rows effected");
		//conn.close();
	//	}
//		catch(SQLException e) {
	//		e.printStackTrace();
		Connection conn=dbutil.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
		
		String selectQuery="select * from customer";
		ResultSet rslt=stmt.executeQuery(selectQuery);
			while(rslt.next()) {
				int cid=rslt.getInt("cid");
				String cname=rslt.getString("cname");
				Date dob=rslt.getDate("dob");
				String city=rslt.getString("city");
				String state=rslt.getString("state");
				System.out.println(cid+" "+cname+" "+dob+" "+city+" "+state);
				
				
				
				
					
}
			conn.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

}
