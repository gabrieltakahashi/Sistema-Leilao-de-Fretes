package edu.leilao.login.dao;

import java.sql.SQLException;

import edu.leilao.entities.Login;

public interface LoginDAO {

	void adicionarNovoUsuario(Login l) throws SQLException;

	void editarSenha(Login l) throws SQLException;
	
	void pesquisarSenha(Login l) throws SQLException;
}
