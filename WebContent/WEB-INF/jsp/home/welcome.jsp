<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home | Portal Sinapsis</title>

<!-- CSS includes -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/fonts/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/modern-business.css" rel="stylesheet">

</head>
<body>

	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html"> <img
				src="resources/images/logo.png" alt="" width="200" height="41">
			</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="about.html">Home</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarDropdownPortfolio" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> Administração </a>
						<div class="dropdown-menu dropdown-menu-right"
							aria-labelledby="navbarDropdownPortfolio">
							<a class="dropdown-item" href="portfolio-1-col.html">Empresa</a>
							<a class="dropdown-item" href="portfolio-2-col.html">FAQ</a> <a
								class="dropdown-item" href="portfolio-3-col.html">Produtos</a> <a
								class="dropdown-item" href="portfolio-4-col.html">Upload</a> <a
								class="dropdown-item" href="portfolio-item.html">Usuário</a>
						</div></li>
					<li class="nav-item"><a class="nav-link"  href="#">Downloads</a></li>
					<li class="nav-item"><a class="nav-link" href="#">FAQ</a></li>
					<li class="nav-item"><a class="nav-link"  href="#">Logout</a></li>
				</ul>
			
			</div>
		</div>
	</nav>

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


	<footer id="subfooter" class="clearfix">
		<div class="container">
			<div class="row">

				<div class="col-md-4">
					<p style="font-size: 18px;">
						<span class="fa fa fa-laptop"></span> Sobre HelpDesk
					</p>
					<p>Serviço de atendimento aos clientes que procuram por soluções e esclarecimentos.</p>
				</div>

				<div class="col-md-4">
					<p style="font-size: 18px;">
						<span class="fa fa-phone"></span> CONTATOS
					</p>
					Al. Jaú, 48 - São Paulo/SP 01420-000, Brasil <br />+55 (11)
					5051-0744 <br />+55 (11) 2614-0744 <br />+55 (11) 2615-0744
					<p>
						<a href="mailto:mail@example.com">suporte@sinapsisenergia.com</a>
					</p>
				</div>

				<div class="col-md-4">
					<p style="font-size: 18px;">
						<span class="fa fa-info"></span> FAQ
					</p>
					<div class="input-group">
						<input type="text" class="form-control"
							placeholder="Digite sua dúvida aqui..." /> <span
							class="input-group-btn">
							<button class="btn btn-primary" type="button">Pesquisar</button>
						</span>
					</div>
					<p>
						<br />
					</p>
				</div>

			</div>
		</div>
	</footer>

	<!-- Footer -->
	<footer id="footer" class="">
		<div class="container">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<p>
							<a class="fa fa-facebook footer-socialicon" target="_blank"
								href="https://www.facebook.com/Sinapsisinovacao"></a> <a
								class="fa fa-map-marker footer-socialicon"
								href="https://maps.google.com.br/maps?f=q&amp;source=s_q&amp;hl=pt-PT&amp;geocode=&amp;authuser=0&amp;q=al.%20Ja%C3%BA,%2048%20-%20S%C3%A3o%20Paulo&amp;aq=&amp;vps=1&amp;jsv=465b&amp;sll=-22.546052,-48.635514&amp;sspn=5.751495,10.821533&amp;vpsrc=3&amp;ie=UTF8&amp;ct=clnk&amp;cd=1&amp;spell=1"
								target="_blank"></a> <a class="fa fa-linkedin footer-socialicon"
								target="_blank"
								href="https://www.linkedin.com/company/sinapsis-inova-o-em-energia-ltda./"></a>
						</p>
					</div>
					<div class="col-lg-4">
						<p>
							Created by <a href="http://www.sinapsisenergia.com"
								title="Sinapsis Energia">Sinapsis Energia</a>
						</p>
						<p>Copyright © Sinapsis Energia 2018</p>
					</div>
				</div>
			</div>
		</div>
		<!-- /.container -->
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="resources/js/jquery-3.3.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>


</body>
</html>