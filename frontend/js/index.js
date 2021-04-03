$(document).ready(function(){
	$("#convert").click(function(){
		var input = $("#value").val();
		var urlGateway = "https://f8j4vnxsf9.execute-api.us-east-1.amazonaws.com/convert?value="+input;
		$.ajax({
			type: "GET",
			url: urlGateway,
			success: function(data){
				$("#res").text("The Celsius degree value is: " + data.celcius);
			}
		});
	})
})