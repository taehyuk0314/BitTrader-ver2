package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home.do")
public class HomeConteroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("ctx", request.getContextPath());
		session.setAttribute("css", session.getAttribute("ctx")+"/resources/css/");
		session.setAttribute("js", session.getAttribute("ctx")+"/resources/js/");
		session.setAttribute("img", session.getAttribute("ctx")+"/resources/img/");
		if(session.getAttribute("employee")==null) {
			request.setAttribute("compo", "register");
		}else {
			request.setAttribute("compo", "access");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/home/main.jsp");
		rd.forward(request, response);
	}
}