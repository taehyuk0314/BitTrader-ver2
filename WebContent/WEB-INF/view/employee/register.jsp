<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">사원 등록</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">이  름</span>
  <input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon1" id="name" name="name">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">매니저 </span>
  <input type="text" class="form-control" placeholder="manager" aria-describedby="sizing-addon1" id="manager" name="manager">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">생년월일</span>
  <input type="text" class="form-control" placeholder="birthday" aria-describedby="sizing-addon1" id="birthday" name="birthday">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">사  진</span>
  <input type="text" class="form-control" placeholder="photo" aria-describedby="sizing-addon1" id="photo" name="photo">
</div>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="basic-addon1">상  세</span>
  <input type="text" class="form-control" placeholder="notes" aria-describedby="sizing-addon1" id="notes" name="notes">
</div>
<button type="button" class="btn btn-default navbar-btn" id="confirm_btn">확 인</button>
<button type="button" class="btn btn-default navbar-btn" id="cancel_btn">취 소</button>
	    <input type="hidden" name="cmd" value="register" />
	    <input type="hidden" name="page" value="access" />
</form>	
	</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var name = $('#name').val();
	var manager = $('#manager').val();
	var birthday = $('#birthday').val();
	var photo = $('#photo').val();
	var notes = $('#notes').val();
	$('#form')
	.attr('action', '${ctx}/employee.do')
	.submit();
});
</script>
