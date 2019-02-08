package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command{
	public ExistCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request, response);
		HttpSession session = request.getSession();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getIntance().existEmployee(emp);
			if(exist) {
				System.out.println("접근허용");
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
