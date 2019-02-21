<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">마이페이지</a>
    </div>

      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
        </div>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#" id="mypage">${cust.customerName}님의 페이지</a></li>

      </ul>
    </div>
</nav>
<script>
$('#mypage').click(function(){
	alert('마이페이지클릭');
	location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=detail&dir=customer&customerID=${cust.customerID}');
});
</script>