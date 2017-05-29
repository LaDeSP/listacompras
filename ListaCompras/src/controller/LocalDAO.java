package controller;

import java.util.ArrayList;
import java.util.List;

import módulos.Local;
import view.ViewCadastrarLocal;


public class LocalDAO {
	private static List<Local> listadeLocal = new ArrayList<Local>();
	Local local = null;
	public void criar() {
		ViewCadastrarLocal vCP = new ViewCadastrarLocal();
		this.local = vCP.showAndSet();
		LocalDAO.listadeLocal.add(this.local);
	}
	public Local getLastLocal(){
		return this.local;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Local> getListadeLocal() {
		return listadeLocal;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	
	public static void setListadeLocal(List<Local> listadeLocal) {
		LocalDAO.listadeLocal = listadeLocal;
	}
	
	public void listarLocal(){
		for (Local local : listadeLocal) {
			local.show();
		}
	}

}

	
}
