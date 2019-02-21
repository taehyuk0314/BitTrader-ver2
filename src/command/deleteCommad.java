package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import enums.Action;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class deleteCommad extends Command {
	public deleteCommad(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_DELETE :
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("customerID"));
			CustomerServiceImpl.getInstance().removeCostomer(cus);
			
			break;
		default:
			break;
		
		}
	}
	
}
