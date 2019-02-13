package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setName(request.getParameter("name"));
			emp.setPhoto(request.getParameter("photo"));
			emp.setManager(request.getParameter("manager"));
			emp.setNotes(request.getParameter("notes"));
			emp.setBirthDate(request.getParameter("birthday"));
			EmployeeServiceImpl.getIntance().registEmployee(emp);
			break;
		case SIGNUP:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusid"));
			cus.setCustomerName(request.getParameter("cusname"));
			cus.setPassword(request.getParameter("pass"));
			cus.setSsn(request.getParameter("ssn"));
			cus.setPhone(request.getParameter("phone"));
			cus.setPostalCode(request.getParameter("post"));
			cus.setAddress(request.getParameter("add"));
			cus.setCity(request.getParameter("city"));
			CustomerServiceImpl.getInstance().registCustomer(cus);
			break;
		default:
			break;
		}
	}
}
