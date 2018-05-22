package edu.leilao.entities;

public class PessoaJuridica extends Usuario {
	private static final long serialVersionUID = -4230631221183394093L;
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
