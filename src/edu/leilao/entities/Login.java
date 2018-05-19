package edu.leilao.entities;

import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = 3267361303846966907L;
	private String userName = "";
	private String senha = "";
	private String mudarSenha = null;

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

	public void adicionarNovoUsuario(String u, String p) {
		if (!(u == "" && p == "")) {
			setUserName(u);
			setSenha(p);
		} else {
			System.out.println("Usuário ou Senha inválido." + "\nPreencha Novamente.");
			throw new RuntimeException("Usuário ou Senha inválido." + "\nPreencha Novamente.");
		}
	}

	public void editarSenha() {

	}

	public void pesquisarSenha() {

	}
}
