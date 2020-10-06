$(function(){
	$(".next_button").click(function(){
		$("#temp1").addClass("d-none");
		$("#temp2").removeClass("d-none");
	})
	
	$(".prv_button").click(function(){
		$("#temp2").addClass("d-none");
		$("#temp1").removeClass("d-none");
	})
})