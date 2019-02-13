package service;

import java.util.List;

import domain.CustomerDTO;
import proxy.Proxy;

public interface CustomerService {
	public void registCustomer(CustomerDTO cus);
	public List<CustomerDTO> bringCustomers(Proxy pxy);
	public List<CustomerDTO> retrieveCustomerByNames(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomers(Proxy pxy);
	public boolean existCustomerID(CustomerDTO cus);
	public void modifyCostomer(CustomerDTO cus);
	public void removeCostomer(CustomerDTO cus);
}
