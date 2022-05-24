<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html dir="ltr" lang="en-US">
<head>

	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="author" content="SemiColonWeb" />

	<!-- Stylesheets
	============================================= -->
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&family=Zilla+Slab:wght@400;500&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="/resources/css/bootstrap.css" type="text/css" />
	<link rel="stylesheet" href="/resources/style.css" type="text/css" />

	<link rel="stylesheet" href="/resources/css/dark.css" type="text/css" />
	<link rel="stylesheet" href="/resources/css/font-icons.css" type="text/css" />
	<link rel="stylesheet" href="/resources/css/animate.css" type="text/css" />
	<link rel="stylesheet" href="/resources/css/magnific-popup.css" type="text/css" />

	<link rel="stylesheet" href="/resources/css/custom.css" type="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	
	<link rel="stylesheet" href="/resources/css/magnific-popup.css" type="text/css" />
	<link rel="stylesheet" href="/resources/css/components/ion.rangeslider.css" type="text/css" />

	<!-- Furniture Demo Specific Theme Stylesheet - #193532 -->
	<link rel="stylesheet" href="/resources/css/colors.php?color=193532" type="text/css" />
	<link rel="stylesheet" href="/resources/css/custom.css" type="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />

	<!-- Furniture Demo Specific Stylesheet -->
	<link rel="stylesheet" href="/resources/demos/furniture/furniture.css" type="text/css" /> <!-- Furniture Custom Css -->
	<link rel="stylesheet" href="/resources/demos/furniture/css/fonts.css" type="text/css" /> <!-- Furniture Custom Fonts -->
	<link rel="stylesheet" href="/resources/user/recipe/css//recipeinsert.css" type="text/css"/>
	<!-- / -->

	<!-- Document Title
	============================================= -->
	<title>Furniture | Canvas</title>

</head>

