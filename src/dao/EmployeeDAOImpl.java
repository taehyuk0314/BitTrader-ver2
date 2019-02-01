package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existEmployee(String searchWord) {
		return null;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
