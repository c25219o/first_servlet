/**
 *
 */
const empty = '';

$(function(){
	$('#userId').blur(function() {
		if ($(this).val()==null || $(this).val()=="") {
			$(this).addClass("textboxAlert");
			$('#alert_id').text('IDが未入力です');
		} else {
			$(this).removeClass("textboxAlert");
			$('#alert_id').text(empty);
		}

	});
});

$(function(){
	$('#pass').blur(function() {
		if ($(this).val()==null || $(this).val()=="") {
			$(this).addClass("textboxAlert");
			$('#alert_pass').text('パスワードが未入力です');
		} else {
			$(this).removeClass("textboxAlert");
			$('#alert_pass').text(empty);
		}

	});
});