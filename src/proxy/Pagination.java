package proxy;


import javax.servlet.http.HttpServletRequest;

import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Proxy{
	private int pageNum, pageSize, blockSize, startRow, endRow, startPage, endPage, prevBlock, nextBlock,rowCount,pageCount;
	private boolean existPrev,existNext;
	@Override
	public void carryOut(Object o) {
		System.out.println("페이지네이션 캐리아웃 내부");
		HttpServletRequest request = (HttpServletRequest) o;
		String _pageNum = request.getParameter("page_num");
		pageNum = (_pageNum==null)? 1:Integer.parseInt(_pageNum);
		System.out.println("pageNum : "+pageNum);
		String _pageSize =request.getParameter("Page_size");
		pageSize = (_pageSize== null)? 5 : Integer.parseInt(_pageSize);
		System.out.println("pageSize 는 : "+pageSize);
		String _blockSize = request.getParameter("Block_size");
		blockSize = (_blockSize==null)? 5 : Integer.parseInt(_blockSize);
		rowCount = CustomerServiceImpl.getInstance().countCustomers(null);
		System.out.println("전체카운트는 : "+rowCount);
		pageCount = rowCount / pageSize;
		startRow = (pageNum-1)*pageSize +1;
		endRow = (rowCount> pageNum * pageSize)?pageNum * pageSize:rowCount;
		
		
		
//		startRow =rowCount-(pageNum*pageSize)+1;
//		if(rowCount % pageSize !=0) {
//			pageCount = pageCount+1;
//			startRow =1;
//		}else {
//			startRow =rowCount-(pageNum*pageSize)+1;
//		}
//		endRow = rowCount-((pageNum-1)*pageSize);
//		System.out.println("페이지 카운트는 "+pageCount);
	}
}
