package testes;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.sinapsisenergia.helpdesk.entities.Departamento;
import br.com.sinapsisenergia.helpdesk.entities.Perfil;
import br.com.sinapsisenergia.helpdesk.entities.TipoPerfil;
import br.com.sinapsisenergia.helpdesk.entities.Usuario;
import br.com.sinapsisenergia.helpdesk.security.pbkdf2.PasswordEncryptor;

public class Teste {

	public static void main(String[] args) {
		
		String password = null;
		try {
			password = PasswordEncryptor.generateStorngPasswordHash("12345");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		
//		Usuario u = new Usuario(perfil, new Departamento("DESENVOLVIMENTO"), "João Carlos Costa Lopes", password, "joao.lopes@sinapsisenergia.com",
//				null, null);

		System.out.println(password);
	}
	
}
