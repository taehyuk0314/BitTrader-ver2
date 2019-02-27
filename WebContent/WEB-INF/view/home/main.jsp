<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="top.jsp"/>
<link rel="stylesheet" href="${css}/home/main.css" />
    <div class="grid-item" id="left">
    	고객 전용<br /><br />
    	<a href="#" id="cust_join" >회원가입</a><br />
    	<a href="#" id="cust_login" >로 그 인</a>
    </div>
    <div class="grid-item" id="right">
    	직원 전용<br /><br />
    	<a href="#" id="emp_register" >사원등록</a><br />
    	<a href="#" id="emp_access">접속승인</a>
    </div>
    
        <div class="grid-item" id="left">
    	객체지향<br /><br />
    	<a href="#" id="oop_access" >접속하기</a><br />
    </div>
    <div class="grid-item" id="right">
    	알고리즘<br /><br />
    	<a href="#" id="algo_access">접속하기</a>
<jsp:include page="bottom.jsp"/>  
    </div>
<script src="${js}/oop.js "></script>
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});
$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
});
$('#cust_join').click(function(){
	location.assign('customer.do?cmd=move&page=signup');
});
$('#cust_login').click(function(){
	location.assign('customer.do?cmd=move&page=signin');
});
$('#oop_access').click(function(){
	/* encap.main(); */
	/* inherit.main(); */
	cust.main();
});	

</script>