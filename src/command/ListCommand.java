package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CategoryServiceImpl;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

public class ListCommand extends Command{
	public ListCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = new Pagination();
		Proxy pagePxy = new PageProxy();
		paging.carryOut(request);
		pagePxy.carryOut(paging);
		List<?> list = new ArrayList<>();
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_LIST:
			list =CustomerServiceImpl.getInstance().bringCustomers(pagePxy);
			break;
		case PROD_LIST:
			list =ProductServiceImpl.getIntance().bringProductsList(pagePxy);
			break;
		case CATE_LIST:
			list =CategoryServiceImpl.getIntance().bringCategoriesList(pagePxy);
			break;
		default:
			break;
		}
		request.setAttribute("list", list);
		request.setAttribute("pagination", paging);
	}
	
}
