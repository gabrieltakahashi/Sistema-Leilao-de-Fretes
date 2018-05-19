package edu.leilao.entities;

import java.util.Date;

public class PessoaFisica extends Usuario{
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
	public void cadastrarUsuario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void editarUsuario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pesquisarUsuario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluirUsuario() {
		// TODO Auto-generated method stub
		
	}
}
