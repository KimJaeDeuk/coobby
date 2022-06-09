<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="SemiColonWeb" />

<!-- Stylesheets
	============================================= -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&family=Zilla+Slab:wght@400;500&display=swap"
	rel="stylesheet">

<link rel="stylesheet" href="/resources/user/css/bootstrap.css"
	type="text/css" />
<link rel="stylesheet" href="/resources/user/style.css" type="text/css" />
<link rel="stylesheet" href="/resources/user/css/swiper.css"
	type="text/css" />
<link rel="stylesheet" href="/resources/user/css/dark.css"
	type="text/css" />
<link rel="stylesheet" href="/resources/user/css/font-icons.css"
	type="text/css" />
<link rel="stylesheet" href="/resources/user/css/animate.css"
	type="text/css" />
<link rel="stylesheet" href="/resources/user/css/magnific-popup.css"
	type="text/css" />

<link rel="stylesheet" href="/resources/user/css/custom.css"
	type="text/css" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Furniture Demo Specific Theme Stylesheet - #193532 -->
<link rel="stylesheet"
	href="/resources/user/css/colors.php?color=193532" type="text/css" />

<!-- Furniture Demo Specific Stylesheet -->
<link rel="stylesheet"
	href="/resources/user/demos/furniture/furniture.css" type="text/css" />
<!-- Furniture Custom Css -->
<link rel="stylesheet"
	href="/resources/user/demos/furniture/css/fonts.css" type="text/css" />
<style>
img {
	width: 100px;
	height: 100px;
	border-radius: 5%;
	border: 1px solid black;
}

.searchBar {
  position: relative;
  width: 500px;
  height: 70px;
  margin: 10px auto;
 
}

input {
  border: 1px solid #F1F1F1;
  border-radius: 50px;
  width: 600px;
  height: 50px;
  background-color: none;	
}

