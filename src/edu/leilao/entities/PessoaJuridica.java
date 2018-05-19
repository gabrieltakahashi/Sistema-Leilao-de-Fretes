package edu.leilao.entities;

public class PessoaJuridica extends Usuario{
	private String cnpj;
	private String razaoSocial;
	private String cartaoCredito;


	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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
