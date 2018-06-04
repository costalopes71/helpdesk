package br.com.sinapsisenergia.helpdesk.dao;

import br.com.sinapsisenergia.helpdesk.entities.Usuario;
import br.com.sinapsisenergia.helpdesk.exceptions.DBException;
import br.com.sinapsisenergia.helpdesk.security.Login;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{

	Usuario logar(Login login) throws DBException;

}
