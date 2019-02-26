<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">HOME</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a id ="category">카테고리</a></li>
        <li><a href="#">사원</a></li>
        <li><a href="#">주문</a></li>
        <li><a href="#" id="product">상품</a></li>
        <li><a href="#">선박</a></li>
        <li><a href="#">공급업체</a></li>
      </ul>
    </div>
  </div>
</nav>
<script>
$('#category').attr('style','cursor:pointer').click(function(){
	location.assign('${ctx}/category.do?cmd=cate_list&page=list');
});
$('#product').click(function(){
	location.assign('${ctx}/product.do?cmd=prod_list&page=list');
});

</script>