package service;

import java.util.List;

import domain.OrderDetailDTO;

public interface OrderDetailService {
	public void registOrderDetail(OrderDetailDTO orderD);
	public List<OrderDetailDTO> bringOrderDetailsList();
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord);
	public OrderDetailDTO retrieveOrderDetail(String searchWord);
	public int countOrderDetails();
	public boolean existOrderDetail(String searchWord);
	public void modifyOrderDetail(OrderDetailDTO orderD);
	public void removeOrderDetail(OrderDetailDTO orderD);
}
