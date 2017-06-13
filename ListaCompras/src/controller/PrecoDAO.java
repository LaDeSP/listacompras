package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Preco;
import view.ViewCadastrarPreco;


public class PrecoDAO {
	private static List<Preco> listadePrecos = new ArrayList<Preco>();
	Preco preco = null;
	public void criarPreco(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		ViewCadastrarPreco vCP = new ViewCadastrarPreco();
		this.preco = vCP.showAndSet(produtoDAO, id, supermercadoDAO);
		if(preco != null)
		{
			System.out.println("\nPreço criado com sucesso!!\n");
			PrecoDAO.listadePrecos.add(this.preco);
		}
	}
	public void criarPromocao(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		ViewCadastrarPreco vCP = new ViewCadastrarPreco();
		this.preco = vCP.showAndSetPromocao(produtoDAO, id, supermercadoDAO);
		if(preco != null)
		{
			System.out.println("\nPromoção criado com sucesso!!\n");
			PrecoDAO.listadePrecos.add(this.preco);
		}
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
	
	public void listar(){
		for (Preco preco : listadePrecos) {
			preco.show();
		}
	}
	
	public boolean OKPreco(Double Preco)
	{
		for(Preco preco : listadePrecos)
		{
			if(Preco.equals(preco.getPrecoProduto()))
			{
				return true;
			}
		}
		return false;
		
	}
	public Preco GetPreco(Double Preco)
	{
		for(Preco preco : listadePrecos)
		{
			if(Preco.equals(preco.getPrecoProduto()))
			{
				return preco;
			}
		}
		return null;
		
	}

}