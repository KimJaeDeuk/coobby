<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
			<div class="single-product shop-quick-view-ajax">

					<!-- Close Button
					============================================= -->
					<button title="Close (Esc)" type="button" class="mfp-close"></button>

					<!-- Product
					============================================= -->
					<div class="product modal-padding">

						<div class="row gutter-50 col-mb-50">

							<!-- Product Image
							============================================= -->
							<div class="col-md-6">
								  
								<div class="product-image">
                                    <div class="fslider" data-pagi="false">
                                        <div class="flexslider">
                                            <div class="slider-wrap">
                                                <div class="slide"><img src="#" alt="test"></div>
                                                <div class="slide"><img src="#" alt="test"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
							</div>

							<!-- Product Description
							============================================= -->
							<form action="UpdateMyFeed" method="post">
							<div class="col-md-6 product-desc content-sticky">
								<h2 class="mb-3 fw-normal beforemodify inputtitle">${myfeedmodal.fe_title }</h2>
								<input type="text" name="fe_title" class="modifyinput aftermodify" value="${myfeedmodal.fe_title }" style="width:100%;"/>
								
								<!-- 내용 -->
								<!-- 유저정보 -->
								<input type="hidden" name="fe_no" value="${myfeedmodal.fe_no }"/> 
								<div id="feeduser">
									<h3 class="userId mb-4 fw-semibold">${myfeedmodal.mem_id }</h3>
									<a href="#"><img src="/resources/images/heart.png" alt="test" id="heartlike"></a>
									<a href="#">
									<svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-chat-dots" viewBox="0 0 16 16">
										<path d="M5 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm3 1a1 1 0 1 0 0-2 1 1 0 0 0 0 2z"/>
										<path d="m2.165 15.803.02-.004c1.83-.363 2.948-.842 3.468-1.105A9.06 9.06 0 0 0 8 15c4.418 0 8-3.134 8-7s-3.582-7-8-7-8 3.134-8 7c0 1.76.743 3.37 1.97 4.6a10.437 10.437 0 0 1-.524 2.318l-.003.011a10.722 10.722 0 0 1-.244.637c-.079.186.074.394.273.362a21.673 21.673 0 0 0 .693-.125zm.8-3.108a1 1 0 0 0-.287-.801C1.618 10.83 1 9.468 1 8c0-3.192 3.004-6 7-6s7 2.808 7 6c0 3.193-3.004 6-7 6a8.06 8.06 0 0 1-2.088-.272 1 1 0 0 0-.711.074c-.387.196-1.24.57-2.634.893a10.97 10.97 0 0 0 .398-2z"/>
									</svg>
									</a>						
								</div>
								<div class="line my-5"></div>
								<div class="feedcon beforemodify inputcontent">${myfeedmodal.fe_content }</div>
								<input type="text" name="fe_content" class="modifyinput aftermodify" maxlength="1000" style="resize: none; height: 150px; width:100%;" value="${myfeedmodal.fe_content }"/>
								<div class="line my-5"></div>
								<!-- 댓글 시작 -->
								<div class="feedcomment">
									<div class="feedcomment input-group">
										<textarea id="write_comment" placeholder="댓글을 입력해주세요" class="form-control" maxlength="1000" style="resize: none; height: 35px;" name="comment_content"></textarea>
										<button id="com_btn" class="btn btn-dark px-3 input-group-text" type="submit"><i class="icon-line-corner-down-left"></i></button>	
									</div>
								</div>
								<!-- 댓글 끝 -->
								<button type="button" class="button button-3d button-rounded button-pink beforemodify beforebtn"><i class="icon-line-edit-3"></i>수정하기</button>
								<button type="button" class="button button-3d button-rounded button-pink modifyinput afterbtn aftermodify"><i class="icon-line-edit-3"></i>수정완료</button>
								<a href="deleteFeed?fe_no=${myfeedmodal.fe_no }" class="button button-3d button-rounded button-red"><i class="icon-line-trash-2"></i>삭제하기</a>
							</div>
							</form>
							
						</div>

					</div>

				</div>
				<script src="http://code.jquery.com/jquery-latest.js"></script>
				<script>
				$(function(){
//						
//						// 수정 페이지 처음에는 숨겨야됨
						$('.modifyinput').hide();
						$('.beforebtn').click(function(){
							$('.beforemodify').hide();
							$('.aftermodify').show();
						});
						
						// 수정 페이지로 변경 후 ajax로 수정한 내용 보내기
						$('.afterbtn').click(function(){
							input_title = $('input[name="fe_title"]').val();
							input_content = $('input[name="fe_content"]').val();
							input_feNo = $('input[name="fe_no"]').val();
							$.ajax({
								url:'http://localhost:8080/user/feed/modifyModal',	// url로 변경 ( 홈페이지 주소로 뒤에는 RequestMapping의 값을)
								type:'post',
								contentType : 'application/x-www-form-urlencoded;charset=utf-8',
								data : { 
									fe_title : input_title,
									fe_content : input_content,
									fe_no : input_feNo
										}, 
								success : function(data) {
									if(data=='yes') {
										alert('수정완료');	// hide,show 적어주면됨
										$('.inputtitle').html(input_title);		// html(값)  => 불러오는 것 , 값을 넣으면 setter 
										$('.inputcontent').html(input_content);
										$('.aftermodify').hide();
										$('.beforemodify').show();
									}
									else {
										alert('안됨');
									}
									
								},
								error : function(err) {
									alert('수정되지 않았습니다.');
									console.log(err);
								}
								
							});
						});
					 }); 
				</script>