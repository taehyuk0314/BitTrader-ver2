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
	<img src="${img}/jung.png" class="img-responsive"  alt="Responsive image" style="height: 100%">
</div>
<div class="grid-item" id="content">
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
<button type="button" class="btn btn-primary" id="update_btn" >수정</button>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
	$('#update_btn').click(function(){
		alert('수정버튼클릭');
		location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=update&customerID=${cust.customerID}');
	});
	
</script>
