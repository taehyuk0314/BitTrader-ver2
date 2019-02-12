package dao;

import java.util.List;

import domain.CustomerDTO;
import proxy.Pagination;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO cus);
	public List<CustomerDTO> selectCustomers(Pagination page);
	public List<CustomerDTO> selectCustomerByNames(String customerName);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public int countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	public void updateCostomer(CustomerDTO cus);
	public void deleteCostomer(CustomerDTO cus);
}
