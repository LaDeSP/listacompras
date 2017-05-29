package controller;

import java.util.ArrayList;
import java.util.List;

import módulos.Preco;
import view.ViewCadastrarPreco;


public class PrecoDAO {
	private static List<Preco> listadePrecos = new ArrayList<Preco>();
	Preco preco = null;
	public void criar() {
		ViewCadastrarPreco vCP = new ViewCadastrarPreco();
		this.preco = vCP.showAndSet();
		PrecoDAO.listadePrecos.add(this.preco);
	}
	public Preco getLastPreco(){
		return this.preco;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Preco> getListadePrecos() {
		return listadePrecos;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	
	public static void setListadePrecos(List<Preco> listadePrecos) {
		PrecoDAO.listadePrecos = listadePrecos;
	}
	
	public void listarPrecos(){
		for (Preco preco : listadePrecos) {
			preco.show();
		}
	}

}

	
}