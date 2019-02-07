<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">회원 등록</font></h1>
</div>

<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	    <div class="grid-item" id="item_1">회원번호</div>
	    <div class="grid-item" id="item_2"><input type="text" id="cusid" name="cusid" ></div>
	    <div class="grid-item" id="item_3">이름</div>
	    <div class="grid-item" id="item_4"><input type="text" id="cusname" name="cusname" ></div>
	    <div class="grid-item" id="item_5">비밀번호</div>
	    <div class="grid-item" id="item_6"><input type="text" id="pass" name="pass" ></div>
	    <div class="grid-item" id="item_7">주소</div>
	    <div class="grid-item" id="item_8"><input type="text" id="add" name="add" ></div>
	    <div class="grid-item" id="item_9">상세 주소</div>
	    <div class="grid-item" id="item_10"><input type="text" id="city" name="city" ></div>
	    <div class="grid-item" id="item_11">우편번호</div>
        <div class="grid-item" id="item_12"><input type="text" id="post" name="post" ></div>
	    <div class="grid-item" id="item_13">주민번호</div>
	    <div class="grid-item" id="item_14"><input type="text" id="ㄴ누" name="ssn" ></div>
	    <div class="grid-item" id="item_15"><input type="submit" id="confirm_btn" value='확 인'></div>
	    <div class="grid-item" id="item_16"><input type="reset" id="cancel_btn" value='취 소'> </div>
	    <input type="hidden" name="cmd" value="signup" />
	    <input type="hidden" name="page" value="signin" />
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var cusid = $('#cusid').val();
	var cusname = $('#cusname').val();
	var conname = $('#pass').val();
	var add = $('#add').val();
	var city = $('#city').val();
	var post = $('#post').val();
	var country = $('#ssn').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>
