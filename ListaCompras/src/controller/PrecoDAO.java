package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Preco;
import view.ViewCadastrarPreco;


public class PrecoDAO extends DAO{
	private static List<Preco> listadePrecos = new ArrayList<Preco>();
	static Preco preco = null;
	
	public static void Escrever()
	{
		Escrever(Constantes.PrecoDs, listadePrecos);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadePrecos = (List<Preco>) Ler(Constantes.PrecoDs, listadePrecos);
		return true;
	}
	
	
	public static void criarPreco(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		ViewCadastrarPreco vCP = new ViewCadastrarPreco();
		preco = vCP.showAndSet(produtoDAO, id, supermercadoDAO);
		if(preco != null)
		{
			System.out.println("\nPreço criado com sucesso!!\n");
			PrecoDAO.listadePrecos.add(preco);
		}
	}
	public static void criarPromocao(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		ViewCadastrarPreco vCP = new ViewCadastrarPreco();
		preco = vCP.showAndSetPromocao(produtoDAO, id, supermercadoDAO);
		if(preco != null)
		{
			System.out.println("\nPromoção criado com sucesso!!\n");
			PrecoDAO.listadePrecos.add(preco);
		}
	}
	
	public static Preco getLastPreco(){
		return preco;
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
	
	public static void listar(){
		for (Preco preco : listadePrecos) {
			preco.show();
		}
	}
	
	public static boolean OKPreco(Double Preco)
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
	public static Preco GetPreco(Double Preco)
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