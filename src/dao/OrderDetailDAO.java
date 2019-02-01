package dao;

import java.util.List;

import domain.OrderDetailDTO;


public interface OrderDetailDAO {
	public void insertOrderDetail(OrderDetailDTO orderD);
	public List<OrderDetailDTO> selectOrderDetailsList();
	public List<OrderDetailDTO> selectOrderDetails(String searchWord);
	public OrderDetailDTO selectOrderDetail(String searchWord);
	public int countOrderDetails();
	public String existOrderDetail(String searchWord);
	public void updateOrderDetail(OrderDetailDTO orderD);
	public void deleteOrderDetail(OrderDetailDTO orderD);
}
