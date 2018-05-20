package edu.leilao.testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.leilao.entities.Login;

public class UC01Login {
	private static Login login;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login = new Login();
		login.setUserName("sistemaleilao");
		login.setSenha("senha");
		login.setMudarSenha(null);
	}

	@Test
	public void CT01UC01GetUsername() {
		String user = login.getUserName();
		assertEquals("sistemaleilao", user);
	}

	@Test
	public void CT02UC01GetSenha() {
		String pass = login.getSenha();
		assertEquals("senha", pass);
	}

	@Test
	public void CT03UC01GetMudarSenha() {
		String np = login.getMudarSenha();
		assertEquals(null, np);
	}

	@Test
	public void CT04UC01AdicionarNovoUsuario_com_sucesso() {
		String user = "sistemaleilao";
		String pass = "senha";
		assertTrue(login.adicionarNovoUsuario(user, pass));
	}
	
	@Test(expected=RuntimeException.class)
	public void CT05UC01AdicionarNovoUsuario_dados_invalidos() {
		String user = "";
		String pass = "senha";
		assertFalse(login.adicionarNovoUsuario(user, pass));
	}
	
	@Test(expected=RuntimeException.class)
	public void CT06UC01AdicionarNovoUsuario_dados_invalidos() {
		String user = "sistemaleilao";
		String pass = "";
		assertFalse(login.adicionarNovoUsuario(user, pass));
	}
}
