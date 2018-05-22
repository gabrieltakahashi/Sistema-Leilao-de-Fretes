package edu.leilao.entities;

import java.util.Date;

public class PessoaFisica extends Usuario {
	private static final long serialVersionUID = 6716386866305592317L;
	private String cpf;
	private String nome;
	private Date dataNascimento;
	private String cartaoCredito;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
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
