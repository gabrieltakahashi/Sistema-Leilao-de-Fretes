package edu.leilao.entities;

import java.io.Serializable;

import edu.leilao.interfaces.CRUDInterface;

public class Denuncia implements Serializable, CRUDInterface{
	private static final long serialVersionUID = -4550490990671109437L;
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
