package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.EmployeeDTO;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	public CreateCommand(HttpServletRequest request,HttpServletResponse response) {
		super(request, response);
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName(request.getParameter("name"));
		emp.setPhoto(request.getParameter("photo"));
		emp.setManager(request.getParameter("manager"));
		emp.setNotes(request.getParameter("notes"));
		emp.setBirthDate(request.getParameter("birthday"));
		EmployeeServiceImpl.getIntance().registEmployee(emp);
	}
}
