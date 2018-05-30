package br.com.sinapsisenergia.helpdesk.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.UsuarioDAO;
import br.com.sinapsisenergia.helpdesk.entities.Usuario;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO {

}
