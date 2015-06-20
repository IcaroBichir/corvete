package br.edu.impacta.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.impacta.dao.UsuarioDao;
import br.edu.impacta.model.Usuario;

@Controller
public class LoginController extends HttpServlet {
	
	@RequestMapping("/login")
	@ResponseBody
	public String Login(HttpServletRequest request, HttpServletResponse response){
		try{
			HttpSession session = request.getSession();
			
			String userName = request.getParameter("username");
			String passWord = request.getParameter("password");
			
			//Cria objeto 
			Usuario user = new Usuario();
			user.setEmail(userName);
			user.setSenha(passWord);
			
			//Faz a consulta do usuario
			UsuarioDao userDao = new UsuarioDao();
			user = userDao.busca(user);
			if(user != null){
				System.out.println(user.getNome());
				session.setAttribute("user", user.getNome());
				return "Sucesso";
			} else
				return "Usuario ou senha invalido.";			

		}catch(Exception e){
			System.out.println(e.getMessage());
			return "Não foi possivel efetaur o login. Erro: " + e.getMessage();
		}
	}
}
