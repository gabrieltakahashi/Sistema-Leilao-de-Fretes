package edu.leilao.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.leilao.connection.ConnectionFactory;
import edu.leilao.entities.Login;

public class LoginImplements {

	public void adicionarNovoUsuario(Login l) throws SQLException {
		Connection connection = ConnectionFactory.getInstancia().getConnection();
		PreparedStatement insert_login_stm;
		final String cmd_adicionar_login = ("INSERT INTO login (username, senha ) VALUES (?, ?)");
		
		insert_login_stm = connection.prepareStatement(cmd_adicionar_login);
		insert_login_stm.setString(1, l.getUserName());
		insert_login_stm.setString(2, l.getSenha());
		insert_login_stm.executeUpdate();
		System.out.println("Usuário cadastrado.");
	}

	public void trocarSenha(Login l) throws SQLException {
		Connection connection = ConnectionFactory.getInstancia().getConnection();
		PreparedStatement update_login_stm;
		final String cmd_update_login = ("UPDATE LOGIN SET SENHA=? WHERE USERNAME=? AND SENHA=?"); //Exclusivo para MySQL

		update_login_stm = connection.prepareStatement(cmd_update_login);
		update_login_stm.setString(1, l.getTrocarSenha());
		update_login_stm.setString(2, l.getUserName());
		update_login_stm.setString(3, l.getSenha());
		update_login_stm.executeUpdate();
		System.out.println("Usuario : " +l.getUserName());
	}

}
