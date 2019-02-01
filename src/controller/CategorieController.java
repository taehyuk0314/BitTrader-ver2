package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CategorieService;
import service.CategorieServiceImpl;


@WebServlet("/categorie.do")
public class CategorieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CategorieService service = CategorieServiceImpl.getIntance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


}
