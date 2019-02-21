<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/category/navi.css" />
<link rel="stylesheet" href="${css}/category/main.css" />
<div class="grid-item1" id="nav">
<jsp:include page="categorynavi.jsp"/>
</div>
        <div class="thumbnail">
          <img src="${img}/iphone.jpg" data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">스마트폰<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
       <div class="thumbnail">
          <img src="${img}/mag.jpg " data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">노트북<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
       <div class="thumbnail">
          <img src="${img}/desk.jpg " data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">데스크탑<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>

<jsp:include page="../home/bottom.jsp"/>  
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});
$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access')
})
</script>