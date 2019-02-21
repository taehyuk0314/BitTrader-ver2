package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

public class ListCommand extends Command{
	public ListCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();

		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_LIST:
			Proxy paging = new Pagination();
			Proxy pagePxy = new PageProxy();
			paging.carryOut(request);
			pagePxy.carryOut(paging);
			List<CustomerDTO> list =CustomerServiceImpl.getInstance().bringCustomers(pagePxy);
			request.setAttribute("list", list);
			request.setAttribute("pagination", paging);
			break;
		case PROD_LIST:
			paging = new Pagination();
			pagePxy = new PageProxy();
			paging.carryOut(request);
			pagePxy.carryOut(paging);
			List<ProductDTO> lis =ProductServiceImpl.getIntance().bringProductsList(pagePxy);
			request.setAttribute("list", lis);
			request.setAttribute("pagination", paging);
			break;
		default:
			break;
		}
	}
	
}
