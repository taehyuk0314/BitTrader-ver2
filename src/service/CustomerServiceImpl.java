package service;

import java.util.List;
import java.util.Map;

import dao.CustomerDAOImpl;
import domain.CustomerDTO;
import proxy.Proxy;

public class CustomerServiceImpl implements CustomerService{
	private static CustomerServiceImpl instance = new CustomerServiceImpl();
	private CustomerServiceImpl() {dao = CustomerDAOImpl.getInstance();}
	public static CustomerServiceImpl getInstance() {return instance;}
	CustomerDAOImpl dao;
	@Override
	public void registCustomer(CustomerDTO cus) {
		dao.insertCustomer(cus);
	}

	@Override
	public List<CustomerDTO> bringCustomers(Proxy pxy) {
		return dao.selectCustomerList(pxy);
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByNames(Proxy pxy) {
		return dao.selectCustomerByNames(pxy);
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		return dao.selectCustomer(cus);
	}


	@Override
	public int countCustomers(Proxy pxy) {
		return dao.countCustomers(pxy);
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
		return dao.existCustomerID(cus);
	}

	@Override
	public void modifyCostomer(CustomerDTO cus) {
		dao.updateCostomer(cus);
	}

	@Override
	public void removeCostomer(CustomerDTO cus) {
		dao.deleteCostomer(cus);
	}
	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
		return dao.selectPhone(pxy);
	}

}
