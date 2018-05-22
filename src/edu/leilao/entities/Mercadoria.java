package edu.leilao.entities;

import java.io.Serializable;

import edu.leilao.interfaces.CRUDInterface;

public class Mercadoria implements Serializable, CRUDInterface {
	private static final long serialVersionUID = 2130444279253103265L;
	private int id;
	private double largura;
	private double comprimento;
	private double profundidade;
	private double peso;
	private int quantidade;
	private boolean fragil;
	private String observacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
