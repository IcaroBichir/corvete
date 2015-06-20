function login(){
	var login = $('#userLogin')[0].value;
	var password = $('#passLogin')[0].value;
	
	var url = '/Corvette/login?username='+ login +'&password='+ password;
	$.ajax({
		type: "POST",
		url: url,
		success: function(data, textStatus, jqXHR)
	    {
			if (jqXHR.status != 200){
				alert(textStatus);
			} 
	    },
	    error: function (jqXHR, textStatus, errorThrown)
	    {
	    	alert(errorThrown);
	    }
	});
}