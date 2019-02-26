var ctx ="${ctx}";
$('.page').click(function(){
	location.assign(
			ctx + '/customer.do?cmd=cust_list&page=list&page_num='+$(this).text());
});
$('#cate_register').click(()=>{
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_register').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'  <div class="form-group">'
+'    <label for="text">카테고리 이름:</label>'
+'    <input type="text" class="form-control" name="cate_name">'
+'  </div>'
+'  <div class="form-group">'
+'    <label for="text">상세 설명:</label>'
+'    <textarea rows="4" cols="50" class="form-control" name="desciption"></textarea>'
+'  </div>'
+'  <button type="submit" class="btn btn-default">등록</button>'
+'</form>');
});
$('#cate_search').click(()=>{
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_search').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'  <div class="form-group">'
+'    <label for="text">카테고리 검색:</label>'
+'<select>'
+'<option name="cate_id" value="4002">스마트폰</option>'
+'+<option name="cate_id" value="4001">데스크톱</option>'
+'<option name="cate_id" value="4000">노트북</option>'
+'</select>'
+' </div>'
+'  <button type="submit" class="btn btn-default">등록</button>'
+'</form>');
});
$('#cate_remove').click(()=>{
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_remove').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'<h1>삭제목록</h1>'
+'<form action="/action_page.php">'
+'<input type="checkbox" name="vehicle1" value="smartPhone">스마트폰<br>'
+'<input type="checkbox" name="vehicle2" value="dak">데스크톱<br>'
+'<input type="checkbox" name="vehicle3" value="noteBook" checked>노트북<br><br>'
+'<input type="submit" value="삭제">'
+'</form>'
+'</form>');
});
$('#cate_update').click(()=>{
	$('#cate_side_menu>li').attr('style','background-color: white');
	$('#cate_update').attr('style','background-color: #00000045');
	$('#content').html('<form id=form">'
+'<div class="container">'
+'<h1>수정목록</h1>'
+'<form action="/action_page.php">'
+'<input type="radio" name="gender" value="male"> 스마트폰<br>'
+'<input type="radio" name="gender" value="female"> 노트북<br>'
+'<input type="radio" name="gender" value="other"> 데스크탑<br>'  
+'</form>'
+'  </div>'
+'<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">수정</button>'
+'<div class="modal fade" id="myModal" role="dialog">'
+'<div class="modal-dialog">'
+'<div class="modal-content">'
+'<div class="modal-header">'
+'<button type="button" class="close" data-dismiss="modal">&times;</button>'
+'<h4 class="modal-title">수정버튼클릭</h4>'
+'</div>'
+'<div class="modal-body">'
+'<p>'
+'    <label for="text">카테고리 이름:</label>'
+'    <input type="text" class="form-control" name="cate_name">'
+'  </div>'
+'  <div class="form-group">'
+'    <label for="text">상세 설명:</label>'
+'    <textarea rows="4" cols="50" class="form-control" name="desciption"></textarea>'
+'</p>'
+'</div>'
+'<div class="modal-footer">'
+'<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>'
+'</div>'
+'</div>'
+'</div>'
+'</div>'
+'</div>'
+'</form>');
});