<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/content/css/bootstrap/bootstrap.min.css" />">
<link rel="stylesheet" href="<c:url value="/content/css/pages/index.css" />"> 
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
	<div class="container" id="headerContainer">
		<div>
			<a class="navbar-brand" href="#">Corvette Airlines</a> 
		</div>
		<div class="navbar-collapse collapse" id="navbar">
			<form class="navbar-form navbar-right">
			  <div class="form-group">
			    <label class="sr-only" for="userLogin">Login</label>
			    <input type="email" class="form-control" id="userLogin" placeholder="Enter login">
			  </div>
			  <div class="form-group">
			    <label class="sr-only" for="passLogin">Password</label>
			    <input type="password" class="form-control" id="passLogin" placeholder="Password">
			  </div>
		  		<button type="submit" class="btn btn-primary">Sign in</button>
				<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modelCadastro">Cadastro</button>
			</form>
		</div>
	</div>
</nav>