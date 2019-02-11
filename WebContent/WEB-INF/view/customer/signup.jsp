<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">회원 등록</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">I  D</span>
  <input type="text" class="form-control" placeholder="ID" aria-describedby="sizing-addon1" id="cusid" name="cusid">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">이  름</span>
  <input type="text" class="form-control" placeholder="name" aria-describedby="sizing-addon1" id="cusname" name="cusname">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">비밀번호</span>
  <input type="text" class="form-control" placeholder="password" aria-describedby="sizing-addon1" id="pass" name="pass">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">주민번호</span>
  <input type="text" class="form-control" placeholder="ssn" aria-describedby="sizing-addon1" id="ssn" name="ssn">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">핸드폰번호</span>
  <input type="text" class="form-control" placeholder="phone" aria-describedby="sizing-addon1" id="phone" name="phone">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">우편번호</span>
  <input type="text" class="form-control" placeholder="post" aria-describedby="sizing-addon1" id="post" name="post">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">주  소</span>
  <input type="text" class="form-control" placeholder="add" aria-describedby="sizing-addon1" id="add" name="add">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">상세 주소</span>
  <input type="text" class="form-control" placeholder="city" aria-describedby="sizing-addon1" id="city" name="city">
</div>
<button type="button" class="btn btn-default navbar-btn" id="confirm_btn">확 인</button>
<button type="button" class="btn btn-default navbar-btn" id="cancel_btn">취 소</button>
	    <input type="hidden" name="cmd" value="signup" />
	    <input type="hidden" name="page" value="signin" />
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var cusid = $('#cusid').val();
	var cusname = $('#cusname').val();
	var pass = $('#pass').val();
	var ssn = $('#ssn').val();
	var phone = $('#phone').val();
	var post = $('#post').val();
	var add = $('#add').val();
	var city = $('#city').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>
