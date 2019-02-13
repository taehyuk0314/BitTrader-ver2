package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command{
	public ExistCommand(Map<String,Proxy> pxy) {
		super(pxy);
		System.out.println("--------익지스트 커멘드----------");
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		HttpSession session = request.getSession();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getIntance().existEmployee(emp);
			if(exist) {
				System.out.println("접근허용 exist : "+exist);
				Proxy paging = new Pagination();
				paging.carryOut(request);
				Proxy pagePxy = new PageProxy();
				pagePxy.carryOut(paging);
				List<CustomerDTO> list =CustomerServiceImpl.getInstance().bringCustomers(pagePxy);
				System.out.println(request.getParameter("page_num"));
				request.setAttribute("list", list);
			}else {
				System.out.println("접근불가");
				super.setDomain("home");
				super.setPage("main");;
				super.execute();
			}
			break;
		case SIGNIN:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusid"));
			cus.setPassword(request.getParameter("pass"));
			cus =CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			if(cus!=null) {
				System.out.println("접근가능"+cus);
				session.setAttribute("customer", cus);
			}else {
				System.out.println("접근불가능"+cus);
				super.setDomain("customer");
				super.setPage("signin");
				super.execute();
			}
		break;
		default:
			break;
		
		}
		System.out.println("ExistCommand 내부: "+Receiver.cmd.getView());
	}

}
