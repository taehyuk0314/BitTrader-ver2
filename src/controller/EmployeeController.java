
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Receiver;
import enums.Action;

@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request, response);
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case MOVE:
			Carrier.forward(request, response);
			break;
		case REGISTER:
			Carrier.forward(request, response);
			break;	
		default:
			break;
		}
	}
}