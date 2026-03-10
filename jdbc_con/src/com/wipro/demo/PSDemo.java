package com.wipro.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSDemo {
	public static void main(String[] args) {
	Connection conn= DBUtil.getDBConnection();
	try {
	//String insertQuery="INSERT INTO dept VALUES(?,?,?)";
		//String updateQuery="UPDATE DEPT SET location=? where dno=?";
		String deleteQuery="DELETE FROM DEPT WHERE dno=?";
	PreparedStatement psDelete=conn.prepareStatement(deleteQuery);
	//Insertion
	//psInsert.setInt(1,70);
	//psInsert.setString(2,"Operator");
	//psInsert.setString(3, "Pune");
	//Update
	//psUpdate.setString(1, "Mumbai");
	//psUpdate.setInt(2, 70);
	//delete
	psDelete.setInt(1, 70);
	
	
	int DeleteCount=psDelete.executeUpdate();
	System.out.println(DeleteCount+" record deleted");
	conn.close();
	}
	
	catch(SQLException e) {
		e.printStackTrace();
		

	
	
	}	
	
}

}
