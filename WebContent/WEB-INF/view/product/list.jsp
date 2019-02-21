<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<link rel="stylesheet" href="${css}/category/navi.css" />
<link rel="stylesheet" href="${css}/customer/list.css" />
<jsp:include page="../home/top.jsp"/>
<div class="grid-item" id="nav">
<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">상품 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
	<div class="grid-item">
		<button type="button" class="btn btn-primary" id="product_resist">상품 추가</button>
	</div>
	<table id="cust_tab">
	  <tr>
	    <th>상품 번호</th>
	    <th>상품 이름</th>
	    <th>공급번호</th>
	    <th>카테고리번호</th>
	    <th>갯수</th>
	    <th>가격</th>
	    <th>수정</th>
	    <th>삭제</th>
	  </tr>
	  
	  <c:forEach items="${list}" var="pro">	  
	  <tr>
	    <td>${pro.productID}</td>
	    <td><a href="${ctx}/product.do?cmd=pro_retrieve&page=detail&productID=${pro.productID}">${pro.productName}</a></td>
	    <td>${pro.supplierID}</td>
	    <td>${pro.categoryID}</td>
	    <td>${pro.unit}</td>
	    <td>${pro.price}</td>
	    <td><button type="button" class="btn btn-primary">수정</button></td>
	    <td><button type="button" class="btn btn-danger">삭제</button></td>
	    
	  </tr>
	  </c:forEach>	  

	</table>
	
	<div style="height: 50px"></div>    	
	<div class="center">
	  <div class="pagination">
	  <form id="form" name="form">
	  <c:if test='${pagination.existPrev}'>
	  <a href='${ctx}/customer.do?cmd=cust_list&page=list&page_size=5&page_num=${pagination.prevBlock}'>&laquo;</a>
	  </c:if>
	  <c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" varStatus="status">
	  <c:choose>
	  	<c:when test="${pagination.pageNum eq status.index}" >
	  	 	<a href="#"class='page active'>${status.index}</a>
	  	</c:when>
	  	<c:otherwise>
	  	 	<a href="#"class='page'>${status.index}</a>
	  	</c:otherwise>
	  </c:choose>
	  </c:forEach>
	  <c:if test='${pagination.existNext}'>
	  <a href='${ctx}/customer.do?cmd=cust_list&page=list&page_size=5&page_num=${pagination.nextBlock}'>&raquo;</a>
	  </c:if>
	  </form>
	  </div>	  
	</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#product_resist').click(function(){
	location.assign('${ctx}/product.do?cmd=move&page=regist');
});
</script>