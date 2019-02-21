package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Receiver;
import service.ProductService;
import service.ProductServiceImpl;


@WebServlet("/product.do")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service = ProductServiceImpl.getIntance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request, response);
		Carrier.forward(request, response);
	}


}
