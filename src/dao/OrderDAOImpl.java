package dao;

import java.util.List;

import domain.EmployeeDTO;
import domain.OrderDTO;

public class OrderDAOImpl implements OrderDAO{
	private static OrderDAOImpl instance = new OrderDAOImpl();
	private OrderDAOImpl() {}
	public static OrderDAOImpl getInstance() {return instance;}
	@Override
	public void insertOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> selectOrdersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> selectOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO selectOrder(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existOrder(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

}
