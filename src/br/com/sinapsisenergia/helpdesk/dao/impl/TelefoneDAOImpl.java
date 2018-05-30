package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.TelefoneDAO;
import br.com.sinapsisenergia.helpdesk.entities.Telefone;

@Repository
public class TelefoneDAOImpl extends GenericDAOImpl<Telefone, Integer> implements TelefoneDAO {

}
