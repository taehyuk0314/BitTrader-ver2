package proxy;


import javax.servlet.http.HttpServletRequest;

import command.Receiver;
import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Capable{
	private String pageNum, pageSize, blockSize, startRow, endRow, startPage, endPage, prevBlock, nextBlock;
	private int totalCount;
	private boolean existPrev,existNext;
	@Override
	public void carryOut() {
		HttpServletRequest req = Receiver.cmd.getRequest();
		this.pageSize = req.getParameter("page_size");
		pageSize = (pageSize==null)?"5":pageSize;
		this.pageNum = req.getParameter("page_num");
		this.totalCount = CustomerServiceImpl.getInstance().countCustomers();
		this.startRow="";
		this.endRow="";
			
	}
}
