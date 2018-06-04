package br.com.sinapsisenergia.helpdesk.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.sinapsisenergia.helpdesk.dao.UsuarioDAO;
import br.com.sinapsisenergia.helpdesk.entities.Usuario;
import br.com.sinapsisenergia.helpdesk.exceptions.DBException;
import br.com.sinapsisenergia.helpdesk.security.Login;

@Service
public class UsuarioBO {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public Usuario logar(Login login) throws Exception {
		
		try {
			return usuarioDAO.logar(login);
		} catch (Exception e) {
			throw new DBException(e.getMessage());
		}
		
	}
	
}
