package command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;

public class RetrieveCommand extends Command{
	public RetrieveCommand(Map<String, Proxy> pxy) {
	super(pxy);
	CustomerDTO cus = new CustomerDTO();
	ImageDTO img = new ImageDTO();
	System.out.println("여기로 이동");
	RequestProxy req = (RequestProxy) pxy.get("req");
	HttpServletRequest request = req.getRequest();
	cus.setCustomerID(request.getParameter("customerID"));   
	System.out.println("아이디 넘어온 갑 "+request.getParameter("customerID"));
	cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
	System.out.println("cust갔다온값 : "+cus);
	img.setImgSeq(cus.getPhoto());
	img =ImageServiceImpl.getInstance().retrieveImage(img);
	request.setAttribute("cust", cus);
	request.setAttribute("image", img);
	}
	
}
