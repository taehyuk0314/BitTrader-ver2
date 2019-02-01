package service;

import java.util.List;

import dao.OrderDetailDAOImpl;
import domain.OrderDetailDTO;


public class OrderDetailServiceImpl implements OrderDetailService{
	private static OrderDetailServiceImpl instance = new OrderDetailServiceImpl();
	private OrderDetailServiceImpl() {dao = OrderDetailDAOImpl.getInstance();}
	public static OrderDetailServiceImpl getInstance() {return instance;}
	OrderDetailDAOImpl dao;
	@Override
	public void registOrderDetail(OrderDetailDTO emp) {
		dao.insertOrderDetail(emp);
	}

	@Override
	public List<OrderDetailDTO> bringOrderDetailsList() {
		return dao.selectOrderDetailsList();
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord) {
		return dao.selectOrderDetails(searchWord);
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String searchWord) {
		return dao.selectOrderDetail(searchWord);
	}

	@Override
	public int countOrderDetails() {
		return dao.countOrderDetails();
	}

	@Override
	public boolean existOrderDetail(String searchWord) {
		return false;
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO emp) {
		dao.updateOrderDetail(emp);
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO emp) {
		dao.deleteOrderDetail(emp);
	}

}
