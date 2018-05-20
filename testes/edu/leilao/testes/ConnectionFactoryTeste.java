package edu.leilao.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import edu.leilao.connection.ConnectionFactory;

public class ConnectionFactoryTeste {
	ConnectionFactory instancia = ConnectionFactory.getInstancia();
	Connection expected = instancia.getConnection();
	
	@Test
	public void CT01GetInstancia_instancia_nula() {
		assertNotNull(ConnectionFactory.getInstancia());
	}

	@Test
	public void CT02GetInstancia_instancia_existe() {
		assertNotNull(instancia);
	}
	
	@Test
	public void CT03GetConnection_com_sucesso() {
		ConnectionFactory cf = ConnectionFactory.getInstancia();
		Connection actual = cf.getConnection();
		
		assertEquals(expected, actual);
	}
	
	@Test(expected=SQLException.class)
	public void CT04CatchSQLException() {
	
	}
	
	@Test(expected=ClassNotFoundException.class)
	public void CT05CatchClassNotFoundException() {

	}
}
