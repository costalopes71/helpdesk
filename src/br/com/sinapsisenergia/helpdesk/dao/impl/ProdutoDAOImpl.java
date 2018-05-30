package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.ProdutoDAO;
import br.com.sinapsisenergia.helpdesk.entities.Produto;

@Repository
public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Integer> implements ProdutoDAO {

}
