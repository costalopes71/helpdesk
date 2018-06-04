package br.com.sinapsisenergia.helpdesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sinapsisenergia.helpdesk.bo.UsuarioBO;
import br.com.sinapsisenergia.helpdesk.entities.Usuario;
import br.com.sinapsisenergia.helpdesk.security.Login;

@Controller
@RequestMapping(value={"", "login"})
public class LoginController {

	@Autowired
	private UsuarioBO usuarioBO;
	
	@GetMapping("/")
    public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("home/login");
    	modelAndView.addObject("login", new Login());
        return modelAndView;
    }
	
	@PostMapping("/logar")
	public ModelAndView logar(HttpServletRequest request, @ModelAttribute Login login) {
		ModelAndView model = new ModelAndView("home/welcome");
		
		Usuario usuario = null;
		try {
			usuario = usuarioBO.logar(login);
		} catch (Exception e) {
			model = new ModelAndView("home/login");
			model.addObject("message", e.getMessage());
			return model;
		}
		
		request.getSession().setAttribute("usuarioLogado", usuario);
		
		return model;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return welcome();
	}
	
	@GetMapping("/welcome")
	public String voltar2Welcome() {
		return "/home/welcome";
	}
	
}
