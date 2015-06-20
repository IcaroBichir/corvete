function login(){
	var login = $('#userLogin')[0].value;
	var password = $('#passLogin')[0].value;
	
	var url = '/Corvette/login?username='+ login +'&password='+ password;
	$.ajax({
		type: "POST",
		url: url,
		success: function(result) {
			alert(result);
			if ( true ) {
				$('#formLogin')[0].style.display = 'none';
				System.out.Println("Login realizado com Sucesso")
			} else {
				$('#formLogin')[0].style.display = 'block';
				System.out.Println("Falha no login")
			}
			
		}
		
	});
}