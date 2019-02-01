package dao;

import java.util.List;

import domain.OrderDTO;

public interface OrderDAO {
	public void insertOrder(OrderDTO order);
	public List<OrderDTO> selectOrdersList();
	public List<OrderDTO> selectOrders(String searchWord);
	public OrderDTO selectOrder(String searchWord);
	public int countOrders();
	public boolean existOrder(String searchWord);
	public void updateOrder(OrderDTO order);
	public void deleteOrder(OrderDTO order);
}
