package service;

import java.util.List;

import dao.CustomerDAOImpl;
import domain.CustomerDTO;
import proxy.Pagination;

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
	public List<CustomerDTO> bringCustomers(Pagination page) {
		return dao.selectCustomers(page);
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByNames(String customerName) {
		return dao.selectCustomerByNames(customerName);
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		return dao.selectCustomer(cus);
	}

	@Override
	public int countCustomers() {
		return dao.countCustomers();
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

}
