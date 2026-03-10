package com.wipro.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataDemo {
	public static void main(String[] args) {


		Connection conn = DBUtil.getDBConnection();
		
		
		try {
			DatabaseMetaData  md =   conn.getMetaData();
			
			
						System.out.println(md.getDriverName());
						
						System.out.println(md.getURL());
						
						System.out.println(md.getUserName());
						
				ResultSet rs =		md.getTableTypes();
				
					while(rs.next()) {
						
					System.out.println(rs.getString(1));
						
					}
					
					
					
					
					
					
				String schema =	conn.getSchema();
				
				System.out.println(schema);
					
					
					
					
					
					
					
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

}

