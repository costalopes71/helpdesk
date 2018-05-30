package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.EmpresaDAO;
import br.com.sinapsisenergia.helpdesk.entities.Empresa;

@Repository
public class EmpresaDAOImpl extends GenericDAOImpl<Empresa, Integer> implements EmpresaDAO {

}
