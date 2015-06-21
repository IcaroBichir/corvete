package br.edu.impacta.controller;

import com.google.gson.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.json.stream.JsonParser;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.impacta.dao.CidadeDao;
import br.edu.impacta.dao.UsuarioDao;
import br.edu.impacta.dao.VooDao;
import br.edu.impacta.model.Cidade;
import br.edu.impacta.model.Usuario;
import br.edu.impacta.model.Voo;
import br.edu.impacta.service.ListaVoo;
import br.edu.impacta.service.Voo_Service;
import br.edu.impacta.util.ConnectionUtil;

@Controller
public class IndexController extends HttpServlet {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/buscaPassagens")
	@ResponseBody
	public String BuscaPassagens(HttpServletRequest request, HttpServletResponse response){
		try{
			String cidadeOrigem = request.getParameter("cidadeOrigem").toLowerCase();
			String cidadeDestino = request.getParameter("cidadeDestino").toLowerCase();
			String dataIda = request.getParameter("dataIda");
			String dataVolta = request.getParameter("dataVolta");
			
			Voo_Service voo = new Voo_Service();
			List<ListaVoo> result = voo.GetListaVoo(cidadeOrigem, cidadeDestino, dataIda, dataVolta);
			if(result != null){
				ModelAndView mv = new ModelAndView("passagens", "lista", result);
				mv.addObject("lista", result);
				
				return "/passagens";
				//return result; 
			}
			return "Nenhuma passagem encontrada";
		}catch(Exception e){
			return "Erro. " + e.getMessage();
		}
	}
	
	@RequestMapping("/cadastroCliente")
	@ResponseBody
	public String CadastroCliente(HttpServletRequest request, HttpServletResponse response){		
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
			return userDao.inserir(user);
		}
		catch(Exception e){
			return e.getMessage();
		}
	}
}
