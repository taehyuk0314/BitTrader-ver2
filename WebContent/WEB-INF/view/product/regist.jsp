<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">고객 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">공급자 이름</span>
  <input type="text" class="form-control" placeholder="공급자명" aria-describedby="sizing-addon1" id="supplierID" name="supplierID">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">받는 사람</span>
  <input type="text" class="form-control" placeholder="받는사람" aria-describedby="sizing-addon1" id="supplierName" name="supplierName">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">주소</span>
  <input type="text" class="form-control" placeholder="주소" aria-describedby="sizing-addon1" id="add" name="add">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">상세주소</span>
  <input type="text" class="form-control" placeholder="상세주소" aria-describedby="sizing-addon1" id="city" name="city">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">우편번호</span>
  <input type="text" class="form-control" placeholder="우편번호" aria-describedby="sizing-addon1" id="post" name="post">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">국적</span>
  <input type="text" class="form-control" placeholder="국적" aria-describedby="sizing-addon1" id="country" name="country">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">핸드폰번호</span>
  <input type="text" class="form-control" placeholder="핸드폰번호" aria-describedby="sizing-addon1" id="phone" name="phone">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">상품이름</span>
  <input type="text" class="form-control" placeholder="상품이름" aria-describedby="sizing-addon1" id="productName" name="productName">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">갯수</span>
  <input type="text" class="form-control" placeholder="갯수" aria-describedby="sizing-addon1" id="unit" name="unit">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">가격</span>
  <input type="text" class="form-control" placeholder="가격" aria-describedby="sizing-addon1" id="price" name="price">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">카테고리네임</span>
  <input type="text" class="form-control" placeholder="카테고리네임" aria-describedby="sizing-addon1" id="categoryName" name="categoryName">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">상세정보</span>
  <input type="text" class="form-control" placeholder="상세정보" aria-describedby="sizing-addon1" id="description" name="description">
</div>
</form>
</div>

<div class="grid-item">
<button type="button" class="btn btn-primary" id="photo_btn" >사진수정</button>
</div>
<div class="grid-item" style="width: 100%">
<button type="button" class="btn btn-primary" id="update_btn" >수  정</button>
</div>
<div class="grid-item" style="width: 100%">
<button type="button" class="btn btn-danger" id="delete_btn" >삭  제</button>
</div>

<jsp:include page="../home/bottom.jsp"/>
<script>
	$('#update_btn').click(function(){
		alert('수정버튼클릭');
		location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=update&customerID=${cust.customerID}');
	});
	$('#file_upload_btn').click(function(){
		alert('사진수정');
		$('#file_form')
		.attr('method','post')
		.attr('action','${ctx}/customer.do?cmd=cust_file_upload&page=detail&customerID=${cust.customerID}')
		.attr('enctype','multipart/form-data')
		.submit();
	});
	$('#delete_btn').click(function(){
		alert('삭제버튼클릭');
		location.assign('${ctx}/customer.do?cmd=cust_delete&dir=home&page=main&customerID=${cust.customerID}');
	});
	
</script>
