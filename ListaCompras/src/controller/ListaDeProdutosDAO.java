package controller;

import java.io.IOException;
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
	ListaDeProdutos listadeprodutos = null;
	
	public ListaDeProdutosDAO(){
		id = count.incrementAndGet();
	}
	
	public void Escrever()
	{
		Escrever(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public void lerArquivo()
	{
		listadepromocao = (List<ListaDeProdutos>) Ler(Constantes.ListaDeProdutoDs, listadepromocao);
	}
	
	public void Inserir(Promocao promocao, int id)
	{
		listadeprodutos = new ListaDeProdutos(promocao, id);
		//if(listadeprodutos != null)
		try
		{
			ListaDeProdutosDAO.listadepromocao.add(listadeprodutos);
			System.out.println("\nProduto inserido com sucesso");
		}
		catch(IOException e){
			e.printStackTrace();	
		}
	}
	
	public void Listar(int id)
	{
		//for(Cliente cliente : listadeclientes)
		for(ListaDeProdutos listadeprodutos : listadepromocao)
		{
			if(listadeprodutos.getId_Cliente() == this.id)
			{
				System.out.print("   ");
				listadeprodutos.show();
			}
		}
		System.out.print("\n");
	}
}
