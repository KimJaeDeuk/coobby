$(".comm_answer").click(() => {
	$(".childcomm").css('display','block');
})

$(".button.button-circle.button-small.mt-3").click(() => {
	$(".childcomm").css('display','none');
})




$('#ingrmodal1').on('show.bs.modal', function (e) {
    var data = $(e.relatedTarget).data('ingrName');
    console.log(data);
    //$("#ingrSeason").val(data);
    
});

const likeClass = $("#likeicon").attr("class");
$("#scrapBtn").click(()=>{
	const scrapClass = $("#scrapicon").attr("class");
	const memId = $("#userId").val();
	const recipeNo = $("#recipeNo").val();
	if(scrapClass === 'bi bi-bookmark-star'){		
		$.ajax({
			url: 'scrapSave',
			type: 'post',
			contentType : 'application/x-www-form-urlencoded;charset=utf-8',
			data : {
				memId : memId,
				reNo : recipeNo
			},
			success : function(){
				$("#scrapicon").toggleClass('bi bi-bookmark-star bi bi-bookmark-star-fill');
				alert('즐겨찾기에 추가 되었습니')
			},
			error : function(){
				alert('실패')
			}
		})
	}
	else{
		$.ajax({
			url : 'scrapDelete',
			type : 'post',
			contentType : 'application/x-www-form-urlencoded;charset=utf-8',
			data : {
				memId : memId,
				reNo : recipeNo
			},
			success : function(){
				$("#scrapicon").toggleClass('bi bi-bookmark-star-fill bi bi-bookmark-star');
				alert('삭제 완료');
			},
			error : function(){
				alert('실패');
			}
		})
	}
})

$("#likeBtn").click(()=>{
	alert(likeClass);
	$("#likeicon").toggleClass('bi bi-heart bi bi bi-heart-fill');
})