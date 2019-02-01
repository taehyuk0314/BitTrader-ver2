package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OrderDetailService;
import service.OrderDetailServiceImpl;


@WebServlet("/orderDetail.do")
public class OrderDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	OrderDetailService service = OrderDetailServiceImpl.getInstance();
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}
	
}
