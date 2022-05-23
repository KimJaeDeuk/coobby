<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Simple Tables</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="/resources/admin/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/resources/admin/dist/css/adminlte.min.css">

<style>
	th{
		text-align:center;
	}
	
	.smallCate{margin-right : 1%;}
	
	.smallCateAdd{ margin-left : 2%;}
	
	.smallCateDel{ 
		margin-bottom : 5%;
		margin-left : 5px;
		}
	.tableLine {
		border-left: 1px solid gray;
	}
	.inputText{
		margin-bottom : 1%;
	}
	
</style>
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
		<!-- Navbar -->
		<jsp:include page="navbar/admin-nav.jsp" />

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>카테고리 관리</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Simple Tables</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<!-- /.col -->
					<div class="row">
					
					<div class="col-md-8">
						<div class="card">
							<!-- /.card-header -->
							<div class="card-body p-0">
							<form action="cateSave" method="post">
								<table class="table">
									<thead>
										<tr>
											<th style="width: 18%">대분류</th>
											<th class="tableLine">소분류</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><div class="btn btn-default btn-block 1">종류별</div></td>
											<td class="tableLine">
												<c:if test="${kindCate != null }">
													<c:forEach var="kind" items="${kindCate}">
														<span class="smallCate btn btn-default inputText" name="kind_name">
														${kind.kind_name}
														<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">
														  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
														  <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>
														</svg>
														<input type="hidden" name="kind_name" class="hiddenName" value="${kind.kind_name}"/>
														</span>
													</c:forEach>
												</c:if>
												<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="blue" class="bi bi-plus-circle smallCateAdd" viewBox="0 0 16 16">
		  											<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
		  											<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
												</svg>
											</td>
										</tr>
										<tr>
											<td><div class="btn btn-default btn-block 2">방법별</div></td>
											<td class="tableLine">
											<c:if test="${howCate != null }">
													<c:forEach var="how" items="${howCate}">
														<span class="smallCate btn btn-default inputText" name="how_name">
														${how.how_name}
														<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">
														  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
														  <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>
														</svg>
														<input type="hidden" name="how_name" class="hiddenName" value="${how.how_name}"/>
														</span>
													</c:forEach>
												</c:if>
											<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="blue" class="bi bi-plus-circle smallCateAdd" viewBox="0 0 16 16">
		  											<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
		  											<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
												</svg>
											</td>
										</tr>
										<tr>
											<td><div class="btn btn-default btn-block 3">재료별</div></td>
											<td class="tableLine">
											<c:if test="${ingrCate != null }">
													<c:forEach var="ingr" items="${ingrCate}">
														<span class="smallCate btn btn-default inputText" name="ingr_name">
														${ingr.ingr_name}
														<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">
														  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
														  <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>
														</svg>
														<input type="hidden" name="ingr_name" class="hiddenName" value="${ingr.ingr_name}"/>
														</span>
													</c:forEach>
												</c:if>
											<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="blue" class="bi bi-plus-circle smallCateAdd" viewBox="0 0 16 16">
		  											<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
		  											<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
												</svg>
											</td>
										</tr>
										<tr>
											<td><div class="btn btn-default btn-block 4">상황별</div></td>
											<td class="tableLine">
											<c:if test="${situCate != null }">
													<c:forEach var="situ" items="${situCate}">
														<span class="smallCate btn btn-default inputText" name="situ_name">
														${situ.situ_name}
														<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">
														  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
														  <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>
														</svg>
														<input type="hidden" name="situ_name" class="hiddenName" value="${situ.situ_name}"/>
														</span>
													</c:forEach>
												</c:if>
											<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="blue" class="bi bi-plus-circle smallCateAdd" viewBox="0 0 16 16">
		  											<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
		  											<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
												</svg>
											</td>
											
										</tr>
										<tr>
											<td colspan="2">
												<div class="btn btn-default btn-lg btn-block saveAll">전체 저장</div>
											</td>
										</tr>
									</tbody>
								</table>
								</form>
							</div>
							<!-- /.card-body -->
						</div>
						<!-- /.card -->
					</div>
					<div class="col-md-4">
						<div class="card">
							<!-- /.card-header -->
							<div class="card-body p-0">
								<table class="table">
									<thead>
										<tr>
											<th colspan="2" >수 정</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td colspan="2" class="bCateParent"></td>
										</tr>
										<tr>
											<td><span class="btn btn-default cateType">소분류</span></td>
											<td><input type="text" class="form-control cateModify"/></td>
										</tr>
										<tr>
											<td colspan="2"><button type="button" class="btn btn-default modify">등록 / 수정</button></td>
										</tr>
									</tbody>
								</table>
							</div>
							<!-- /.card-body -->
						</div>
						<!-- /.card -->
					</div>
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="/resources/admin/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script
		src="/resources/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script src="/resources/admin/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="/resources/admin/dist/js/demo.js"></script>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script>
		$(function(){
			let smallChoose;
			let className;
			//소분류를 클릭했을때 수정 혹은 등록을 할 수 있게
			$(document).on('click','.inputText', function(){
				$('.cateModify').val($(this).text().trim());
				smallChoose = $(this);
				$('.bCateParent').html('<div class="btn btn-default btn-block BicCate">'+$(this).parent().prev().children().text()+'</div>')	// 대분류가 무엇인지 찾고 삽입
				$('span').removeAttr('id');
				$('span').removeAttr('style');
				$(this).attr('id','clickCate');
				$('#clickCate').css({'background-color' : '#cbcbcb', 'color' : 'white'});
				
			});
			
			//+버튼을 눌러 소분류를 추가하는 과정
			$(document).on('click','.smallCateAdd', function(){
				$(this).before('<span class="smallCate btn btn-default inputText">'+
						'<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">'+
						  '<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>'+
						  '<path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>'+
						'</svg>'+
						'</span>');
				
			});
			
			//빨간색 -버튼을 눌러 소븐류를 삭제
			$(document).on('click','.smallCateDel', function(){
				$(this).closest('span').remove();
			});
			
			//수정 버튼을 눌렀을때 진행되는 과정
			$('.modify').click(function(){
				if($('.BicCate').html()=='종류별'){
					className = 'kind_name'
					
				}
				else if($('.BicCate').html()=='방법별'){
					className='how_name'
						
				}
				else if($('.BicCate').html()=='재료별'){
					className='ingr_name'
				}
				else{
					className='situ_name'
				}
				console.log($('.BicCate').html());
				smallChoose.attr("name",className);
				smallChoose.html('')
				smallChoose.append($('.cateModify').val()+
						'<svg xmlns="http://www.w3.org/2000/svg" width="15" height="15" fill="red" class="bi bi-dash-circle smallCateDel" viewBox="0 0 16 16">'+
				  		'<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>'+
				  		'<path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"/>'+
						'</svg>'+
						'<input type="hidden" name="'+className+'" class="hiddenName" value="'+ $('.cateModify').val() +'"/>');
				$('.cateModify').val('');
				$('span').removeAttr('id');
				$('span').removeAttr('style');
			});
			
			$('.saveAll').click(function(){
				$('form').submit();
			});
			
		});
	</script>
</body>
</html>
