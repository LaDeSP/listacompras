package controller;

import view.ViewCadastrarPromocao;
import módulos.Promocao;

public class PromocaoDAO {

	/**
	 * @param args
	 */
	Promocao promocao = null;
	
	public void criarPromocao(){
		ViewCadastrarPromocao vcap = new ViewCadastrarPromocao();
		this.promocao=vcap.criar();
	}
	
}