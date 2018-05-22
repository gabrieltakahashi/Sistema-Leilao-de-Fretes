package edu.leilao.entities;

import java.io.Serializable;

import edu.leilao.interfaces.CRUDInterface;

public class Destinatario implements Serializable, CRUDInterface{
	private static final long serialVersionUID = 5752008388687868452L;
	private int id;
	private String destinatario;
	private String endereco;
	private String cep;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
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

	@Override
	public boolean cadastrar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
}