<body class="stretched">

	
			
		<jsp:include page="../nav-bar/user-nav.jsp"/>
		
		<!-- Page Title
		============================================= -->
		<section id="page-title">

			<div class="container clearfix">
				<h1>레시피 등록</h1>
				<span>Forms Recipe</span>
			</div>

		</section><!-- #page-title end -->

		<!-- Content
		============================================= -->
		<section id="content">
			<div class="content-wrap">
				<div class="container clearfix">

					<div class="form-widget">

						<div class="form-result"></div>

						<div class="row shadow bg-light border">
							<div class="col-lg-12 p-5">
								<form class="row mb-0" id="fitness-form" action="include/form.php" method="post" enctype="multipart/form-data">
									<div class="form-process">
										<div class="css3-spinner">
											<div class="css3-spinner-scaler"></div>
										</div>
									</div>
									<div id="recipecontainer">
										<div id="textcontainer">
											<div class="col-6 form-group">
												<div class="row">
													<div class="col-sm-2 col-form-label">
														<label class="labelfont" for="fitness-form-name">레시피 제목:</label>
													</div>
													<div class="col-sm-9">
														<input type="text" name="re_title" id="fitness-form-name" class="form-control required" value="" placeholder="제목을 입력해주세요">
													</div>
												</div>
											</div>
											<div class="col-6 form-group">
												<div class="row">
													<div class="col-sm-2 col-form-label">
														<label class="labelfont" for="fitness-form-email">요리 소개:</label>
													</div>
													<div class="col-sm-9">
														<textarea class="introduce" name="re_content" placeholder="내용을 입력해주세요"></textarea>
													</div>
												</div>
											</div>
											<div class="col-6 form-group">
												<div class="row">
													<div class="col-sm-2 col-form-label">
														<label class="labelfont" for="fitness-form-phone">동영상:</label>
													</div>
													<div class="col-sm-9">
														<input type="text" name="re_video_url" id="fitness-form-phone" class="form-control required" value="" placeholder="Your Contact Number">
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-6 form-group">
										<div class="row">
											<div class="col-sm-2 col-form-label">
												<label class="labelfont" for="fitness-form-goal">카테고리:</label>
											</div>
											<div class="col-sm-10">
												<div class="btn-group d-flex" role="group">
													<select class="form-select required" name="kind_name" id="event-registration-interests">
														<option value="">종류별</option>
														<option value="UX Design">UX Design</option>
													</select>
													<select class="form-select required" name="situ_name" id="event-registration-interests">
														<option value="">상황별</option>
														<option value="UX Design">UX Design</option>
													</select>
													<select class="form-select required" name="how_name" id="event-registration-interests">
														<option value="">방법별</option>
														<option value="UX Design">UX Design</option>
													</select>
													<select class="form-select required" name="ingr_name" id="event-registration-interests">
														<option value="">재료별</option>
														<option value="UX Design">UX Design</option>
													</select>
												</div>
											</div>
										</div>
									</div>
									<hr/>
									<h4>재료추가</h4>
									<div class="col-12 form-group">
										<div id="ingrinputcontainer" class="row">
											<div class="col-sm-4">
												<input type="text" min="10" max="50" name="fitness-form-age" id="fitness-form-age" class="form-control required" value="" placeholder="예) 고추장">
											</div>
											<div class="col-sm-4">
												<input type="text" min="10" max="50" name="fitness-form-age" id="fitness-form-age" class="form-control required" value="" placeholder="예) 2스푼">
											</div>
										</div>
										<div class="plusbtncontain">
											<button id="ingrplusbtn" class="button" type="button">추가</button>
										</div>
									</div>
									<div class="col-12 d-none">
										<input type="text" id="fitness-form-botcheck" name="fitness-form-botcheck" value="" />
									</div>
									<hr/>
									<h4>요리 순서</h4>
									<div>
										<ol class="list-preparation">
											<li>
												<div class="recipeinsertcontainer">
													<textarea class="recipeinsert" rows="7" placeholder="내용을 입력해주세요"></textarea>
													<img id="preview-image" class="recipeimg" src="/resources/images/about/1.jpg" alt="" />
												</div>
												<div class="mb-3">
												  <label for="formFile" class="form-label">Default file input example</label>
												  <input id="input-image" class="form-control" type="file" id="formFile" accept="image/jpeg, image/jpg, image/png">
												</div>
											</li>
										</ol>
										<div class="plusbtncontain">
											<button id="recipeplusbtn" class="button" type="button">추가</button>
										</div>
									</div>
									<hr/>
									<h4>요리 완성 사진</h4>
									<div>
										<div class="mb-3">
											<label for="formFile" class="form-label">Default file input example</label>
											<input type="file" class="form-control " id="uploadFile"
							                  name="uploadFile" accept="image/jpeg, image/jpg, image/png"
							                  multiple />
										</div>
									</div>
									<div class="row">
										<div class="col-sm-1 col-form-label">
											<label class="labelfont" for="fitness-form-email">요리 팁:</label>
										</div>
										<div class="col-sm-9">
											<textarea class="introduce" placeholder="내용을 입력해주세요"></textarea>
										</div>
									</div>
									<input type="hidden" name="prefix" value="fitness-form-">
									<input type="hidden" name="subject" value="New Fitness Received">
									<input type="hidden" id="fitness-form-calories" name="fitness-form-calories" value="">
									<div class="col-12 d-flex justify-content-end align-items-center">
										<button type="button" id="calories-trigger" class="btn btn-secondary">목록보기</button>
										<button type="submit" name="fitness-form-submit" class="btn btn-success ms-2">등록하기</button>
									</div>
								</form>
							</div>

						</div>

					</div>

				</div>
			</div>
		</section><!-- #content end -->
		

		<!-- Footer
		============================================= -->
		<footer id="footer" class="border-0 bg-white">
			<div class="container">

				<!-- Footer Widgets
				============================================= -->
				<div class="footer-widgets-wrap py-lg-6">
					<div class="row col-mb-30">

						<!-- Footer Col 1 -->
						<div class="col-lg-2 col-md-3 col-6">
							<div class="widget widget_links widget-li-noicon">

								<h4 class="ls0 nott">Social</h4>

								<ul class="list-unstyled iconlist ms-0">
									<li><a href="https://facebook.com/semicolonweb" target="_blank"><i class="icon-facebook"></i> Facebook</a></li>
									<li><a href="https://instagram.com/semicolonweb" target="_blank"><i class="icon-instagram"></i> Instagram</a></li>
									<li><a href="https://twitter.com/__semicolon" target="_blank"><i class="icon-twitter"></i> Twitter</a></li>
									<li><a href="https://youtube.com/c/SemiColonweb/videos" target="_blank"><i class="icon-youtube"></i> YouTube</a></li>
									<li><a href="https://wa.me/00112233344"><i class="icon-whatsapp"></i> WhatsApp</a></li>
								</ul>

							</div>
						</div>

						<!-- Footer Col 2 -->
						<div class="col-lg-2 col-md-3 col-6">
							<div class="widget widget_links widget-li-noicon">

								<h4 class="ls0 nott">Support</h4>

								<ul class="list-unstyled iconlist ms-0">
									<li><a href="demo-furniture.html">Home</a></li>
									<li><a href="demo-furniture-about.html">About</a></li>
									<li><a href="demo-furniture-contact.html">Contact</a></li>
								</ul>

							</div>
						</div>

						<!-- Footer Col 3 -->
						<div class="col-lg-2 col-md-3 col-6">
							<div class="widget widget_links widget-li-noicon">

								<h4 class="ls0 nott">Trending</h4>

								<ul class="list-unstyled iconlist ms-0">
									<li><a href="demo-furniture-products.html">Shop</a></li>
									<li><a href="demo-forum-single.html">Single</a></li>
									<li><a href="demo-furniture-about.html">Who are we</a></li>
								</ul>

							</div>
						</div>

						<!-- Footer Col 4 -->
						<div class="col-lg-2 col-md-3 col-6">
							<div class="widget widget_links widget-li-noicon">

								<h4 class="ls0 nott">Get to Know us</h4>

								<ul class="list-unstyled iconlist ms-0">
									<li><a href="intro.html#section-niche">Niche Demos</a></li>
									<li><a href="intro.html#section-multipage">Home Pages</a></li>
									<li><a href="intro.html#section-onepage">One Pages</a></li>
								</ul>

							</div>
						</div>

						<!-- Footer Col 5 -->
						<div class="col-lg-4">
							<div class="widget subscribe-widget clearfix" data-loader="button">
								<h4>Subscribe Us</h4>
								<h5 class="font-body op-04"><strong>Subscribe</strong> to Our Newsletter to get Important News, Amazing Offers &amp; Inside Scoops:</h5>
								<div class="widget-subscribe-form-result"></div>
								<form id="widget-subscribe-form" action="include/subscribe.php" method="post" class="mb-0">
									<div class="input-group">
										<input type="email" id="widget-subscribe-form-email" name="widget-subscribe-form-email" class="form-control required email" placeholder="Enter your Email Address">
										<button class="btn btn-dark bg-color px-3 input-group-text" type="submit">Subscribe</button>
									</div>
								</form>
							</div>
						</div>

					</div>

				</div><!-- .footer-widgets-wrap end -->

			</div>

			<!-- Copyrights
			============================================= -->
			<div id="copyrights" class="py-3 bg-color-light">
				<div class="container">

					<div class="d-flex justify-content-between op-04">
						<span>&copy; 2020 All Rights Reserved by Canvas Inc.</span>
						<div class="copyright-links"><a href="#">Terms of Use</a> / <a href="#">Privacy Policy</a></div>
					</div>

				</div>
			</div><!-- #copyrights end -->
		</footer><!-- #footer end -->

	</div><!-- #wrapper end -->

	<!-- Go To Top
	============================================= -->
	<div id="gotoTop" class="bg-color op-07 h-op-1">
		<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="#FFF" viewBox="0 0 256 256"><rect width="256" height="256" fill="none"></rect><polygon points="48 208 128 128 208 208 48 208" opacity="0.2"></polygon><polygon points="48 208 128 128 208 208 48 208" fill="none" stroke="#FFF" stroke-linecap="round" stroke-linejoin="round" stroke-width="16"></polygon><polyline points="48 128 128 48 208 128" fill="none" stroke="#FFF" stroke-linecap="round" stroke-linejoin="round" stroke-width="16"></polyline></svg>
	</div>

	<!-- JavaScripts
	============================================= -->
	<script src="/resources/js/jquery.js"></script>
	<script src="/resources/js/plugins.min.js"></script>

	<!-- Footer Scripts
	============================================= -->
	<script src="/resources/js/functions.js"></script>
	<script src="/resources/user/recipe/js/recipeinsert.js"></script>

</body>
</html>