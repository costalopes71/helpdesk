<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pt-br">

<!-- INICIO HEAD -->
	<%@include file="../templates/header.jsp"%>
<!-- FIM HEAD -->

<body>

	<!-- INICIO Menu Superior -->
	<%@include file="../templates/menu_superior.jsp"%>
	<!-- FIM Menu Superiro -->
	
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<h1 class="mt-4 mb-3">Cadastrar Usuário</h1>

		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="welcome.jsp">Home</a></li>
			<li class="breadcrumb-item active">Cadastrar Usuário</li>
			<form class="form-inline" id="breadcrumb-faq">
			    <div class="input-group">
			      <input type="text" class="form-control" placeholder="Digite sua dúvida aqui..." aria-label="Username" aria-describedby="basic-addon1">
			      <div class="input-group-prepend">
			        <button class="input-group-text" id="basic-addon1">Ok</button>
			      </div>
			    </div>
 			 </form>
		</ol>

		<!-- Intro Content -->
		<div class="row text-justify">
			
		</div>
		
	</div>
	<!-- /.container -->

	<!-- INICIO RODAPE -->
	<%@include file="../templates/rodape.jsp"%>
	<!-- FIM RODAPE -->

	<!-- Bootstrap core JavaScript -->
	<%@include file="../templates/scripts.jsp"%>


</body>
</html>