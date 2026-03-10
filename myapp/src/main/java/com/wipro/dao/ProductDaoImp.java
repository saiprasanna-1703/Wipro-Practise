package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.pogo.Product;

public class ProductDaoImp  implements IProductDao{

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		 Connection conn=DBUtil.getDBConnection();
		 String insert="insert into  Products values(?,?,?)";
		 int count=0;
		 try {
		 PreparedStatement pstmt=conn.prepareStatement(insert);
		 pstmt.setInt(1, p.getPid());
		 pstmt.setString(2, p.getPname());
		 pstmt.setDouble(3, p.getPrice());
		 count=pstmt.executeUpdate();
		 
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return count;
		 
		 }
		 
		 

}
