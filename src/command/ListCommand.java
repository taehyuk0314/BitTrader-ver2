package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import proxy.Proxy;
import service.CustomerServiceImpl;

public class ListCommand extends Command{
	public ListCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request, response);
		System.out.println(request.getParameter("cmd"));
		List<CustomerDTO> list =CustomerServiceImpl.getInstance().bringCustomers(new Proxy().getPage());
		request.setAttribute("list", list);
	}
	
}
