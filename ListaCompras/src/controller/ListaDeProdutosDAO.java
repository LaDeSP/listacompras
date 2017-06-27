package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import modelo.ListaDeProdutos;
import modelo.Promocao;

public class ListaDeProdutosDAO extends DAO implements Serializable{
	int id;
	private static final AtomicInteger count = new AtomicInteger(0);
	private static List<ListaDeProdutos> listadepromocao = new ArrayList<ListaDeProdutos>();
	PromocaoDAO promocaoDAO = null;
	static ListaDeProdutos listadeprodutos = null;
	
	public ListaDeProdutosDAO(){
		id = count.incrementAndGet();
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public static void lerArquivo()
	{
		listadepromocao = (List<ListaDeProdutos>) Ler(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public static void Inserir(Promocao promocao, int id)
	{
		listadeprodutos = new ListaDeProdutos(promocao, id);
		if(listadeprodutos != null)
		{
			ListaDeProdutosDAO.listadepromocao.add(listadeprodutos);
			System.out.println("\nProduto inserido com sucesso");
		}
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
}
