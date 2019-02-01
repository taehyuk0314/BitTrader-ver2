package service;

import java.util.List;

import dao.OrderDAOImpl;
import domain.OrderDTO;

public class OrderServiceImpl implements OrderService{
	private static OrderServiceImpl instance = new OrderServiceImpl();
	private OrderServiceImpl() {dao = OrderDAOImpl.getInstance();}
	public static OrderServiceImpl getInstance() {return instance;}
	OrderDAOImpl dao;
	@Override
	public void registOrder(OrderDTO order) {
		dao.insertOrder(order);
	}

	@Override
	public List<OrderDTO> bringOrdersList() {
		return dao.selectOrdersList();
	}

	@Override
	public List<OrderDTO> retrieveOrders(String searchWord) {
		return dao.selectOrders(searchWord);
	}

	@Override
	public OrderDTO retrieveOrder(String searchWord) {
		return dao.selectOrder(searchWord);
	}

	@Override
	public int countOrders() {
		return dao.countOrders();
	}

	@Override
	public boolean existOrder(String searchWord) {
		return false;
	}

	@Override
	public void modifyOrder(OrderDTO order) {
		dao.updateOrder(order);
	}

	@Override
	public void removeOrder(OrderDTO order) {
		dao.deleteOrder(order);
	}

}
