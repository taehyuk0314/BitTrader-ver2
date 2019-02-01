package service;

import java.util.List;

import domain.OrderDTO;


public interface OrderService {
	public void registOrder(OrderDTO order);
	public List<OrderDTO> bringOrdersList();
	public List<OrderDTO> retrieveOrders(String searchWord);
	public OrderDTO retrieveOrder(String searchWord);
	public int countOrders();
	public boolean existOrder(String searchWord);
	public void modifyOrder(OrderDTO order);
	public void removeOrder(OrderDTO order);
}
