package edu.leilao.entities;

import java.util.Collection;

public class Averiguacao {
	private int id;
	private Denuncia denuncia;
	private Collection<?> situacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Denuncia getDenuncia() {
		return denuncia;
	}
	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}
	public Collection<?> getSituacao() {
		return situacao;
	}
	public void setSituacao(Collection<?> situacao) {
		this.situacao = situacao;
	}
	
	
}
