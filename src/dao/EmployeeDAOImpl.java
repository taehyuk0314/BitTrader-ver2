package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vendor;
import factory.DatabaseFactory;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {}
	public static EmployeeDAOImpl getInstance() {return instance;}

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {
			String sql =  EmployeeSQL.REGISTER.toString();
			System.out.println("실행하는 쿼리는 " +sql);
			Connection conn = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getManager());
			pstmt.setString(3, emp.getBirthDate());
			pstmt.setString(4, emp.getPhoto());
			pstmt.setString(5, emp.getNotes());
			int rs=pstmt.executeUpdate();
			System.out.println((rs==1)? "입력성공":"입력실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<EmployeeDTO> selectEmployeesList() {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement("");
			ResultSet rs = ps.executeQuery();
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
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		try {
			String sql = "";
			PreparedStatement ps = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {}
			list.add(null);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		EmployeeDTO cust = new EmployeeDTO();
		String sql = "";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cust;
	}

	@Override
	public int countEmployees() {
		int count = 0;
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement("");
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
	public boolean existEmployee(EmployeeDTO emp) {
		boolean ok = false;
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection()
					.prepareStatement(EmployeeSQL.EXIST.toString());
			ps.setString(1, emp.getEmployeeID());
			ps.setString(2, emp.getName());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ok= true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("접근허용"+ok);
		return ok;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		String sql = "";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		String sql = "";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
