package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	public CreateCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request, response);
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
			cus.setAddress(request.getParameter("add"));
			cus.setCity(request.getParameter("city"));
			cus.setPostalCode(request.getParameter("post"));
			cus.setSsn(request.getParameter("ssn"));
			CustomerServiceImpl.getInstance().registCustomer(cus);
			break;
		default:
			break;
		}
	}
}
