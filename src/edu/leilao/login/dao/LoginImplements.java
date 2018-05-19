package edu.leilao.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.leilao.connection.ConnectionFactory;
import edu.leilao.entities.Login;

public class LoginImplements implements LoginDAO {

	@Override
	public void adicionarNovoUsuario(Login l) throws SQLException {
		Connection connection = ConnectionFactory.getInstancia().getConnection();
		PreparedStatement insert_login_stm;
		final String cmd_adicionar_login = ("INSERT INTO LOGIN (username, senha ) VALUES (?, ?)");

		insert_login_stm = connection.prepareStatement(cmd_adicionar_login);
		insert_login_stm.setString(1, l.getUserName());
		insert_login_stm.setString(2, l.getSenha());
	}

	@Override
	public void editarSenha(Login l) throws SQLException {
		Connection connection = ConnectionFactory.getInstancia().getConnection();
		PreparedStatement update_login_stm;
		final String cmd_update_login = ("UPDATE TABLE LOGIN SET SENHA=? WHERE USERNAME=? AND SENHA=?");

		update_login_stm = connection.prepareStatement(cmd_update_login);
		update_login_stm.setString(1, l.getMudarSenha());
		update_login_stm.setString(2, l.getUserName());
		update_login_stm.setString(3, l.getSenha());
	}

	@Override
	public void pesquisarSenha(Login l) throws SQLException {
		Connection connection = ConnectionFactory.getInstancia().getConnection();
		PreparedStatement select_login_stm;
		final String cmd_select_login = ("SELECT senha FROM LOGIN WHERE username=?");

		select_login_stm = connection.prepareStatement(cmd_select_login);
		select_login_stm.setString(1, l.getUserName());

	}
}
