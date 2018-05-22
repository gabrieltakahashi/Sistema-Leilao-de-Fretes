package edu.leilao.beans;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;

import edu.leilao.entities.Login;
import edu.leilao.login.dao.LoginImplements;

@ManagedBean
public class LoginBean {
	private Login login = new Login();
	private LoginImplements login_db = new LoginImplements();

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public boolean adicionarNovoUsuario() throws SQLException { // Esse método pode ser reutilizado...

		if (!(login.getUserName() == "" & login.getSenha() == "")) {
			System.out.println("Adicionando...");
			login_db.adicionarNovoUsuario(login);
			return true;
		} else {
		System.out.println("Usuário ou Senha inválido." + "\nPreencha Novamente.");
		return false;
		}
	}

	public boolean trocarSenha() throws SQLException {
		if (login.validarNovaSenha()) {
			login_db.trocarSenha(login);
			System.out.println("Trocando senha...");
			return true;
		}
		System.out.println("A senha não pode ser trocada...");
		return false;
	}

}
