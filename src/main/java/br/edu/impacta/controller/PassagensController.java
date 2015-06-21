package br.edu.impacta.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.impacta.service.ListaVoo;
import br.edu.impacta.service.Voo_Service;

@Controller
public class PassagensController extends HttpServlet{

	@RequestMapping(value="/passagens", method= RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request) {
		return new ModelAndView("passagens");
	}	
}
