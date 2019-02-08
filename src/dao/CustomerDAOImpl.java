package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;

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
			ps.setString(4, cus.getAddress());
			ps.setString(5, cus.getCity());
			ps.setString(6, cus.getPostalCode());
			ps.setString(7, cus.getSsn());
			int rs = ps.executeUpdate();
			System.out.println((rs==1)?"회원입력성공":"회원입력실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<CustomerDTO> selectCustomers() {
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
	public List<CustomerDTO> selectCustomerByNames(String customerName) {
		ArrayList<CustomerDTO> list = new ArrayList<>();
		try {
			String sql = "";
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
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}

	@Override
	public int countCustomers() {
		int count = 0;
		String sql ="";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				
			}
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

}
