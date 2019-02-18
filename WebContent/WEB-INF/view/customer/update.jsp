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
검색한 사람의 정보
아이디 : ${cust.customerID} <br /> 
<input type="hidden" name="customerID" value="${cust.customerID}"/>
이름 : ${cust.customerName} <br /> 
생년월일 : ${cust.ssn} <br /> 
성별 : 남 <br />
전화번호 : <input type="text" id="phone" name="phone"placeholder="${cust.phone}"/> <br />
<input type="hidden" name="phone2" value="${cust.phone}"/>  
우편번호 : <input type="text" id="postalCode" name="postalCode" placeholder="${cust.postalCode}"/> <br />
<input type="hidden" name="postalCode2" value="${cust.postalCode}"/> 
주소 : <input type="text" id="city" name="city"placeholder="${cust.city}"/> <br />
<input type="hidden" name="city2" value="${cust.city}"/> 
상세주소 <input type="text" id="address" name="address" placeholder="${cust.address}"/> <br />
<input type="hidden" name="address2" value="${cust.address}"/>
임시비밀번호 <input type="text" id="password" name="password" placeholder="${cust.password}"/>
<input type="hidden" name="password2" value="0000"/>
<input type="hidden" name="cmd" value="cust_update"/>
<input type="hidden" name="page" value="detail"/>
</form>
</div>
<div class="grid-item">
<button type="button" class="btn btn-primary" id="update_btn">확인</button>
<button type="button" class="btn btn-danger" id="cancel_btn">취소</button>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
	$('#update_btn').click(function(){
		alert('확인버튼클릭');
		$('#form').attr('action','${ctx}/customer.do').submit();
		$('#form').attr('method','post').submit();
	});
	$('#cancel_btn').click(function(){
		alert('취소버튼클릭');
	});
	
</script>
