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
 	<h1><font style="font-size: 30px">상품 등록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
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
</form>
</div>

<div class="grid-item" style="width: 100%">
<button type="button" class="btn btn-primary" id="regist_btn" >등록</button>
</div>
<div class="grid-item" style="width: 100%">
<button type="button" class="btn btn-primary" id="cancel_btn" >취소</button>
</div>


<jsp:include page="../home/bottom.jsp"/>
<script>
	$('#regist_btn').click(function(){
		$('#form')
		.attr('method','post')
		.attr('action','${ctx}/product.do?cmd=pro_regist&page=regist')
		.submit();
	});
	$('#cancel_btn').click(function(){
		location.assign('${ctx}/product.do?cmd=move&page=regist');
	});
	
</script>
