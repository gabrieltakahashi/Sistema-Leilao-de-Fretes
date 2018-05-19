package edu.leilao.entities;

public class Denuncia {
	private int id;
	private Usuario acusado;
	private Usuario delator;

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Usuario getAcusado() {
		return acusado;
	}
	
	public void setAcusado(Usuario acusado) {
		this.acusado = acusado;
	}
	
	public Usuario getDelator() {
		return delator;
	}
	
	public void setDelator(Usuario delator) {
		this.delator = delator;
	}
	
}
