$(document)
		.ready(
				function() {
					$('#contact_name').on('input', function() {
						console.log("it works here");
						var input = $(this);
						var is_name = input.val();
						if (is_name) {
							input.removeClass("invalid").addClass("valid");
						} else {
							input.removeClass("valid").addClass("invalid");
						}
					});
					
					$('#contact_email')
							.on(
									'input',
									function() {
										var input = $(this);
										var re = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
										var is_email = re.test(input.val());
										if (is_email) {
											input.removeClass("invalid")
													.addClass("valid");
										} else {
											input.removeClass("valid")
													.addClass("invalid");
										}
									});

					$('#contact_subject').on('input', function() {

						var input = $(this);
						var is_subject = input.val();
						if (is_subject) {
							input.removeClass("invalid").addClass("valid");
						} else {
							input.removeClass("valid").addClass("invalid");
						}
					});

					$('#contact_message').keyup(function(event) {
						var input = $(this);
						var message = $(this).val();
						console.log(message);
						if (message) {
							input.removeClass("invalid").addClass("valid");
						} else {
							input.removeClass("valid").addClass("invalid");
						}
					});

					$("#contact_submit input").click(
							function(event) {
								console.log("#contact_submit,it works here");
								var form_data = $("#contact").serializeArray();
								var error_free = true;
								for ( var input in form_data) {
									var element = $("#contact_"
											+ form_data[input]['name']);
									var valid = element.hasClass("valid");
									var error_element = $("span", element
											.parent());
									if (!valid) {
										error_element.removeClass("error")
												.addClass("error_show");
										error_free = false;
									} else {
										error_element.removeClass("error_show")
												.addClass("error");
									}
								}
								if (!error_free) {
									event.preventDefault();
								}

							});// end of form validation
					
					
					
					$('#dashboard').hover(
						     function() {
								$(this).stop().animate(
								{
									left: '0',
									backgroundColor: 'rgb(255,255,255)'
								},
								500,
								'easeInSine'
								); // end of animation
							 }, 
							 function() {
								 $(this).stop().animate(
								{
									left: '-75px',
									backgroundColor: 'rgb(110,138,195)'
								},
								1500,
								'easeOutBounce'
								); // end of animation
							 }
						  ); 
					
					$('.bio_intro').hide().fadeIn(2000);// fade in effect at home page

				});



function mycheck(chk) {
	var divsToHide = document.getElementsByClassName("cf");

	if (chk.checked === true) {
		document.getElementbyId("contact_feedback").style.display = "block";
	}
}


