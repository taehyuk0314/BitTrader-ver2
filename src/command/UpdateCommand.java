package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class UpdateCommand extends Command{
	public UpdateCommand(Map<String, Proxy> pxy) {
		super(pxy);
		System.out.println("업데이트 커멘드로 이동");
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		String phone2 = request.getParameter("phone2");
		String phone = request.getParameter("phone");
		phone =(phone=="")? phone2  : phone;
		
		String postalCode2 = request.getParameter("postalCode2");
		String postalCode = request.getParameter("postalCode");
		postalCode =(postalCode=="")? postalCode2 : postalCode;
		
		String city2 = request.getParameter("city2");
		String city = request.getParameter("city");
		city =(city=="")?city2:city;
		
		String address2 =request.getParameter("address2");
		String address = request.getParameter("address");
		address =(address=="")?address2:address;
		
		String password2 =request.getParameter("password2");
		String password = request.getParameter("password");
		password =(password=="")? password2:password;
		CustomerDTO cus = new CustomerDTO();
		cus.setCustomerID(request.getParameter("customerID"));
		cus.setPhone(phone);
		cus.setPostalCode(postalCode);
		cus.setCity(city);
		cus.setAddress(address);
		cus.setPassword(password);
		System.out.println("수정하려는 회원정보 : "+cus.toString());
		CustomerServiceImpl.getInstance().modifyCostomer(cus);
		request.setAttribute("cust", cus);
		
	}
}
