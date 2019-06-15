package test;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import criptografia.CryptoAES;
import model.Usuario;
import service.UsuarioService;

public class TesteUsuario {	
	@Test
	public void usuarioServicePassTest() {
		Usuario u = new Usuario();
		u.setUsername("mayara@gmail.com");
		u.setPassword("senha");
		UsuarioService service = new UsuarioService();
		Assert.assertTrue(service.validar(u));

	}
	
}
