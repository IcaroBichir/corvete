package br.edu.impacta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {
	
	@RequestMapping("/cadastro")
	public ModelAndView index() {
		return new ModelAndView("cadastroPassagens");
	}
	
}
