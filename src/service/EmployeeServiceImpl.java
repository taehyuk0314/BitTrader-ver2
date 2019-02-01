package service;

import java.util.List;

import dao.EmployeeDAOImpl;
import domain.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService{
	private static EmployeeServiceImpl intance = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {dao=EmployeeDAOImpl.getInstance();}		
	public static EmployeeServiceImpl getIntance() {return intance;}
	EmployeeDAOImpl dao;
	@Override
	public void registEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
	}

	@Override
	public List<EmployeeDTO> bringEmployeesList() {
		return dao.selectEmployeesList();
	}

	@Override
	public List<EmployeeDTO> retrieveEmployees(String searchWord) {
		return dao.selectEmployees(searchWord);
	}

	@Override
	public EmployeeDTO retrieveEmployee(String searchWord) {
		return dao.selectEmployee(searchWord);
	}

	@Override
	public int countEmployees() {
		return dao.countEmployees();
	}

	@Override
	public boolean existEmployee(String searchWord) {
		return false;
	}

	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		dao.updateEmployee(emp);
	}

	@Override
	public void removeEmployee(EmployeeDTO emp) {
		dao.deleteEmployee(emp);
	}

}
