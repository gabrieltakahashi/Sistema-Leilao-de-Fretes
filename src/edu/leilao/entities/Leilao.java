package edu.leilao.entities;

import java.util.Date;

public class Leilao {
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
	
	public void controladorTimer() {
		
	}
	
	public void cadastrarLeilao() {
		
	}
	
	public void pesquisarLeilao() {
		
	}
	
	public void editarLeilao() {
		
	}
	
	public void cancelarLeilao() {
		
	}
	
	public void iniciarLeilao() {
		
	}
}
