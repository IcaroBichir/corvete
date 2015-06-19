package br.edu.impacta.dao;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.plaf.TextUI;

import antlr.StringUtils;
import br.edu.impacta.exception.PersistenciaException;
import br.edu.impacta.model.Usuario;
import br.edu.impacta.util.ConnectionUtil;
import br.edu.impacta.util.Criptografia;

public class UsuarioDao implements GenericDao<Usuario>{

	@Override
	public String inserir(Usuario obj)  {
		try{
			Connection conn = ConnectionUtil.getInstance().getConection();
			String query = "insert into usuario(Nome, Data_Nascimento, Telefone, CPF_CNPJ, Email, Senha)"
					+ " values(?,?,?,?,?,?)";
			if(busca(obj).size() <= 0)
			{
				PreparedStatement statement = conn.prepareStatement(query);
				statement.setString(1, obj.getNome());
				statement.setString(2, obj.getData_Nascimento());
				statement.setLong(3, obj.getTelefone());
				statement.setLong(4, obj.getCPF_CNPJ());
				statement.setString(5, obj.getEmail());
				statement.setString(6, obj.getSenha());
				
				statement.execute();
				conn.close();
				conn = null;
				return "";
			}else
				return "Usuário já cadastrado!";
			
		}catch(Exception e){
			return "Erro ao cadastrar usuario. Erro: " + e.getMessage();
		}
	}


	@Override
	public String atualiza(Usuario obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarTodos() throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Usuario> busca(Usuario obj) throws PersistenciaException {
		try{
			
			Connection conn = ConnectionUtil.getInstance().getConection();
			String query;
			PreparedStatement statement;
			
			if(obj.getEmail() == "" || obj.getEmail() == null ){
				query = "select * from usuario where CPF_CNPJ = ? and Email = ?";	
				statement = conn.prepareStatement(query);
				statement.setLong(1, obj.getCPF_CNPJ());
				statement.setString(2, obj.getEmail());
			}else{
				query = "select  from usuario where Email = ? and Senha = ?";
				statement = conn.prepareStatement(query);
				statement.setString(1, obj.getEmail());
				statement.setString(2, obj.getSenha());
			}
			
			ResultSet result = statement.executeQuery();
			
			//Cria lista com objeto
			List<Usuario> list = new ArrayList<Usuario>();
			Usuario user;
			while(result.next()){
				user = new Usuario();
				user.setCPF_CNPJ(result.getLong("CPF_CNPJ"));
				user.setData_Nascimento(result.getString("Data_Nascimento"));
				user.setEmail(result.getString("Email"));
				user.setNome(result.getString("Nome"));
				user.setId_Usuario(result.getInt("Id_usuario"));
				user.setSenha(result.getString("Senha"));
				user.setTelefone(result.getLong("Telefone"));
				list.add(user);
			}
			
			return list;
			
		}catch(Exception e){
			try {
				throw new Exception("Erro ao efetuar consulta. " + e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return null;
	}
}
