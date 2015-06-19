package br.edu.impacta.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.impacta.dao.UsuarioDao;
import br.edu.impacta.model.Usuario;

@Controller
public class RelatorioController {
	
	@RequestMapping("/relatorio")
	public ModelAndView index() {
		return new ModelAndView("relatorio");
	}	
}
