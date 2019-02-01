package service;

import java.util.List;

import dao.CustomerDAOImpl;
import domain.CustomerDTO;

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
	public List<CustomerDTO> bringCustomers() {
		return dao.selectCustomers();
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByNames(String customerName) {
		return dao.selectCustomerByNames(customerName);
	}

	@Override
	public CustomerDTO retrieveCustomerByID(String customerID) {
		return dao.selectCustomerByID(customerID);
	}

	@Override
	public int countCustomers() {
		return dao.countCustomers();
	}

	@Override
	public boolean existCustomer(String CustomerID) {
		return false;
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
