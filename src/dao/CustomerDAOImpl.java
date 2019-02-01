package dao;

import java.util.List;

import domain.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO{
	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {}
	public static CustomerDAOImpl getInstance() {return instance;}

	@Override
	public void insertCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> selectCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomerByNames(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomerByID(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existCustomer(String CustomerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCostomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCostomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

}
