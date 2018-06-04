package br.com.sinapsisenergia.helpdesk.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.sinapsisenergia.helpdesk.entities.Usuario;

/**
 * Classe respons�vel por verificar e controlar a sess�o do usu�rio logado no portal sinapsis
 * @author Joao Lopes
 * */
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestURI = request.getRequestURI();
		if (!requestURI.equals("/login/") || !requestURI.equals("") || !requestURI.equals("/")) {
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado");
			if (usuario == null) {
				response.sendRedirect(request.getContextPath() + "/login/");
				return false;
			}
		}
		return true;
	}

}
