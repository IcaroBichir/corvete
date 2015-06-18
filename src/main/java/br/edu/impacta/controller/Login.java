package br.edu.impacta.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
	
	@RequestMapping("/loginUsuario")
	@ResponseBody
	public Boolean Login(HttpServletRequest request){
		return true;
	}

}
