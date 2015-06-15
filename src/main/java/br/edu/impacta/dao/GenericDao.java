package br.edu.impacta.dao;

import java.util.List;

import br.edu.impacta.exception.PersistenciaException;

public interface GenericDao<T> {
	
	void inserir(T obj) throws PersistenciaException;
	
	void atualiza(T obj) throws PersistenciaException;
	
	void deletar(Integer id) throws PersistenciaException;
	
	List<T> listarTodos() throws PersistenciaException;
	
	T buscarPorId(Integer id) throws PersistenciaException;
}
