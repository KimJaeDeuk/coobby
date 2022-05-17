$(function(){
    $('#chatting').hide();

    // 게시글과 채팅 탭 기능
    $('#feed_tab').click(function(){
        $('#myfeed').show();
        $('#chatting').hide();
    })

    $('#chat_tab').click(function(){
        $('#myfeed').hide();
        $('#chatting').show();
    })

    // 모달 뷰 사진 슬라이더 옵션
    $('.flexslider').flexslider({
        animation: "fade"
    })

    // 좋아요 색상 변경
    

    // 댓글 작성
    // $("#com_btn").on('click', function() {
	// 	var comment_content = $('textarea[name=comment_content]').val(); // 댓글 창 name 값 가져오기
	// 	//var bookreport_no = $('input[name=bookreport_no]').val(); // 각 게시글 넘버의 name값 가져오기
	// 		if (comment_content.length > 1) {
	// 		$.ajax({
	// 			type:'GET',
	// 			contentType:"application/json",
	// 			url:'insertComment.do',
	// 			data:{
 	// 				comment_content,
	// 				//bookreport_no
	// 			},
	// 			dataType : "text",
	// 			success : function(data) {				
	// 				 console.log(data);
	// 				$('textarea[name=comment_content]').val("");
	// 				getCommentList();
	// 			},
	// 			error : function(err) {
	// 				alert("error");
	// 				console.log(err);
	// 			}
				
	// 		})
			
	// 		} else {
	// 			alertWarnMessage("댓글을 한글자 이상 작성해주세요");
	// 		}
	// 	})




})