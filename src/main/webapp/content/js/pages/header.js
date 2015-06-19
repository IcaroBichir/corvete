function login(){
	var login = $
	
	var url = '/Corvette/cadastroCliente?username='+ login +'&password='+ password;
	$.ajax({
		type: "POST",
		url: url,
		success: function(result) {
			
		},
	});
}