package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, Object> retrievePhone(Proxy pxy);
}
