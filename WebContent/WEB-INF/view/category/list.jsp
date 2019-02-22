<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<link rel="stylesheet" href="${css}/customer/list.css" />
<jsp:include page="../home/top.jsp"/>
<div class="grid-item" id="nav">
<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu" >
 	<div class="container" style="width: 200px">
  <ul class="list-group" id="cate_side_menu">
    <li class="list-group-item" style="background-color: #00000045" id="cate_list">카테고리 목록</li>
    <li class="list-group-item" id="cate_register">카테고리 등록</li>
    <li class="list-group-item" id="cate_search">카테고리 조회</li>
    <li class="list-group-item" id="cate_update">카테고리 수정</li>
    <li class="list-group-item" id ="cate_remove">카테고리 삭제</li>
  </ul>
</div>
</div>
<div class="grid-item" id="content">
	<div class="grid-item">
		<button type="button" class="btn btn-primary" id="product_resist">상품 추가</button>
	</div>
	<table id="cust_tab">
	  <tr>
	    <th>NO.</th>
	    <th>카테고리명</th>
	    <th>카테고리 설명</th>
	    <th>수정</th>
	    <th>삭제</th>
	  </tr>

	  <c:forEach items="${list}" var="category">	  
	  <tr>
	    <td>${category.categoryID}</td>
	    <td><a href="${ctx}/product.do?cmd=pro_retrieve&page=detail&productID=${category.categoryID}">${category.categoryName}</a></td>
	    <td>${category.description}</td>
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
$('#cate_register').click(()=>{
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_register').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'  <div class="form-group">'
+'    <label for="text">카테고리 이름:</label>'
+'    <input type="text" class="form-control" name="cate_name">'
+'  </div>'
+'  <div class="form-group">'
+'    <label for="text">상세 설명:</label>'
+'    <textarea rows="4" cols="50" class="form-control" name="desciption"></textarea>'
+'  </div>'
+'  <button type="submit" class="btn btn-default">등록</button>'
+'</form>');
});
$('#cate_search').click(function(){
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_search').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'  <div class="form-group">'
+'    <label for="text">카테고리 검색:</label>'
+'<select>'
+'<option name="cate_id" value="4002">스마트폰</option>'
+'+<option name="cate_id" value="4001">데스크톱</option>'
+'<option name="cate_id" value="4000">노트북</option>'
+'</select>'
+' </div>'
+'  <button type="submit" class="btn btn-default">등록</button>'
+'</form>');
});
$('#cate_remove').click(function(){
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_remove').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'<h1>삭제목록</h1>'
+'<form action="/action_page.php">'
+'<input type="checkbox" name="vehicle1" value="smartPhone">스마트폰<br>'
+'<input type="checkbox" name="vehicle2" value="dak">데스크톱<br>'
+'<input type="checkbox" name="vehicle3" value="noteBook" checked>노트북<br><br>'
+'<input type="submit" value="삭제">'
+'</form>'
+'</form>');
});
$('#cate_update').click(function(){
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_update').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'<div class="container">'
+'<h1>수정목록</h1>'
+'<form action="/action_page.php">'
+'<input type="radio" name="gender" value="male"> 스마트폰<br>'
+'<input type="radio" name="gender" value="female"> 노트북<br>'
+'<input type="radio" name="gender" value="other"> 데스크탑<br>'  
+'</form>'
+'  </div>'
+'<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">수정</button>'
+'<div class="modal fade" id="myModal" role="dialog">'
+'<div class="modal-dialog">'
+'<div class="modal-content">'
+'<div class="modal-header">'
+'<button type="button" class="close" data-dismiss="modal">&times;</button>'
+'<h4 class="modal-title">수정버튼클릭</h4>'
+'</div>'
+'<div class="modal-body">'
+'<p>'
+'    <label for="text">카테고리 이름:</label>'
+'    <input type="text" class="form-control" name="cate_name">'
+'  </div>'
+'  <div class="form-group">'
+'    <label for="text">상세 설명:</label>'
+'    <textarea rows="4" cols="50" class="form-control" name="desciption"></textarea>'
+'</p>'
+'</div>'
+'<div class="modal-footer">'
+'<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>'
+'</div>'
+'</div>'
+'</div>'
+'</div>'
+'</div>'
+'</form>');
});


</script>