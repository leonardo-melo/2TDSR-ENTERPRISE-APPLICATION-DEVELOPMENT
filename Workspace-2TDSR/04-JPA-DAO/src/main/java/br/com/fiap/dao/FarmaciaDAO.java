package br.com.fiap.dao;

import br.com.fiap.entity.Farmacia;

public interface FarmaciaDAO {
	
	void cadastrar(Farmacia farmacia);
	
	void deletar(int codigo);
	
	void atualizar(Farmacia farmacia);
	
	Farmacia buscar(int codigo);
	
	void commit() throws Exception;

}
