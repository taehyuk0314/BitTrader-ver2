package command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Data;

@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	public Command(HttpServletRequest request,HttpServletResponse response) {
		setRequest(request);
		execute();
	}
	public Command() {}
	@Override
	public void execute() {
		setAction(request.getParameter("cmd"));
		setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		setPage(request.getParameter("page"));
		view= "/WEB-INF/view/"+domain+"/"+page+".jsp";
	}
}
