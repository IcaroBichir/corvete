package br.edu.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.impacta.exception.PersistenciaException;
import br.edu.impacta.model.Cidade;
import br.edu.impacta.model.Voo;
import br.edu.impacta.util.ConnectionUtil;

public class VooDao implements GenericDao<Voo> {

	@Override
	public String inserir(Voo obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualiza(Voo obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voo> listarTodos() throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voo> listarTodos(Voo obj) throws PersistenciaException {
		try{

		}catch(Exception e){
			
		}
		return null;
	}

	@Override
	public Voo busca(Voo obj) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Voo> listarTodos(Voo voo, Cidade cidadeOrigem, Cidade cidadeDestino){
		try {
			Connection conn = ConnectionUtil.getInstance().getConection();
			String query = "select * from Voo where Id_Cidade_Origem = ? and Id_Cidade_Destino = ? and Data_Saida like ?";
			
			PreparedStatement prepare = conn.prepareStatement(query);
			System.out.println(cidadeOrigem.getId_Cidade());
			prepare.setInt(1, cidadeOrigem.getId_Cidade());
			System.out.println(cidadeDestino.getId_Cidade());
			prepare.setInt(2, cidadeDestino.getId_Cidade());
			System.out.println(voo.getData_Saida());
			prepare.setString(3, voo.getData_Saida());
			
			ResultSet result = prepare.executeQuery();
			List<Voo> listVoo = new ArrayList<>();
			Voo objVoo;
			if(result != null){
				while(result.next()){
					objVoo = new Voo();
					objVoo.setData_Chegada(result.getString("Data_Chegada"));
					objVoo.setData_Saida(result.getString("Data_Saida"));
					objVoo.setId_Cidade_Destino(result.getInt("Id_Cidade_Destino"));
					objVoo.setId_Cidade_Origem(result.getInt("Id_Cidade_Origem"));
					objVoo.setId_Voo(result.getInt("Id_Voo"));
					listVoo.add(objVoo);
				}
			}
			
			conn.close();
			conn = null;
			return listVoo;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
