<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<!-- inicio do head -->
<%@include file="../templates/header.jsp"%>
<!-- fim do head -->

<body id="login-init">
	<div class="row">
		<div
			class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading text-center">
					<img class="img-responsive img-center" alt="etc" src="<c:url value="/resources/images/logo.png"/>"/>
				</div>
				<div class="text-center">
					<h4>Help Desk Sinapsis</h4>
				</div>
				<div style="margin-bottom: 50px;" class="panel-body">
					<c:url value="/login/logar" var="action"/>
					<form:form id="loginForm" modelAttribute="login" action="${action}" method="post">
						<fieldset>
							<div class="form-group">
								<form:input path="username" name="" id="username" class="form-control" placeholder="Usuário"/>
							</div>
							<div class="form-group">
								<form:password path="" name="password" id="password" class="form-control" placeholder="Senha"/>
							</div>
							<form:button id="login-init" name="login" class="btn btn-primary btn-block">Login</form:button>
						</fieldset>
					</form:form>
					<div style="width: 100%; margin: 0 auto;">
						<h5 style="text-align: center; color: red; padding-bottom: 25px;">${message}</h5>
					</div>
				</div>
			</div>
		</div>
		<!-- /.col-->
	</div>
	<!-- /.row -->
	
	<%@include file="../templates/scripts.jsp"%>
		
</body>
</html>
