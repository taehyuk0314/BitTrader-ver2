package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Receiver {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request, 
			HttpServletResponse response) {
		cmd= Commander.order(request,response);
		System.out.println("리시버는"+Receiver.cmd.getView());
	};
}
