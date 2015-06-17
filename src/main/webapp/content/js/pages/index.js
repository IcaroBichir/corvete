//Criar os calendarios 
$(function() {
	$( "#dataIda" ).datepicker();
});

$(function(){
	$("#dataVolta").datepicker();
});


//Mascara no telefone de cadastro
$(function(){
	$("#telefoneCadastro").mask("(99) 99999-9999");
});

function cadastroCliente(){
	if($('#senhaCadastro')[0].value == $('#confirmCadastro')[0].value)
	{		
		var nome = $('#nomeCadastro')[0].value;
		var cpfCnpj = $('#cpfCnpjCadastro')[0].value;
		var dataNasc = $('#dataNascCadastro')[0].value;
		var telefone = $('#telefoneCadastro')[0].value;
		var email = $('#emailCadastro')[0].value;
		var senha = $('#senhaCadastro')[0].value;
		var url = '/Corvette/cadastroCliente?nomeCadastro='+ nome +'&cpfCnpjCadastro='+ cpfCnpj +'&dataNascCadastro='+ dataNasc+
								'&telefoneCadastro='+ telefone +'&emailCadastro='+ email +'&senhaCadastro='+ senha;
		$.ajax({
			type: "POST",
			url: url,
			success: function(result) {
				if(result == ""){
					$('#nomeCadastro')[0].value = "";
					$('#cpfCnpjCadastro')[0].value = "";
					$('#dataNascCadastro')[0].value = "";
					$('#telefoneCadastro')[0].value = ""; 
					$('#emailCadastro')[0].value = "";
					$('#senhaCadastro')[0].value = "";
					$('#modelCadastro').modal('hide');
					alert("Cadastro Efetuado com sucesso.");
				}else{
					$('#nomeCadastro')[0].value = "";
					$('#cpfCnpjCadastro')[0].value = "";
					$('#dataNascCadastro')[0].value = "";
					$('#telefoneCadastro')[0].value = ""; 
					$('#emailCadastro')[0].value = "";
					$('#senhaCadastro')[0].value = "";
					$('#modelCadastro').modal('hide');
					alert(result);
				}
			},
		});
	}
	else
		alert('senhaInvalida');
}


function teste(){
	$.ajax({
		url: '/Corvette/teste?',
		sucess: function(result){
			alert('sucesso');
		}
	});
}



