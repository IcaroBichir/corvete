package br.edu.impacta.dao;

import java.util.List;

import br.edu.impacta.exception.PersistenciaException;

public interface GenericDao<T> {
	
	String inserir(T obj) throws PersistenciaException;
	
	String atualiza(T obj) throws PersistenciaException;
	
	String deletar(Integer id) throws PersistenciaException;
	
	List<T> listarTodos() throws PersistenciaException;
	
	List<T> busca(T obj) throws PersistenciaException;
}
