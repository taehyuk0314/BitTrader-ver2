package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SupplierService;
import service.SupplierServiceImpl;

@WebServlet("/supplier.do")
public class SupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	SupplierService service = SupplierServiceImpl.getIntance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
