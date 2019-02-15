package proxy;

import javax.servlet.http.HttpServletResponse;

import lombok.Data;
@Data
public class ResponseProxy implements Proxy{
	private HttpServletResponse response;
	@Override
	public void carryOut(Object o) {
		System.out.println("--------4프록시리스폰---------");
			setResponse((HttpServletResponse) o);		
	}
}
