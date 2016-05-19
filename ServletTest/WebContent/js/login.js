/**
 *
 */
const empty = '';

$(function(){
	$('#userId').blur(function() {
		if ($(this).val()==null || $(this).val()=="") {
			$(this).addClass("textboxAlert");
			$('#alert_id').text(' USER ID is required');
		} else {
			$(this).removeClass("textboxAlert");
			$('#alert_id').text(empty);
		}

	});

	$('#userId').focus(function() {
		$(this).removeClass("textboxAlert");
		$('#alert_id').text(empty);
	})
});

$(function(){
	$('#pass').blur(function() {
		if ($(this).val()==null || $(this).val()=="") {
			$(this).addClass("textboxAlert");
			$('#alert_pass').text(' PASSWORD is required');
		} else {
			$(this).removeClass("textboxAlert");
			$('#alert_pass').text(empty);
		}

	});

	$('#pass').focus(function() {
		$(this).removeClass("textboxAlert");
		$('#alert_pass').text(empty);
	})
});