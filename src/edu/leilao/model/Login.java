package edu.leilao.model;


public class Login {
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
	
	public void criarLogin(String u, String s) {
		//criar mecanismo de pesquisa no BD para garantir que o login não existe
		setUserName(u);
		setSenha(s);
		System.out.println("O usuario é : " +userName
							+"\nE a senha é : " +senha);
	}
}
