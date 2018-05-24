package br.com.sinapsisenergia.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
