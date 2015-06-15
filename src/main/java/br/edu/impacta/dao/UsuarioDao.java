package br.edu.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.edu.impacta.exception.PersistenciaException;
import br.edu.impacta.model.Usuario;
import br.edu.impacta.util.ConnectionUtil;

public class UsuarioDao implements GenericDao<Usuario>{

	@Override
	public void inserir(Usuario obj) throws PersistenciaException {
		try{
			Connection conn = new ConnectionUtil().getConection();
			String query = "insert into usuario(Nome, Data_Nascimento, Telefone, CPF_CNPJ, Email, Senha)"
					+ " values(?,?,?,?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, obj.getNome());
			statement.setString(2, obj.getData_Nascimento());
			statement.setLong(3, obj.getTelefone());
			statement.setInt(4, obj.getCPF_CNPJ());
			statement.setString(5, obj.getEmail());
			statement.setString(6, obj.getSenha());
			
			statement.execute();
			conn.close();
			
		}catch(Exception e){
			try {
				throw new Exception("Erro ao cadastrar usuario. Erro: " + e.getMessage());
			} catch (Exception e1) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void atualiza(Usuario obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarTodos() throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorId(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}
}
