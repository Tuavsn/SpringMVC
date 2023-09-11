package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import model.CategoryModel;

public class CategoryDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<CategoryModel> getAllCategory() {
		List<CategoryModel> list = new ArrayList<CategoryModel>();
		String query = "SELECT * FROM banquanao.category";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new CategoryModel(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			
		}
		return list;
	}
}
