package edu.leilao.entities;

import java.io.Serializable;
import java.util.Date;

import edu.leilao.interfaces.CRUDInterface;

public class Leilao implements Serializable, CRUDInterface {
	private static final long serialVersionUID = 6136750272563168696L;
	private int codigoLeilao;
	private Mercadoria mercadoria;
	private Destinatario destinatario;
	private Date dataAbertura;
	private Date dataEncerramento;
	private boolean aceito;
	private boolean ativo;

	public int getCodigoLeilao() {
		return codigoLeilao;
	}

	public void setCodigoLeilao(int codigoLeilao) {
		this.codigoLeilao = codigoLeilao;
	}

	public Mercadoria getMercadoria() {
		return mercadoria;
	}

	public void setMercadoria(Mercadoria mercadoria) {
		this.mercadoria = mercadoria;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public boolean isAceito() {
		return aceito;
	}

	public void setAceito(boolean aceito) {
		this.aceito = aceito;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void iniciarLeilao() {

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
