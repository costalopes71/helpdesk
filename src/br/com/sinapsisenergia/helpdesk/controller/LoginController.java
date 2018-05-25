package br.com.sinapsisenergia.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sinapsisenergia.helpdesk.security.Login;

@Controller
@RequestMapping(value={"", "login"})
public class LoginController {

	@GetMapping("/")
    public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("home/login");
    	modelAndView.addObject("login", new Login());
        return modelAndView;
    }
	
	@PostMapping("/logar")
	public ModelAndView logar(@ModelAttribute Login login) {
		ModelAndView model = new ModelAndView("home/welcome");
		
		System.out.println("Username: " + login.getUsername());
		System.out.println("Password: " + login.getPassword());
		
		return model;
		
	}
	
}
