package proxy;

import lombok.Data;

@Data
public class Proxy implements Capable{
	private Pagination page;
	public Proxy() {carryOut();}
	@Override
	public void carryOut() {
		this.page =new Pagination();
		page.carryOut();
		
	}

}
