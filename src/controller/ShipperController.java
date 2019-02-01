package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ShipperService;
import service.ShipperServiceImpl;

@WebServlet("/shipper.do")
public class ShipperController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShipperService service = ShipperServiceImpl.getInstance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}



}
