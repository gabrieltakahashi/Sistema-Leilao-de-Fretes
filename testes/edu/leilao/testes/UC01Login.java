package edu.leilao.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.leilao.beans.LoginBean;
import edu.leilao.entities.Login;

public class UC01Login {
	private static Login login = new Login();
	private static LoginBean lb = new LoginBean();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login.setUserName("sistemaleilao");
		login.setSenha("senha");
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
		String new_pass = login.getTrocarSenha();
		assertEquals(null, new_pass);
	}

	@Test
	public void CT04UC01AdicionarNovoUsuario_com_sucesso() throws SQLException {
		assertTrue(lb.adicionarNovoUsuario());
	}

	@Test
	public void CT05UC01AdicionarNovoUsuario_em_branco() throws SQLException {
		Login login_em_branco = new Login();
		login_em_branco.setUserName("");
		login_em_branco.setSenha("");
		assertFalse(lb.adicionarNovoUsuario());
	}
	
	@Test
	public void TrocarSenha_com_sucesso() throws SQLException {
		login.setTrocarSenha("nova");
		login.setConfirmaNovaSenha("nova");
		
		assertTrue(lb.trocarSenha());
	}
	
	@Test
	public void TrocarSenha_dados_invalidos() throws SQLException {
		login.setTrocarSenha("nova");
		login.setConfirmaNovaSenha("diferente");
		
		assertFalse(lb.trocarSenha());
	}

}
