package edu.leilao.entities;

import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = 3267361303846966907L;
	private String userName = "";
	private String senha = "";
	private String trocarSenha = null;
	private String confirmaNovaSenha = null;

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

	public String getTrocarSenha() {
		return trocarSenha;
	}

	public void setTrocarSenha(String trocarSenha) {
		this.trocarSenha = trocarSenha;
	}

	public String getConfirmaNovaSenha() {
		return confirmaNovaSenha;
	}

	public void setConfirmaNovaSenha(String confirmaNovaSenha) {
		this.confirmaNovaSenha = confirmaNovaSenha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean validarNovaSenha() {
		if (trocarSenha == confirmaNovaSenha) {
			return true;
		} else {
		return false;
		}
	}

	public void limpar() {
		userName = "";
		senha = "";
		trocarSenha = "";
	}
}
