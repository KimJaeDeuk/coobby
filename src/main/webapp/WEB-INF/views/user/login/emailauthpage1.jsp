<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
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
	<link rel="stylesheet" href="demos/furniture/furniture.css" type="text/css" /> <!-- Furniture Custom Css -->
	<link rel="stylesheet" href="demos/furniture/css/fonts.css" type="text/css" /> <!-- Furniture Custom Fonts -->
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
	<title>Furniture | Canvas</title>

</head>



<body class="stretched">

	<!-- Cart Panel Background
	============================================= -->
	<div class="body-overlay"></div>

	<!-- Document Wrapper
	============================================= -->
	
	<jsp:include page="../user-nav.jsp"/>
	
	

		<!-- Top Bar
		============================================= -->
		<!-- <div id="top-bar" class="py-3 text-center bg-color-light">
			<div class="container clearfix">
				<div class="d-md-flex justify-content-md-between align-items-md-center">
					<h4 class="mb-2 mb-md-0 h6 fw-normal">Free Shipping on every order <span class="mx-2 text-black-50">&middot;</span> 30 Days Return</h4>

					<h4 class="mb-0 h6 fw-normal">Need Help? Call us at <a class="color" href="tel:+00-11-22-7541"><u class="fw-medium">+00-11-22-7541</u></a> or <a class="color" href="mailto:noreply@canvas.com"><u class="fw-medium">email</u></a> us.</h4>
				</div>
			</div>
		</div> --><!-- #top-bar end -->

		<!-- Header
		============================================= -->
		
        <div class="loginbackground" style="background-image: url('/resources/user/images/my/LoginPage2.jpg'); background-image: cover;">
            <br/><br/><br/>
           <span style="text-align: center;"> <h1>E-mail Authentication</h1></span> <br/><br/>
		   
            <!-- <p style="color: black; text-align:center; font-size:120%"> 회원가입 페이지 방문을 환영합니다.<br/> -->
				<p style="color: black; text-align:center; font-size:120%"><strong>이메일인증</strong> 후 회원가입을 계속해서 진행하실 수 있습니다.</p>
        
          <!--================Login Box Area =================-->
          <div class="wrap wd668" style="display: flex;">
            <div class="container" style="margin-left: auto; margin-right: auto; display: flex; margin-bottom: 100px;">
              <div class="aa" style="text-align: center; width: 1571px; margin-left: auto; margin-right: auto; color: black;  background-color: #EFFBFB; border-radius: 5em; width: 700px; height: 300px; padding: 20px 10px 50px 50px;">
                <br/><h5 class="sub_tit_txt"><b>-- 이메일정보 입력 --</b></h5><br/>
                <p class="exTxt" style="color:#FE2E2E;"><strong>회원가입시 이메일 인증 후, 해당 이메일ID로 가입하셔야 합니다.</strong></p>
                <div class="join_form">
                  
                    <!-- <colgroup>
                      <col width="30%"/>
                      <col width="auto"/>
                    </colgroup> -->
                            <span>이메일아이디&ensp;</span>      
                              <input type="text" style="border-radius: 5em; border: none;" class="email" placeholder=""><span class="mar10">@</span>
							  <!-- <label for="email3" class="ir_su">메일 선택</label> -->
							  <!-- <select id="email3" name="email3" title="이메일 주소 선택" style="height: 5%;">
								  <option value="">  이메일주소 직접입력  </option>
								  <option value="naver.com">naver.com</option>
								  <option value="nate.com">nate.com</option>
								  <option value="gmail.com">gmail.com</option>
								  <option value="yahoo.com">yahoo.com</option>
								  <option value="hanmail.net">hanmail.net</option>
							  </select> -->
                              <input type="text"  style="border-radius: 5em; border: none;" class="email email2" placeholder="">
                              <a href="javascript:;" class="btn_confirm">인증번호 발송</a><br/><br/>
                              <div class="aut" style="margin-right: 250px;">
                              <span>인증번호&ensp;&ensp;&ensp;&nbsp;&nbsp;</span>
                             <input type="text" style="border-radius: 5em; border: none;" class="send_number">
                             <button type="button" style="border: none;">확인</button>
                            </div><br/>
                            <a href="joinmember" style="width:50%"><button type="button" style="border: none; width: 30%; height: 120%; font-size: 110%;" >인증완료</button></a>
                            
                             
                        <!-- <div class="name1" style="margin-right: 215px;">      
                        <span>이름(닉네임)</span>
                        <input type="text" style="border-radius: 5em; border: none;" placeholder="이름 입력">
                        <button type="button" style="border: none;">중복확인</button>
                        <br/><br/>
                        </div>
                        
                        <div class="name1" style="margin-right: 290px;">
                        <span>비밀번호&ensp;&ensp;&ensp;</span>
                        <input type="text" style="border-radius: 5em; border: none;" placeholder="비밀번호 입력"><br/><br/>
                        </div>
        
                        <div class="name1" style="margin-right: 280px;">
                        <span>비밀번호 확인</span>
                        <input type="text" style="border-radius: 5em; border: none;" placeholder="비밀번호 재입력"><br/><br/>
                        </div> 
                      
                         <span>인증번호 확인</span>
                        <input type="text" style="border-radius: 5em; border: none;" class="send_number" placeholder="10:00">
                          <a href="javascript:;" class="btn_confirm">인증번호 발송</a> 
                        
                        <div class="name1" style="margin-right: 280px;">
                        <span>휴대폰 번호&nbsp;&nbsp;&ensp;</span>
                        <input type="text" style="border-radius: 5em; border: none;" placeholder="휴대폰번호 입력">
                        </div>
                        <div class="aut" style="margin-right: 240px;">
                            <span>인증번호</span>
                           <input type="text" style="border-radius: 5em; border: none;" class="send_number" placeholder="10:00">
                           <button type="button" style="border: none;">확인</button>
                          </div><br/>
        
                        <div class="name1" style="margin-right: 280px;">
                            <span>성별&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</span>
                            남&nbsp;<input type="checkbox" style="border-radius: 5em; border: none;">&ensp;&ensp;&ensp;&ensp;&ensp;
                            여&nbsp;<input type="checkbox" style="border-radius: 5em; border: none;">
                            </div><br/><br/>
        
                        <div class="name1" style="margin-right: 280px;">
                            <span>생년월일&nbsp;&nbsp;&ensp;</span>
                            <input type="text" style="border-radius: 5em; border: none;" placeholder="휴대폰번호 입력">
                            </div><br/>    -->
                    
                  
                  <!-- <div class="lkk" style="text-align: left;"><span>* 표시는 필수적으로 입력해주셔야 가입이 가능합니다.</span></div> -->
                <!-- </div> join_form E  -->
                <!-- <div class="agree_wrap">
                  <div class="checkbox_wrap" style="margin-right: 380px;">
                    <input type="checkbox" id="news_letter" name="news_letter" class="agree_chk">
                    <label for="news_letter">[필수]이메일 정보 수집동의</label>
                  </div>
                  <div class="checkbox_wrap mar27" style="margin-right: 195px;">
                    <input type="checkbox" id="marketing" name="marketing" class="agree_chk">
                    <label for="marketing">[선택]마케팅 목적 개인정보 수집 및 이용에 대한 동의</label>
                    <ul class="explan_txt">
                      <li><span class="red_txt">항목 : 성별, 생년월일</span></li>
                       <li>고객님께서는 위의 개인정보 및 회원정보 수정 등을 통해 추가로 수집하는 개인정보에<br/>
                        대해 동의하지 않거나 개인정보를 기재하지 않음으로써 거부하실 수 있습니다.<br/> -->
                    </div>
                    
                     
                  </div>
                </div>
                <div class="btn_wrap">
                  <!-- <a href="javascript:;">다음</a> -->
                </div>
              </div> <!-- form_txtInput E -->
            </div><!-- content E-->
          </div> <!-- container E -->
            <!--================End Login Box Area =================-->
        


		<!-- Footer
		============================================= -->
		<footer id="footer">
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
		</div>
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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>
        $( "#email3" ).change(function(){
            $("#email2").val( $("#email3").val() );
        });
    </script>

</body>
</html>