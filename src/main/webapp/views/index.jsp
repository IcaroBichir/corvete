<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/content/css/bootstrap/bootstrap.min.css" />">
<link rel="stylesheet" href="<c:url value="/content/css/pages/index.css" />">
<link rel="stylesheet" href="<c:url value="/content/css/pages/header.css" />">  
<link rel="stylesheet" href="<c:url value="/content/css/jquery/jquery-ui.css" />">
<script src="<c:url value="/content/js/jquery/jquery-2.1.4.min.js" />"></script>
<script src="<c:url value="/content/js/jquery/jquery-ui.min.js" />"></script>
<script src="<c:url value="/content/js/jquery/jquery.maskedinput.min.js" />"></script>
<script src="<c:url value="/content/js/bootstrap/bootstrap.min.js" />" ></script>
<script src="<c:url value="/content/js/pages/index.js" />"></script>
<title>Corvette Airlines</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<c:import url="header.jsp"></c:import>
</nav>

<div class="jumbotron">
	<div class="container">
		<div id="divPassagens" class="row row-fluid" id="divPassagens">
			<fieldset>
				<legend>Escolha sua passagem</legend>
				
				<div class="span8 marginTop">
					<label for="cidadeOrigem" class="marginTop"></label>
					<input type="text" class="form-control marginTop" placeholder="Cidade de origem" id="cidadeOrigem"/>
					
					<label for="cidadeDestino marginTop"></label>
					<input type="text" class="form-control marginTop" placeholder="Cidade de destino" id="cidadeDestino"/>
					
					<!-- Div para selecionar data de ida e volta -->
					<div class="span8" id="divData">
						<input type="text" class="form-control marginTop" placeholder="Data de ida" id="dataIda" /> 
						<input type="text" class="form-control marginTop" placeholder="Data de volta" id="dataVolta" />
					</div>
					<!-- Div com quantidade de passagens -->
					<div class="span8 marginTop" id="divQtdPassagens" class="marginTop">
						<select class="form-control marginTop" id="qtdAdultos">
							<option value="0">Quantidade de adultos</option>
							<option value="0">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
						</select>
						
						<select class="form-control marginTop" id="qtdCriancas">
							<option value="0">Quantidade de criancas</option>
							<option value="0">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
						</select>
						
						<select class="form-control marginTop" id="qtdBebes">
							<option value="0">Quantidade de bebes</option>
							<option value="0">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
						</select>
					</div>
					<button type="button" class="btn btn-success" aria-label="Left Align" id="btnPesquisar">
				  		<span class="glyphicon glyphicon-search" aria-hidden="true"> Pesquisar </span>
					</button>
				</div>
			</fieldset>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-4">
		</div>
		<div class="col-md-4">
		</div>
		<div class="col-md-4">
		</div>
	</div>
	<footer>
		<c:import url="footer.jsp"></c:import>
	</footer>
</div>
	
<!-- Modal -->
<div class="modal fade" id="modelCadastro" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Cadastro</h4>
      </div>
      <div class="modal-body">
       	<form action="" class="form-horizontal">
			<div class="form-group">
			    <label for="nomeCadastro" class="col-sm-2 control-label">Nome</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="nomeCadastro" placeholder="Nome" required>
			    </div>
		  	</div>
		  	<div class="form-group">
		    	<label for="cpfCnpjCadastro" class="col-sm-2 control-label">CPF/CNPJ</label>
		    	<div class="col-sm-10">
		      		<input type="text" class="form-control" id="cpfCnpjCadastro" placeholder="CPF/CNPJ">
		    	</div>
		  	</div>
		  	
		  	<div class="form-group">
		    	<label for="dataNascCadastro" class="col-sm-2 control-label">Nascimento</label>
		    	<div class="col-sm-10">
		      		<input type="date" class="form-control" id="dataNascCadastro" placeholder="Data Nascimento">
		    	</div>
		  	</div>
		  	
		  	<div class="form-group">
		    	<label for="telefoneCadastro" class="col-sm-2 control-label">Telefone</label>
		    	<div class="col-sm-10">
		      		<input type="text" class="form-control" id="telefoneCadastro" placeholder="Telefone">
		    	</div>
		  	</div>
		  	
		  	<div class="form-group">
			    <label for="emailCadastro" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-10">
			      <input type="email" class="form-control" id="emailCadastro" placeholder="Email">
			    </div>
		  	</div>
		  	<div class="form-group">
		    	<label for="senhaCadastro" class="col-sm-2 control-label">Senha</label>
		    	<div class="col-sm-10">
		      		<input type="password" class="form-control" id="senhaCadastro" placeholder="Senha">
		    	</div>
		  	</div>
		  	<div class="form-group">
		    	<label for="confirmCadastro" class="col-sm-2 control-label">Confirme</label>
		    	<div class="col-sm-10">
		      		<input type="password" class="form-control" id="confirmCadastro" placeholder="Senha">
		    	</div>
		  	</div>
		  	
		  	
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" >Fechar</button>
        <button type="button" class="btn btn-primary" onclick="cadastroCliente()">Cadastro</button>
      </div>
    </div>
  </div>
</div>

</body>
</html>