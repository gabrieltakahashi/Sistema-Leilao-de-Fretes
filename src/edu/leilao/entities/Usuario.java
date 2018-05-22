package edu.leilao.entities;

import java.io.Serializable;

import edu.leilao.interfaces.CRUDInterface;

public abstract class Usuario implements Serializable, CRUDInterface {
	private static final long serialVersionUID = -3060235310361876138L;
	private int id;
	private Login login;
	private String endereco;
	private String cep;
	private String telefone;
	private String email;
	private boolean mediador = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMediador() {
		return mediador;
	}

	public void setMediador(boolean mediador) {
		this.mediador = mediador;
	}
}
