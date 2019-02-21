package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.ProductDTO;
import enums.ProductSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class ProductDAOImpl implements ProductDAO{
	private static ProductDAOImpl instance = new ProductDAOImpl();
	private ProductDAOImpl() {}
	public static ProductDAOImpl getInstance() {return instance;}
	@Override
	public void insertProduct(ProductDTO pro) {
		String sql = "";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			int rs = ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이저장되었음");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<ProductDTO> selectProductsList(Proxy pxy) {
		List<ProductDTO> list = new ArrayList<>();
		try {
			Pagination page = ((PageProxy) pxy).getPage();
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(ProductSQL.LIST.toString());
			String startRow = String.valueOf(page.getStartRow());
			String endRow =String.valueOf(page.getEndRow());
			System.out.println("DAO 스타트 로우 : "+ startRow);
			System.out.println("DAO 엔드 로우"+ endRow);
			ps.setString(1, startRow);
			ps.setString(2, endRow);
			ResultSet rs =ps.executeQuery();
			ProductDTO pro = null;
			while(rs.next()) {
				pro = new ProductDTO();
				pro.setProductID(rs.getString("PRODUCT_ID"));
				pro.setProductName(rs.getString("PRODUCT_NAME"));
				pro.setSupplierID(rs.getString("SUPPLIER_ID"));
				pro.setCategoryID(rs.getString("CATEGORY_ID"));
				pro.setUnit(rs.getString("UNIT"));
				pro.setPrice(rs.getString("PRICE"));
				list.add(pro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<ProductDTO> selectProducts(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProductDTO selectProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countProducts(Proxy pxy) {
		int count = 0;
		String sql =ProductSQL.COUNT.toString();
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs  =ps.executeQuery();
			while(rs.next()) {
				count = rs.getInt("CO");
				
			}
			System.out.println("count는" +count);
		} 
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public boolean existProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

}