input::-webkit-input-placeholder{
  background-image: url(https://cdn1.iconfinder.com/data/icons/hawcons/32/698627-icon-111-search-256.png) ;
  background-size: contain;
  background-position:  1px center;
  background-repeat: no-repeat;
  text-align: center;
  text-indent: 0;
  }

 .btn{
 	height : 50px;
 	border-radius : 25%;
 }
 .rightIcon {
 	float : left;
 }
 .inputBar{
 	width : 350px;
 	float : left
 }
 .btn-primary{
 	margin-left : -3%;
 }
</style>
<title>Furniture | Canvas</title>

</head>

<body class="stretched">


	<div class="body-overlay"></div>


	<div id="wrapper" class="clearfix">

		<div id="wrapper" class="clearfix">
			<jsp:include page="user-nav.jsp" />
		</div>

		<!-- slider Section
		============================================= -->
		<!-- Content
		============================================= -->
		<section id="content">
			<div class="content-wrap py-0">


				<!-- 2. Section Shop by Category
				============================================= -->
				<div class="container">

					<!-- Shop
						============================================= -->
					<div id="shop" class="shop row gutter-30 col-mb-30 mt-3">
						
						<form action="searchImage" method="GET">
						   <div class="searchBar">
						   	<div class="inputBar">
						      <input name="q" id="searchBar" type="text" class="form-control rounded-pill" placeholder="    재료 혹은 음식 검색" aria-label="Recipient's username" aria-describedby="button-addon2"
						      onfocus="this.placeholder=''" onblur="this.placeholder='    재료 혹은 음식 검색'" >
						     </div>
						      <div class="rightIcon" style="float">
						      <button type="button" class="btn btn-warning">
						     <svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-mic" viewBox="0 0 16 16">
							    <path d="M3.5 6.5A.5.5 0 0 1 4 7v1a4 4 0 0 0 8 0V7a.5.5 0 0 1 1 0v1a5 5 0 0 1-4.5 4.975V15h3a.5.5 0 0 1 0 1h-7a.5.5 0 0 1 0-1h3v-2.025A5 5 0 0 1 3 8V7a.5.5 0 0 1 .5-.5z"/>
							    <path d="M10 8a2 2 0 1 1-4 0V3a2 2 0 1 1 4 0v5zM8 0a3 3 0 0 0-3 3v5a3 3 0 0 0 6 0V3a3 3 0 0 0-3-3z"/>
							  </svg>
						 	 </button>
						 	 <button type="button" class="btn btn-primary">
						 	 <svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-image" viewBox="0 0 16 16">
							   <path d="M6.002 5.5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
						 	   <path d="M2.002 1a2 2 0 0 0-2 2v10a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V3a2 2 0 0 0-2-2h-12zm12 1a1 1 0 0 1 1 1v6.5l-3.777-1.947a.5.5 0 0 0-.577.093l-3.71 3.71-2.66-1.772a.5.5 0 0 0-.63.062L1.002 12V3a1 1 0 0 1 1-1h12z"/>
						 	 </svg>
						     
							  </button>
							  </div>
						   </div>
						  </form>
					
					<!-- Title -->
					<div class="col-xl-3 col-lg-6">
						<h3 class="mb-4 fw-normal h1">
							<b>인기</b> <span data-animate="svg-underline-animated"
								class="svg-underline nocolor"><span><b>레시피</b></span></span>
						</h3>
						<p class="op-07 mb-4">이 달의 인기 레시피</p>
						<a href="/user/recipe/recipeList"
							class="button button-border py-1 nott ls0 fw-normal button-dark border-width-1 border-color h-bg-color">
							<i class="icon-line-grid"></i> 레시피 더보기
						</a>
					</div>

					<!-- Product 1 -->
					<c:if test="${topRecipe ne null }">
						<c:forEach items="${ topRecipe}" var="recipe">

							<div class="product col-lg-3 col-md-4 col-sm-6 col-12">
								<div class="grid-inner">
									<div class="product-image">
										<a href="#"><img
											src="/resources/user/image/recipe/${recipe[6]}"
											alt="Light Grey Sofa"></a>

										<div
											class="bg-overlay-content align-items-end justify-content-between"
											data-hover-animate="fadeIn" data-hover-speed="400">
											<a href="/resources/admin/category"
												<%-- 레시피 링크 걸기 --%>
													class="btn btn-light">
												<i class="icon-line-expand"></i>
											</a>
										</div>

									</div>
									<div class="product-desc">
										<div class="product-title mb-0">
											<h4 class="mb-0">
												<a class="fw-medium" href="demo-forum-single.html">
													${recipe[3] } </a>
												<h5 class="product-price fw-normal">♥ x ${recipe[1]}</h5>
											</h4>
										</div>

										<h5 class="product-price fw-normal">조회 수 [ ${recipe[4]} ]</h5>
									</div>
								</div>
							</div>
						</c:forEach>
					</c:if>
				</div>
				<!-- #shop end -->
			</div>
			<!-- Section End -->
			<hr />
			<br />

			<!-- 3. Section new Arrivals
				============================================= -->
			<div class="section custom-bg mt-3 mb-0"
				style="-custom-bg: #F3F3ED; padding: 100px 0;">

				<div class="container-fluid">
					<!-- Heading Title -->
					<div class="text-center mt-6 mb-5">
						<h2 class="h1 fw-normal mb-4">
							<b>최근</b> <span data-animate="svg-underline-animated"
								class="svg-underline nocolor"><span><b>레시피</b></span></span>
						</h2>
						<a href="demo-furniture-products.html"
							class="button button-small button-border m-0 button-dark border-width-1 border-default px-4 h-bg-color"><i
							class="icon-line-grid"></i> 레시피 더보기</a>
					</div>
					<!-- Categories -->

					<div class="row item-categories gutter-20">
						<c:forEach items="${recentRecipe }" var="recipe">
							<div class="col-lg-4 col-md-6">
								<a href="link연결하기${recipe[1] }" class="d-block h-op-09 op-ts"
									style="background: url('/resources/user/img/${recipe[3]}.jpg') no-repeat center center; background-size: cover; height: 340px;">
									<h5 class="text-uppercase ls1 bg-white mb-0">${recipe[2]}</h5>
								</a>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>

			<!-- 6. Section Instagram  feed변수 background url, link 설정하기
				============================================= -->
			<div class="section custom-bg my-0 py-0"
				style="-custom-bg: var(- -themecolor);">
				<div class="row align-items-center no-gutters">
					<!-- Instagram Center Col - Text -->
					<div class="col-lg-4 py-5 order-lg-2">
						${feedList[8][0] } ${feedList[8][1] } <a
							class="d-block instagram-image"
							href="https://instagram.com/semicolonweb" target="_blank"
							style="background: url('/resources/user/demos/furniture/images/instagram/1.jpg') no-repeat center center; background-size: cover; min-height: 33vh;"></a>
					</div>

					<!-- Instagram Left Col - Image 2번 위치-->

					<div class="col-lg-4 col-md-6 order-lg-1">
						<div class="row gutter-4">
							<c:forEach items="${feedList }" var="feed" varStatus="status">
								<c:if test="${status.index le 3 }">
									<div class="col-6">
										<a class="d-block instagram-image"
											href="https://instagram.com/semicolonweb" target="_blank"
											style="background: url('/resources/user/demos/furniture/images/instagram/1.jpg') no-repeat center center; background-size: cover; min-height: 33vh;"></a>
									</div>
								</c:if>
							</c:forEach>
						</div>
					</div>

					<!-- Instagram Right Col - Image -->
					<div
						class="col-lg-4 col-md-6 order-lg-3 mt-1 mt-md-0 ps-md-1 ps-lg-0">
						<div class="row gutter-4">
							<c:forEach items="${feedList }" var="feed" varStatus="status">
								<c:if test="${status.index ge 4 && status.index lt 8}">
									<div class="col-6">
										<a class="d-block instagram-image"
											href="https://instagram.com/semicolonweb" target="_blank"
											style="background: url('/resources/user/demos/furniture/images/instagram/5.jpg') no-repeat center center; background-size: cover; min-height: 33vh;"></a>
									</div>
								</c:if>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<!-- Section End -->
			</div>
	</section>
	<!-- #content end -->
	<br />

	<!-- #footer end -->

	</div>
	<!-- #wrapper end -->

	<!-- Go To Top
	============================================= -->
	<div id="gotoTop" class="bg-color op-07 h-op-1">
		<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
			fill="#FFF" viewBox="0 0 256 256">
			<rect width="256" height="256" fill="none"></rect>
			<polygon points="48 208 128 128 208 208 48 208" opacity="0.2"></polygon>
			<polygon points="48 208 128 128 208 208 48 208" fill="none"
				stroke="#FFF" stroke-linecap="round" stroke-linejoin="round"
				stroke-width="16"></polygon>
			<polyline points="48 128 128 48 208 128" fill="none" stroke="#FFF"
				stroke-linecap="round" stroke-linejoin="round" stroke-width="16"></polyline></svg>
	</div>

	<!-- JavaScripts
	============================================= -->
	  <script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
	<script src="/resources/user/js/jquery.js"></script>
	<script src="/resources/user/js/plugins.min.js"></script>

	<!-- Footer Scripts
	============================================= -->
	<script src="/resources/user/js/functions.js"></script>
	<script>
	$(function(){
		$('img').hide();
		$("#chooseFile").on("change", function(event) {
			$('img').show();
		    var file = event.target.files[0];

		    var reader = new FileReader(); 
		    reader.onload = function(e) {
		        $("#image-show").attr("src", e.target.result);
		    }

		    reader.readAsDataURL(file);
		});
		
		$("#searchBar").focus(function(){
			if($('#icon').hasClass("open")){
				$("#icon").hide();
				$("#icon").removeClass("open");
			}
			else{
				$("#icon").show();
				$("#icon").addClass("open");
			}
			
		})
	})
	</script>
</body>
</html>