package br.edu.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.edu.impacta.exception.PersistenciaException;
import br.edu.impacta.model.Cidade;
import br.edu.impacta.util.ConnectionUtil;

public class CidadeDao implements GenericDao<Cidade> {

	@Override
	public String inserir(Cidade obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualiza(Cidade obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cidade> listarTodos() throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cidade> listarTodos(Cidade obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cidade busca(Cidade obj) throws PersistenciaException {
		try {
			Cidade cidade = new Cidade();
			Connection conn = ConnectionUtil.getInstance().getConection();
			String query = "select * from cidade where nome like ? limit 1";
			
			PreparedStatement prepare = conn.prepareStatement(query);
			System.out.println(obj.getNome());
			prepare.setString(1, obj.getNome());
			
			System.out.println(query);
			ResultSet result = prepare.executeQuery();
			
			if(result != null){
				while(result.next()){
					cidade.setId_Cidade(result.getInt("Id_Cidade"));
					cidade.setId_Estado(result.getInt("Id_Estado"));
					cidade.setNome(result.getString("Nome"));
				}
				return cidade;
			}
			conn.close();
			conn = null;
			return cidade == null ? null : cidade;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
