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
    <link href="resources/css/theme.css" rel="stylesheet">

</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a href="index.html" title="Portal Sinapsis Energia">
                <img class="img-responsive img-responsive2" src="resources/images/logo.png" alt="Logo da Sinapsis Energia"/>
            </a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="index.html" class="smooth-scroll">HOME</a></li>
				<li class="nav-item dropdown show">
					<a href="#" class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">CHAMADOS</a>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
					    <li><a class="dropdown-item" href="#">Abrir Chamado</a></li>
					    <li><a class="dropdown-item" href="#">Consultar Chamado</a></li>
					    <li><a class="dropdown-item" href="#">Histórico Chamado</a></li>
					  </ul>
				</li>
				<li><a href="#">DOWNLOADS</a></li>
				<li><a href="#">FAQ</a></li>
				<li><a href="#">LOGOUT</a></li>
			</ul>
		</div><!-- /.navbar-collapse -->
	</div><!-- /.container-fluid -->
</nav>

<div class="container">
	
	<h1>
		<b>Quem somos</b>
	</h1>
	
	<div class="row text-justify sobreNos">
		<div class="col-md-7">
			<p>A Sinapsis é uma empresa de base tecnológica criada por uma equipe de pesquisadores e engenheiros formados pela Escola Politécnica da USP,	com o objetivo de disponibilizar e adaptar soluções inovadoras ao mercado energético, considerando as exigências regulatórias e as	necessidades de eficiência e rentabilidade dos negócios deste setor.</p>
			<p>A manutenção de vínculos de cooperação técnica com a Universidade proporciona permanente atualização das ferramentas e metodologias, ao passo que o contato com o mercado permite a aderência às situações reais, assim como a coleta de novos requisitos.</p>
		</div>
		<div class="col-md-5">
			<img class="img-responsive" src="resources/images/sinapgridproduto.png">
		</div>
	</div>
	
	<div class="row text-justify sobreNos">
		<div class="col-md-5">
			<img class="img-responsive" src="resources/images/aries.png">			
		</div>
		<div class="col-md-7">
			<p>A equipe da Sinapsis é composta por profissionais com pós-graduação e grande experiência no setor elétrico e de energia. Esta vivência inclui a atuação em áreas como P&D aplicada, engenharia, regulação de serviços públicos e desenvolvimento de aplicativos computacionais, com soluções, dentre outros setores, para geração, transmissão e distribuição de energia elétrica e gás.</p>
			<p>Dentre os parceiros financiadores dos projetos desenvolvidos pela Sinapsis destacam-se: AES Eletropaulo, CEMIG Distribuição, Light Serviços de Eletricidade, Grupo EDP, CELESC Distribuição, AES Sul, AES Tietê, Federação das Cooperativas de Energia, Telefonia e Desenvolvimento Rural do Rio Grande do Sul – FECOERGS, DUKE Energy, Empresa Metropolitana de Águas e Energia – EMAE, entre outras.</p>
		</div>
	</div>

	<div class="row text-justify sobreNos">
		<div class="col-md-12">
			<p>Especializações:
			Distribuição de Energia Elétrica, Redes Elétricas Inteligentes, Regulação da Indústria de Energia, Comercialização de Energia, Redes Subterrâneas, Software para análise de redes elétricas.</p>
		</div>
	</div>
</div>


<footer id="subfooter" class="clearfix">
    <div class="container">
        <div class="row">
            
            <div class="col-md-4">
                <p style="font-size:18px;"><span class="fa fa fa-laptop"></span> OUR OFFERS</p>
                <p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.</p>
            </div>
            
			<div class="col-md-4">
                <p style="font-size:18px;"><span class="fa fa-phone"></span> CONTATOS</p>
               	Al. Jaú, 48 - São Paulo/SP 01420-000, Brasil
                <br/>+55 (11) 5051-0744
                <br/>+55 (11) 2614-0744
                <br/>+55 (11) 2615-0744
                <p><a href="mailto:mail@example.com">suporte@sinapsisenergia.com</a></p>
            </div>
            
            <div class="col-md-4">
                <p style="font-size:18px;"><span class="fa fa-info"></span> FAQ</p>
                <div class="input-group">
                	<input type="text" class="form-control" placeholder="Digite sua dúvida aqui..." />
                    <span class="input-group-btn">
                    	<button class="btn btn-primary" type="button">Pesquisar</button>
                    </span>
				</div>
                <p><br/></p>
            </div>
            
        </div>
    </div>
</footer>

<footer id="footer" class="clearfix">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <p>
                    <a class="fa fa-facebook footer-socialicon" target="_blank" href="https://www.facebook.com/Sinapsisinovacao"></a>
                    <a class="fa fa-map-marker footer-socialicon" href="https://maps.google.com.br/maps?f=q&amp;source=s_q&amp;hl=pt-PT&amp;geocode=&amp;authuser=0&amp;q=al.%20Ja%C3%BA,%2048%20-%20S%C3%A3o%20Paulo&amp;aq=&amp;vps=1&amp;jsv=465b&amp;sll=-22.546052,-48.635514&amp;sspn=5.751495,10.821533&amp;vpsrc=3&amp;ie=UTF8&amp;ct=clnk&amp;cd=1&amp;spell=1" target="_blank"></a>
                    <a class="fa fa-linkedin footer-socialicon" target="_blank" href="https://www.linkedin.com/company/sinapsis-inova-o-em-energia-ltda./"></a>
                </p>
            </div>
            <div class="col-md-4">
                <p>Created by <a href="http://www.sinapsisenergia.com" title="Sinapsis Energia">Sinapsis Energia</a></p>
                <p>Copyright © Sinapsis Energia 2018</p>
            </div>
        </div>
    </div>
</footer>

<script src="resources/js/jquery-3.3.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>