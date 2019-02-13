package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class ListCommand extends Command{
	public ListCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = new Pagination();
		paging.carryOut(request);
		Proxy pagePxy = new PageProxy();
		pagePxy.carryOut(paging);
		System.out.println(request.getParameter("cmd"));
		List<CustomerDTO> list =CustomerServiceImpl.getInstance().bringCustomers(pagePxy);
		request.setAttribute("list", list);
	}
	
}
