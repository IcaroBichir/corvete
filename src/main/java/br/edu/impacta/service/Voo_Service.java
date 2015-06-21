package br.edu.impacta.service;

import java.util.ArrayList;
import java.util.List;

import br.edu.impacta.dao.CidadeDao;
import br.edu.impacta.dao.VooDao;
import br.edu.impacta.model.Cidade;
import br.edu.impacta.model.Voo;

public class Voo_Service {
	
	public List<ListaVoo> GetListaVoo(String cidadeOrigem ,String cidadeDestino, String dataIda, String dataVolta){
		try{

			CidadeDao cDao = new CidadeDao();
			
			//Cria objeto cidade origem
			Cidade cidade = new Cidade();
			cidade.setNome(cidadeOrigem);
			Cidade origem = cDao.busca(cidade);
			
			//Cria objeto cidade Destino
			cidade = new Cidade();
			cidade.setNome(cidadeDestino);
			Cidade destino = cDao.busca(cidade);
			
			VooDao vDao = new VooDao();
			
			//Cria Lista das passagens de Ida
			Voo voo = new Voo();
			voo.setData_Saida(dataIda);
			List<Voo> listVooIda = vDao.listarTodos(voo, origem, destino);
			
			//Cria lista das passagens de volta
			voo = new Voo();
			voo.setData_Saida(dataVolta);
			List<Voo> listVooVolta = vDao.listarTodos(voo, destino, origem);
			
			List<ListaVoo> listaVoo = new ArrayList<>();
			ListaVoo lista;
			for(Voo v : listVooIda){
				lista = new ListaVoo();
				lista.setData_Saida_Ida(v.getData_Saida());
				lista.setData_Chegada_Ida(v.getData_Chegada());
				for(Voo vo : listVooVolta){
					lista.setData_Saida_Volta(vo.getData_Saida());
					lista.setData_Chegada_Volta(vo.getData_Chegada());
				}
				listaVoo.add(lista);
			}
			return listaVoo;
			
		}catch(Exception e){
			
		}
		return null;
	}
}
