<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
	<html lang="en">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script>
		Kakao.init('6f96c431fe2e9b04848644515ab3b04f');
		console.log(Kakao.isInitilized());

		//카카오로그인
		function kakaoLogin() {
    Kakao.Auth.login({
      success: function (response) {
        Kakao.API.request({
          url: '/v2/user/me',
          success: function (response) {
        	  console.log(response)
          },
          fail: function (error) {
            console.log(error)
          },
        })
      },
      fail: function (error) {
        console.log(error)
      },
    })
  }

  		//카카오로그아웃
function kakaoLogout() {
    if (Kakao.Auth.getAccessToken()) {
      Kakao.API.request({
        url: '/v1/user/unlink',
        success: function (response) {
        	console.log(response)
        },
        fail: function (error) {
          console.log(error)
        },
      })
      Kakao.Auth.setAccessToken(undefined)
    }
  }  
</script>
<style>
.yu:hover {
	cursor: pointer;
	color: blue;
	text-color:blue;

}

</style>
<head>

	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="author" content="SemiColonWeb" />

	<!-- Stylesheets
	============================================= -->
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&family=Zilla+Slab:wght@400;500&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="/resources/user/css/bootstrap.css" type="text/css" />
	<link rel="stylesheet" href="/resources/user/style.css" type="text/css" />

	<link rel="stylesheet" href="/resources/user/css/dark.css" type="text/css" />
	<link rel="stylesheet" href="/resources/user/css/font-icons.css" type="text/css" />
	<link rel="stylesheet" href="/resources/user/css/animate.css" type="text/css" />
	<link rel="stylesheet" href="/resources/user/css/magnific-popup.css" type="text/css" />

	<link rel="stylesheet" href="/resources/user/css/custom.css" type="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />

	<!-- Furniture Demo Specific Theme Stylesheet - #193532 -->
	<link rel="stylesheet" href="/resources/user/css/colors.php?color=193532" type="text/css" />

	<!-- Furniture Demo Specific Stylesheet -->
	<link rel="stylesheet" href="/resources/user/demos/furniture/furniture.css" type="text/css" /> <!-- Furniture Custom Css -->
	<link rel="stylesheet" href="/resources/user/demos/furniture/css/fonts.css" type="text/css" /> <!-- Furniture Custom Fonts -->
	<!-- / -->
    <link rel="icon" href="img/Fevicon.png" type="image/png">
    <link rel="stylesheet" href="/resources/user/vendors/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/user/vendors/fontawesome/css/all.min.css">
      <link rel="stylesheet" href="/resources/user/vendors/themify-icons/themify-icons.css">
      <link rel="stylesheet" href="/resources/user/vendors/linericon/style.css">
    <link rel="stylesheet" href="/resources/user/vendors/owl-carousel/owl.theme.default.min.css">
    <link rel="stylesheet" href="/resources/user/vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="/resources/user/vendors/nice-select/nice-select.css">
    <link rel="stylesheet" href="/resources/user/vendors/nouislider/nouislider.min.css">

	<!-- Document Title
	============================================= -->
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="stylesheet" href="/style.css">
    <title>Bootstrap 4 Login/Register Form</title>

</head>



