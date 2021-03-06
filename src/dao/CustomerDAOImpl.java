package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.prism.Image;

import domain.CustomerDTO;
import domain.ImageDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.ImageProxy;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import service.ImageServiceImpl;

public class CustomerDAOImpl implements CustomerDAO{
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {
		conn= DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection();
	}
	public static CustomerDAOImpl getInstance() {return instance;}
	Connection conn;
	 
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
			ps.setString(5, cus.getPhone());
			ps.setString(6, cus.getPostalCode());
			ps.setString(7, cus.getCity());
			ps.setString(8, cus.getAddress());
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
			
			ResultSet rs =ps.executeQuery();
			CustomerDTO cust = null;
			while(rs.next()) {
				cust = new CustomerDTO();
				list.add(cust);
			}
			System.out.println(list);
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
			System.out.println("커스터머이동");
			String sql =(cus.getPassword()==null)?CustomerSQL.RETRIEVE.toString() : CustomerSQL.SIGNIN.toString();
			PreparedStatement ps = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			if(cus.getPassword()!=null) {
				ps.setString(2, cus.getPassword());
			} 
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				cust = new CustomerDTO();
				cust.setAddress(rs.getString("ADDRESS"));
				cust.setCity(rs.getString("CITY"));
				cust.setCustomerID(rs.getString("CUSTOMER_ID"));
				cust.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cust.setPhone(rs.getString("PHONE"));
				cust.setPassword(rs.getString("PASSWORD"));
				cust.setPostalCode(rs.getString("POSTALCODE"));
				cust.setSsn(rs.getString("SSN"));
				cust.setPhoto(rs.getString("PHOTO"));
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
		String sql =CustomerSQL.UPDATE.toString();
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, cus.getPhone());
			ps.setString(2, cus.getPostalCode());
			ps.setString(3, cus.getCity());
			ps.setString(4, cus.getAddress());
			ps.setString(5, cus.getPassword());
			ps.setString(6, cus.getCustomerID());
			int rs =ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이들어감");
			}else {
				System.out.println("값넣기 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCostomer(CustomerDTO cus) {
		String sql ="delete from customers where customer_id like ?";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, cus.getCustomerID());
			int rs =ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이 삭제됨");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	@Override
	public Map<String, Object> selectProfile(Proxy pxy) {
		Map<String, Object> map = new HashMap<String, Object>();
		CustomerDTO cust = new CustomerDTO();
		try {
			String sql ="";
			ImageProxy ipxy = (ImageProxy)pxy;
			ImageDAOImpl.getInstance().createImage(((ImageProxy) pxy).getImg());
			
			String imgSeq = ImageDAOImpl.getInstance().lastImageSeq();
			System.out.println("라스트 이미지는  "+imgSeq);
			sql ="UPDATE CUSTOMERS SET PHOTO =? WHERE CUSTOMER_ID LIKE ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, imgSeq);
			ps.setString(2, ipxy.getImg().getOwner());
			ps.executeUpdate();
			
			cust.setCustomerID(ipxy.getImg().getOwner());
			cust = selectCustomer(cust);
			map.put("cust", cust);
			String seq = ImageDAOImpl.getInstance().lastImageSeq();
			ImageDTO img = new ImageDTO();
			img.setImgSeq(seq);
			System.out.println(img.toString());
			img= ImageDAOImpl.getInstance().selectImage(img);
			System.out.println("셀렉트이미지: "+img.toString());
			map.put("image", img);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
