<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu" >
	<form id="file_form" >
		<img src="${img}/${image.imgName}.${image.imgExtention}"style="width: 400px; height: 400px " >
		<input type="file" name="file_upload"/>
		<input type="submit" id="file_upload_btn"/>
	
	</form>
</div>
<div class="grid-item" id="content" >
	<form id="form">
		검색한 사람의 정보<br />
		아이디 ${cust.customerID} <br /> 
		이름 ${cust.customerName} <br /> 
		생년월일 ${cust.ssn} <br /> 
		성별 : 남 <br />
		전화번호 ${cust.phone} <br /> 
		우편번호 ${cust.postalCode} <br /> 
		주소 ${cust.city} <br /> 
		상세주소 ${cust.address} <br />
	</form>
</div>
<div class="grid-item">
<button type="button" class="btn btn-primary" id="photo_btn" >사진수정</button>
</div>
<div class="grid-item" style="width: 100%">
<button type="button" class="btn btn-primary" id="update_btn" >수  정</button>
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
</script>
