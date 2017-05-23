package controller;

import java.util.ArrayList;
import java.util.List;

import módulos.Produto;
import view.ViewCadastrarProduto;

public class ProdutoDAO {

	/**
	 * @param args
	 */
	private static List<Produto> listadeProdutos = new ArrayList<Produto>();
	Produto produto = null;
	public void criar() {
		ViewCadastrarProduto vCP = new ViewCadastrarProduto();
		this.produto = vCP.showAndGet();
		ProdutoDAO.listadeProdutos.add(this.produto);
	}
	public Produto getLastProduto(){
		return this.produto;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Produto> getListadeProdutos() {
		return listadeProdutos;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	public static void setListadeProdutos(List<Produto> listadeProdutos) {
		ProdutoDAO.listadeProdutos = listadeProdutos;
	}
	
	public void listarProdutos(){
		for (Produto produto : listadeProdutos) {
			produto.show();
		}
	}

}