<body class="stretched">

	<!-- Cart Panel Background
	============================================= -->
	<div class="body-overlay"></div>


	<!-- Document Wrapper
	============================================= -->
	<div id="wrapper" class="clearfix">
	<jsp:include page="../user-nav.jsp"/>
	</div>



		<!-- Header
		============================================= -->
		
        <div class="loginbackground" style="background-image: url(/resources/user/images/my/LoginPage2.jpg);">
            <br/><br/><br/>
           <span style="text-align: center;"> <h1 style="font-size: 300%"><b>Login&ensp;Page</b></h1></span> 
          <!--================Login Box Area =================-->
             <section class="login_box_area section-margin" style="padding: 100px;">
                <div class="container">
                    <div class="row">
						<div class="col-lg-3"></div>
                        <div class="col-lg-6">
                            <div class="login_form_inner" style="border-radius: 5em; background-color: #F5ECCE; margin: 10px; padding: 50px; height: 100%;" >
                                <h4 style="text-align: center;"><b>홈페이지 로그인</b></h5><br/>
                                <form class="row login_form" action="#/" id="contactForm" >
                                    <div class="col-md-12 form-group">
                                        <input type="text" class="form-control" style="border-radius: 5em;" id="name" name="name" placeholder="이메일아이디" onfocus="this.placeholder = ''" onblur="this.placeholder = '이메일아이디'">
                                    </div>
                                    <div class="col-md-12 form-group">
                                        <input type="text" class="form-control" style="border-radius: 5em;" id="name" name="name" placeholder="비밀번호" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호'">
                                    </div>
                                    <div class="col-md-12 form-group">
                                        <div class="creat_account">
                                            <input type="checkbox" id="f-option2" name="selector">
                                            <label for="f-option2">아이디 기억하기</label>
                                        </div>
                                        <br/>
                                    </div>
                                    <div class="col-md-12 form-group" style="text-align: center;">
                                        <button type="submit" value="submit" class="button button-login w-100" style="background-color: #DF7401; color: #FFBF00; border: #F5F6CE;"><b style="font-size: 125%;">로그인 </b></button><br/><hr/>
                                        <!-- <a href="#" class="text1">계정을 잊어버리셨나요?</a> -->
										<a href="emailauthpage"><span type="button" class="yu" style="color: #FFBF00; height: 47px; text-align: center;"><b class="yu" style="font-size: 125%;">계정이 없으신가요?(이메일 인증)</b></span></a>
                                        <!-- <button type="button" onclick="location.href='demo-furnitureemailauth.html'" value="submit" class="button button-find w-100 h-0" style="background-color: #DF7401; color: #FFBF00; border: #F5F6CE; height: 47px;"><b style="font-size: 125%;">계정이 없으신가요?(이메일 인증)</b></button> -->
                                        <!-- <a href="#" class="text1">계정이 없으신가요?</a>
                                        <button type="button" value="submit" class="button button-new w-100 h-0" onclick="location.href='demo-furnitureemailauth.html'" style="background-color: #DF7401; color: #FFBF00; border: #F5F6CE; height: 47px;"><b style="font-size: 125%;">새 계정 만들기</b></button><br/> -->
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-3" style= "border-radius: 5em;" >
                            <!-- <div class="login_form_inner" style="justify-content: center; border-radius: 5em;  object-fit: cover; margin: 10px; padding: 50px; object-fit: cover; height: 100%;"> -->
                                <!-- <div class="hover" style="margin: auto; display:block"> -->
                                    <!-- <h4 style="text-align: center"><b>카카오 계정으로 로그인</b></h4><br/>
                                    <p style="text-align: center;">카카오 계정으로 연동하여<br/> 홈페이지에 로그인하실 수 있습니다.</p><br/><br/><br/><br/><br/><br/> -->
                                    <!-- <form class="row login_form" action="#/" id="contactForm" >
                                        <div class="col-md-12 form-group">
                                            <input type="text" class="form-control" style="border-radius: 5em;" id="name" name="name" placeholder="이메일아이디" onfocus="this.placeholder = ''" onblur="this.placeholder = '이메일아이디'">
                                        </div>
                                        <div class="col-md-12 form-group">
                                            <input type="text" class="form-control" style="border-radius: 5em;" id="name" name="name" placeholder="비밀번호" onfocus="this.placeholder = ''" onblur="this.placeholder = '비밀번호'">
                                        </div>
                                        <div class="col-md-12 form-group">
                                            <div class="creat_account">
                                                <input type="checkbox" id="f-option2" name="selector">
                                                <label for="f-option2">아이디 기억하기</label>
                                            </div>
                                        </div> -->
                                        <!-- <div class="login_btn1" style="margin: auto; display:block; justify-content: center;">
                                            <button type="submit" value="submit" class="button button-login" style="display: block; border-radius: 5em; background-color: #DF7401; color: #FFBF00; border: #F5F6CE; width: 60%;"><p onclick="kakaoLogin();"> <a href="javascript:void(0)"> <b style="font-size: 20px; display: block;">☞ 카카오 로그인 이동</b></a></p></button><br/><hr style="width: 100%;"/>
                                        </div> -->
                                    
                                    <!-- <a class="button button-account" href="register1.html" style="display: block; text-align: center;" >카카오 계정 만들기</a> -->
                                <!-- </div> -->
                            </div>
                        </div>
                     </div> 
                </div>
            </div>
            </section> 
            <!--================End Login Box Area =================-->
        


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
	<script src="/resources/user/js/jquery.js"></script>
	<script src="/resources/user/js/plugins.min.js"></script>

	<!-- Footer Scripts
	============================================= -->
	<script src="/resources/user/js/functions.js"></script>
	<script src="/resources/user/vendors/jquery/jquery-3.2.1.min.js"></script>
	<script src="/resources/user/vendors/bootstrap/bootstrap.bundle.min.js"></script>
	<script src="/resources/user/vendors/skrollr.min.js"></script>
	<script src="/resources/user/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="/resources/user/vendors/nice-select/jquery.nice-select.min.js"></script>
	<script src="/resources/user/vendors/jquery.ajaxchimp.min.js"></script>
	<script src="/resources/user/vendors/mail-script.js"></script>
	<script src="/resources/user/js/main.js"></script>

</body>
</html>