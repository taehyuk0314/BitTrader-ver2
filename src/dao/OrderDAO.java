package dao;

import java.util.List;

import domain.EmployeeDTO;
import domain.OrderDTO;

public interface OrderDAO {
	public void insertOrder(OrderDTO order);
	public List<OrderDTO> selectOrdersList();
	public List<OrderDTO> selectOrders(String searchWord);
	public OrderDTO selectOrder(String searchWord);
	public int countOrders();
	public boolean existOrder(EmployeeDTO emp);
	public void updateOrder(OrderDTO order);
	public void deleteOrder(OrderDTO order);
}
