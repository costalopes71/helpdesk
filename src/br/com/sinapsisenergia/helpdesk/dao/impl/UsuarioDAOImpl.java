package br.com.sinapsisenergia.helpdesk.dao.impl;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import org.springframework.stereotype.Repository;

import br.com.sinapsisenergia.helpdesk.dao.UsuarioDAO;
import br.com.sinapsisenergia.helpdesk.entities.Usuario;
import br.com.sinapsisenergia.helpdesk.exceptions.DBException;
import br.com.sinapsisenergia.helpdesk.security.Login;
import br.com.sinapsisenergia.helpdesk.security.pbkdf2.PasswordEncryptor;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO {

	@Override
	public Usuario logar(Login login) throws DBException {

		Usuario usuario = null;
		
		try {
			usuario = em.createQuery("FROM Usuario u WHERE u.email = :pEmail", Usuario.class).setParameter("pEmail", login.getUsername()).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Login ou senha incorreto(s).");
		}
		
		try {
			boolean validPassword = PasswordEncryptor.validatePassword(login.getPassword(), usuario.getPassword());

			if (!validPassword) {
				throw new DBException("Login ou senha incorreto(s).");
			}
			
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			e.printStackTrace();
			throw new DBException("ERRO 2001: Erro interno ao tentar validar a senha. Entre em contato com o suporte da Sinapsis.");
		}
		
		return usuario;
	}

}
