package br.edu.impacta.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.jms.ConnectionFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.impacta.dao.UsuarioDao;
import br.edu.impacta.model.Usuario;
import br.edu.impacta.util.ConnectionUtil;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/cadastroCliente")
	@ResponseBody
	public String cadastroCliente(HttpServletRequest request){		
		try
		{
			String nome = request.getParameter("nomeCadastro");
			String cpfCnpj = request.getParameter("cpfCnpjCadastro");
			String email = request.getParameter("emailCadastro");
			String telefone = request.getParameter("telefoneCadastro");
			String senha = request.getParameter("senhaCadastro");
			String datanasc = request.getParameter("dataNascCadastro");
			long tel = Long.parseLong(telefone.replace(")","").replace("(","").replace(" ", "").replace("-",""));
			System.out.println(datanasc);
			
			Usuario user = new Usuario();
			user.setNome(nome);
			user.setCPF_CNPJ(Integer.parseInt(cpfCnpj));
			user.setData_Nascimento(datanasc);
			user.setEmail(email);
			user.setTelefone(tel);
			user.setSenha(senha);
			
			UsuarioDao userDao = new UsuarioDao();
			userDao.inserir(user);
			
			return "Cliente cadastrado com sucesso!";
		}
		catch(Exception e){
			return "Erro ao efetuar cadastro. Erro: " + e.getMessage();
		}
	}
	
	@RequestMapping("/teste")
	@ResponseBody
	public String teste(){
		System.out.println("teste");
		return "teste";
	}
}
