package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO cus);
	public List<CustomerDTO> selectCustomers();
	public List<CustomerDTO> selectCustomerByNames(String customerName);
	public CustomerDTO selectCustomerByID(String customerID);
	public int countCustomers();
	public String existCustomer(String CustomerID);
	public void updateCostomer(CustomerDTO cus);
	public void deleteCostomer(CustomerDTO cus);
}
