package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class CustomerDAOImpl implements CustomerDAO{
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {}
	public static CustomerDAOImpl getInstance() {return instance;}

	@Override
	public void insertCustomer(CustomerDTO cus) {
		try {
			String sql =CustomerSQL.SIGNUP.toString();
			System.out.println(sql);
			PreparedStatement ps=DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection()
			.prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getCustomerName());
			ps.setString(3, cus.getPassword());
			ps.setString(4, cus.getSsn());
			ps.setString(5, cus.getPhoto());
			ps.setString(6, cus.getPhone());
			ps.setString(7, cus.getCity());
			ps.setString(8, cus.getAddress());
			ps.setString(9, cus.getPostalCode());
			int rs = ps.executeUpdate();
			System.out.println((rs==1)?"회원입력성공":"회원입력실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<CustomerDTO> selectCustomerList(Proxy pxy) {
		System.out.println("-----list로 들어옴------");
		ArrayList<CustomerDTO> list = new ArrayList<>();
		try {
			Pagination page = ((PageProxy) pxy).getPage();
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(CustomerSQL.LIST.toString());
			String startRow = String.valueOf(page.getStartRow());
			String endRow =String.valueOf(page.getEndRow());
			System.out.println("DAO 스타트 로우 : "+ startRow);
			System.out.println("DAO 엔드 로우"+ endRow);
			ps.setString(1, startRow);
			ps.setString(2, endRow);
			ResultSet rs =ps.executeQuery();
			CustomerDTO cust = null;
			while(rs.next()) {
				cust = new CustomerDTO();
				        cust.setCustomerID(rs.getString("CUSTOMER_ID"));
				        cust.setCustomerName(rs.getString("CUSTOMER_NAME"));
				        cust.setSsn(rs.getString("SSN"));
				        cust.setPhone(rs.getString("PHONE"));
				        cust.setCity(rs.getString("CITY"));
				        cust.setAddress(rs.getString("ADDRESS"));
				        cust.setPostalCode(rs.getString("POSTALCODE"));
				        cust.setRnum(rs.getString("RNUM"));
				        list.add(cust);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list+"입니다");
		System.out.println("사이즈는 : "+list.size());
		return list;
	}

	@Override
	public List<CustomerDTO> selectCustomerByNames(Proxy pxy) {
		ArrayList<CustomerDTO> list = new ArrayList<>();
		try {
			String sql ="";
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				list.add(null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public CustomerDTO selectCustomer(CustomerDTO cus) {
		CustomerDTO cust = null;
		try {
			String sql = CustomerSQL.SIGNIN.toString();
			PreparedStatement ps = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getPassword());
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				cust = new CustomerDTO();
				cust.setAddress(rs.getString("ADDRESS"));
				cust.setCity(rs.getString("CITY"));
				cust.setCustomerID(rs.getString("CUSTOMER_ID"));
				cust.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cust.setPassword(rs.getString("PASSWORD"));
				cust.setPostalCode(rs.getString("POSTALCODE"));
				cust.setSsn(rs.getString("SSN"));
				cust.setPhone(rs.getString("PHONE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}

	@Override
	public int countCustomers(Proxy pxy) {
		int count = 0;
		String sql =CustomerSQL.ROW_COUNT.toString();
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				count =rs.getInt("COUNT");
			}
			System.out.println("카운트는 : "+count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
		boolean ok = false;
		try {
			String sql = CustomerSQL.SIGNIN.toString();
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ok =true;
			}		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("접근허용 "+ok);
		return ok;
	}

	@Override
	public void updateCostomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCostomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map<String, Object> selectPhone(Proxy pxy) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			String sql = CustomerSQL.PHONE.toString();
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			CustomerDTO cus = null;
			while(rs.next()) {
				cus = new CustomerDTO();
				String entry =rs.getString("CUSTOMER_ID");
				cus.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cus.setPhone(rs.getString("PHONE"));
				map.put(entry, cus);
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
