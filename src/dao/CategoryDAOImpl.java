package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.CategoryDTO;
import enums.CategorySQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class CategoryDAOImpl implements CategoryDAO{
	private static CategoryDAOImpl instance = new CategoryDAOImpl();
	private CategoryDAOImpl() {
		conn = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection();
	}
	public static CategoryDAOImpl getInstance() {return instance;}
	Connection conn;
	@Override
	public void insertCategorie(CategoryDTO cat) {
		
	}
	@Override
	public List<CategoryDTO> selectCategoriesList(Proxy pxy) {
		List<CategoryDTO> list = new ArrayList<>();
		String sql =CategorySQL.LIST.toString();
		try {
			Pagination page = ((PageProxy) pxy).getPage();
			PreparedStatement ps =conn.prepareStatement(sql);
			String startRow =String.valueOf(page.getStartRow());
			String endRow = String.valueOf(page.getEndRow());
			ps.setString(1, startRow);
			ps.setString(2, endRow);
			ResultSet rs =ps.executeQuery();
			CategoryDTO category = null;
			while(rs.next()) {
				category = new CategoryDTO();
				category.setCategoryID(rs.getString("CATEGORY_ID"));
				category.setCategoryName(rs.getString("CATEGORY_NAME"));
				category.setDescription("DESCRIPTION");
				list.add(category);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<CategoryDTO> selectCategories(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CategoryDTO selectCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countCategories(Proxy pxy) {
		int count =0;
		String sql =CategorySQL.COUNT.toString();
		try {
			PreparedStatement ps =conn.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				count = rs.getInt("COUNT");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public boolean existCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCategorie(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}


}
