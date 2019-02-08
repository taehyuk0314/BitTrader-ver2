package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO cus);
	public List<CustomerDTO> selectCustomers();
	public List<CustomerDTO> selectCustomerByNames(String customerName);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public int countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	public void updateCostomer(CustomerDTO cus);
	public void deleteCostomer(CustomerDTO cus);
}
