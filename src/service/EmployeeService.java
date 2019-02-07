package service;

import java.util.List;

import domain.EmployeeDTO;

public interface EmployeeService {
	public void registEmployee(EmployeeDTO emp);
	public List<EmployeeDTO> bringEmployeesList();
	public List<EmployeeDTO> retrieveEmployees(String searchWord);
	public EmployeeDTO retrieveEmployee(String searchWord);
	public int countEmployees();
	public boolean existEmployee(EmployeeDTO emp);
	public void modifyEmployee(EmployeeDTO emp);
	public void removeEmployee(EmployeeDTO emp);
}
