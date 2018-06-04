<nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light fixed-top">
	<div class="container">
		<a class="navbar-brand" href="<c:url value="/login/welcome"/>"><img	src="<c:url value="/resources/images/logo.png"/>" alt="" width="200" height="41"></a>
		<button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/login/welcome"/>">Home</a></li>
				<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Administração </a>
					<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
						<a class="dropdown-item" href="#">Cadastrar Empresa</a> 
						<a class="dropdown-item" href="#">Cadastrar FAQ</a> 
						<a class="dropdown-item" href="#">Cadastrar Produto</a> 
						<a class="dropdown-item" href="#">Cadastrar Download</a>
						<a class="dropdown-item" href="#">Cadastrar Usuário</a>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Downloads</a></li>
				<li class="nav-item"><a class="nav-link" href="#">FAQ</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/login/logout"/>">Logout</a></li>
			</ul>
		</div>
	</div>
</nav>