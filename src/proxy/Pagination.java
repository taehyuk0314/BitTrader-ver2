package proxy;


import javax.servlet.http.HttpServletRequest;

import enums.Action;
import lombok.Data;
import service.CategoryServiceImpl;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

@Data
public class Pagination implements Proxy{	
	private int pageNum, pageSize, blockSize, startRow, endRow, startPage, endPage, prevBlock, nextBlock,rowCount,pageCount;
	private boolean existPrev,existNext;
	@Override
	public void carryOut(Object o) {
		System.out.println("페이지네이션 캐리아웃 내부");
		HttpServletRequest request = (HttpServletRequest)o;
		String _pageNum = request.getParameter("page_num");
		pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);
		System.out.println("페이지번호: "+pageNum);
		String _pageSize = request.getParameter("page_size");
		pageSize = (_pageSize == null) ? 5 : Integer.parseInt(_pageSize);
		System.out.println("페이지사이즈: "+pageSize);
		String _blockSize = request.getParameter("block_size");
		blockSize = (_blockSize == null) ? 5 : Integer.parseInt(_blockSize);
		System.out.println("불록사이즈: "+pageSize);
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS: case CUST_LIST:
			rowCount = CustomerServiceImpl.getInstance().countCustomers(null);
			break;
		case PROD_LIST:
			rowCount = ProductServiceImpl.getIntance().countProducts(null);
			break;
		case CATE_LIST :
			rowCount = CategoryServiceImpl.getIntance().countCategories(null);
		default:
			break;
		
		}
		System.out.println("전체 카운트: "+rowCount);
		int nmg = rowCount % pageSize;
		int pageCount = (nmg == 0)?rowCount / pageSize:rowCount / pageSize+1;
		startRow = (pageNum -1) *pageSize + 1;
		endRow = (rowCount > pageNum * pageSize)? pageNum * pageSize: rowCount;
		
		// 김창하의 블록넘버 방식
		int blockNum = (pageNum-1)/blockSize;
		if(existPrev) {
			startPage = blockNum*blockSize+1;
			
		}else {
			startPage = 1;
		}
		endPage = startPage+(blockSize-1);
		// 김이레의 매쓰함수 방식
		endPage = (int)(Math.ceil(pageNum / (double) blockSize) * blockSize);
		startPage = (endPage - blockSize) + 1;
		
		// 김승아의 얼추이해한 방식
		startPage = pageNum -((pageNum-1)%blockSize);
		endPage = startPage+(blockSize-1);
		
		// 위 세조건 모두 공통
		if(endPage>pageCount) {
			endPage = pageCount;
		}
		
		existPrev = (startPage - pageSize) > 0;
		existNext = (startPage + pageSize) <= pageCount;
		prevBlock = startPage - pageSize; 
		nextBlock = startPage + pageSize;
		System.out.println("스타트로우 : "+startRow);
		System.out.println("엔드로우 : "+endRow);
	}
}
