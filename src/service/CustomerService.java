package service;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerService {
	public void registCustomer(CustomerDTO cus);
	public List<CustomerDTO> bringCustomers();
	public List<CustomerDTO> retrieveCustomerByNames(String customerName);
	public CustomerDTO retrieveCustomerByID(String customerID);
	public int countCustomers();
	public boolean existCustomer(String CustomerID);
	public void modifyCostomer(CustomerDTO cus);
	public void removeCostomer(CustomerDTO cus);
}
