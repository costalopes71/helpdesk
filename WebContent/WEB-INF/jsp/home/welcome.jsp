<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<!-- INICIO HEAD -->
	<%@include file="../templates/header.jsp"%>
<!-- FIM HEAD -->

<body>

	<!-- INICIO Menu Superiro -->
	<%@include file="../templates/menu_superior.jsp"%>
	<!-- FIM Menu Superiro -->
	
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<h1 class="mt-4 mb-3">Quem Somos</h1>

		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="index.html">Home</a></li>
			<li class="breadcrumb-item active">Quem Somos</li>
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
			<div class="col-lg-6">
				<img class="img-fluid rounded mb-4"
					src="resources/images/sinapgridproduto.png" alt="">
			</div>
			<div class="col-lg-6">
				<h2>Sinapsis</h2>
				<p>A Sinapsis é uma empresa de base tecnológica criada por uma
					equipe de pesquisadores e engenheiros formados pela Escola
					Politécnica da USP, com o objetivo de disponibilizar e adaptar
					soluções inovadoras ao mercado energético, considerando as
					exigências regulatórias e as necessidades de eficiência e
					rentabilidade dos negócios deste setor.</p>
				<p>A manutenção de vínculos de cooperação técnica com a
					Universidade proporciona permanente atualização das ferramentas e
					metodologias, ao passo que o contato com o mercado permite a
					aderência às situações reais, assim como a coleta de novos
					requisitos.</p>
			</div>
		</div>
		<div class="row text-justify">
			
			<div class="col-lg-6">
				<p>A equipe da Sinapsis é composta por profissionais com
					pós-graduação e grande experiência no setor elétrico e de energia.
					Esta vivência inclui a atuação em áreas como P&D aplicada,
					engenharia, regulação de serviços públicos e desenvolvimento de
					aplicativos computacionais, com soluções, dentre outros setores,
					para geração, transmissão e distribuição de energia elétrica e gás.</p>
				<p>Dentre os parceiros financiadores dos projetos desenvolvidos
					pela Sinapsis destacam-se: AES Eletropaulo, CEMIG Distribuição,
					Light Serviços de Eletricidade, Grupo EDP, CELESC Distribuição, AES
					Sul, AES Tietê, Federação das Cooperativas de Energia, Telefonia e
					Desenvolvimento Rural do Rio Grande do Sul – FECOERGS, DUKE Energy,
					Empresa Metropolitana de Águas e Energia – EMAE, entre outras.</p>
				
			</div>
			<div class="col-lg-6">
				<img class="img-fluid rounded mb-4" src="resources/images/aries.png"
					alt="">
			</div>
			<div class="col-lg-12">
				<p>Especializações: Distribuição de Energia Elétrica, Redes
					Elétricas Inteligentes, Regulação da Indústria de Energia,
					Comercialização de Energia, Redes Subterrâneas, Software para
					análise de redes elétricas.</p>
			</div>
		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<!-- INICIO RODAPE -->
	<%@include file="../templates/rodape.jsp"%>
	<!-- FIM RODAPE -->

	<!-- Bootstrap core JavaScript -->
	<%@include file="../templates/scripts.jsp"%>


</body>
</html>