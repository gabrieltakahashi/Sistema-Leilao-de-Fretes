package edu.leilao.entities;

import java.util.Collection;
import java.util.Date;

public class Frete {
	private int id;
	private Date dataResolucao;
	private Leilao leilao;
	private Usuario usuario;
	private Collection<?> situacaoFrete;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataResolucao() {
		return dataResolucao;
	}
	public void setDataResolucao(Date dataResolucao) {
		this.dataResolucao = dataResolucao;
	}
	public Leilao getLeilao() {
		return leilao;
	}
	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Collection<?> getSituacaoFrete() {
		return situacaoFrete;
	}
	public void setSituacaoFrete(Collection<?> situacaoFrete) {
		this.situacaoFrete = situacaoFrete;
	}
	
	
}
