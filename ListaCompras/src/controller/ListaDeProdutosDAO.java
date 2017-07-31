package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.ListaDeProdutos;
import modelo.Produto;

public class ListaDeProdutosDAO extends DAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private static List<ListaDeProdutos> listadepromocao = new ArrayList<ListaDeProdutos>();
	static ListaDeProdutos listadeprodutos = null;
	
	
	public static void Escrever()
	{
		Escrever(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public static void lerArquivo()
	{
		listadepromocao = (List<ListaDeProdutos>) Ler(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public static boolean Inserir(Produto produto, int id)
	{
		listadeprodutos = new ListaDeProdutos(produto, id);
		if(listadeprodutos != null)
		{
			ListaDeProdutosDAO.listadepromocao.add(listadeprodutos);
			System.out.println("\nProduto inserido com sucesso");
			return true;
		}
		return false;
	}
	
	public static void Listar(int id)
	{
		//for(Cliente cliente : listadeclientes)
		for(ListaDeProdutos listadeprodutos : listadepromocao)
		{
			if(listadeprodutos.getId_Cliente() == id)
			{
				System.out.print("   ");
				listadeprodutos.show();
			}
		}
		System.out.print("\n");
	}
	public static boolean Remover(int id_Produto, int id_Cliente)
	{
		//for(Cliente cliente : listadeclientes)
		for(ListaDeProdutos listadeprodutos : listadepromocao)
		{
			if(listadeprodutos.getProduto().getId() == id_Produto && listadeprodutos.getId_Cliente() == id_Cliente)
			{
				listadepromocao.remove(listadeprodutos);
				return true;
			}
		}
		return false;
	}
}
