$(".comm_answer").click(() => {
	$(".childcomm").css('display','block');
})

$(".button.button-circle.button-small.mt-3").click(() => {
	$(".childcomm").css('display','none');
})

$("#submit-button").click(() => {
	$.ajax({
		url: "recomment",
		type: "post",
	})
})