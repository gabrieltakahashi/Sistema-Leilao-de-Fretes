package edu.leilao.entities;

public class Mediador extends Usuario {
	private static final long serialVersionUID = -2787050233195428310L;

	public void visaoModerador() {
		this.setMediador(true);
	}

	public void visualizarDenuncias() {

	}

	public void cancelarLeilao() {

	}

	public void bloquarUsuario() {

	}

	public void banirUsuario() {

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
