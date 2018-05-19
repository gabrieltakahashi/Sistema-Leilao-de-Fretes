package edu.leilao.entities;

import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = 3267361303846966907L;
	private String userName;
	private String senha;
	
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
}
