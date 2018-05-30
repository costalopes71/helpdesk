package br.com.sinapsisenergia.helpdesk.dao;

import java.util.List;

import br.com.sinapsisenergia.helpdesk.exceptions.DBException;

public interface GenericDAO<T,K> {

	List<T> listar() throws DBException;
	void cadastrar(T entity) throws DBException;
	void alterar(T entity) throws DBException;
	T pesquisar(K codigo) throws DBException;
	void remover(K codigo) throws DBException;
	
}
