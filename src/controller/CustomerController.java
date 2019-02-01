package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer.do")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String dir = request.getServletPath().split("/")[1].replace(".do", "");
		String page = request.getParameter("page");
		System.out.println("cmd"+cmd);
		System.out.println("dir"+dir);
		System.out.println("page"+page);
		switch(cmd) {
		case "move":
		request.getRequestDispatcher("/WEB-INF/view/"+dir+"/"+page+".jsp")
		.forward(request, response);break;
		}
	}

}