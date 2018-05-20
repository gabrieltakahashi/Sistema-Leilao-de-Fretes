package edu.leilao.entities;

import java.io.Serializable;
import java.sql.SQLException;

import edu.leilao.login.dao.LoginImplements;

public class Login implements Serializable {
	private static final long serialVersionUID = 3267361303846966907L;
	private String userName = "";
	private String senha = "";
	private String mudarSenha = null;
	private static LoginImplements login_db;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMudarSenha() {
		return mudarSenha;
	}

	public void setMudarSenha(String mudarSenha) {
		this.mudarSenha = mudarSenha;
	}

	public boolean adicionarNovoUsuario(String u, String p) {
		if (!(u == "" & p == "")) {
			try {
				login_db.adicionarNovoUsuario();
				System.out.println("Novo login criado.");
			} catch (SQLException e) {
				System.out.println("SQL Exception");
				e.printStackTrace();
			}
			return true;
		} else {
			System.out.println("Usuário ou Senha inválido." + "\nPreencha Novamente.");
			return false;
		}
	}

	public void editarSenha() {

	}

	public void pesquisarSenha() {

	}
}
