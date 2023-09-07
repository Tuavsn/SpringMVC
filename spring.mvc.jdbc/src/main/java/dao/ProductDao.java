package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.ProductModel;

public class ProductDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<ProductModel> getAllProduct() {
		List<ProductModel> list = new ArrayList<ProductModel>();
		String query = "SELECT * FROM banhoaqua.product ORDER BY ProductID DESC LIMIT 4";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new ProductModel(
						rs.getInt(1)
						, rs.getString(2)
						, rs.getString(3)
						, rs.getInt(4)
						, rs.getString(5)
						, rs.getInt(6)
						, rs.getInt(7)
						, rs.getInt(8)));
			}
		} catch (Exception e) {
			
		}
		return list;
	}
}
