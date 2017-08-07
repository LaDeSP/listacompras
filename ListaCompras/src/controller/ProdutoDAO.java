package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.ListaDeProdutos;
import modelo.Produto;

public class ProdutoDAO extends DAO{
	
	private static List<Produto> listadeProdutos = new ArrayList<Produto>();
	static Produto produto = null;
	
	public static void Escrever()
	{
		Escrever(Constantes.ProdutoDs, listadeProdutos);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadeProdutos = (List<Produto>) Ler(Constantes.ProdutoDs, listadeProdutos);
		return true;
	}
	
	
	public static boolean criar(String nome, String marca, int id_Cliente) {
		
		//verificar se os dados inseridos estão corretos
		
		Produto produto = new Produto(nome, marca, id_Cliente);
		
		if(produto != null)
		{
			ProdutoDAO.listadeProdutos.add(produto);
			Escrever(Constantes.ProdutoDs, listadeProdutos);
			HistoricoClienteDAO.Criar(produto.getId(), id_Cliente);
			return true;
		}
		
		return false;
		
	}
	
	public static Produto getLastProduto(){
		return produto;
	}
	
	public static List<Produto> getListadeProdutos() {
		return listadeProdutos;
	}
	
	public static void setListadeProdutos(List<Produto> listadeProdutos) {
		ProdutoDAO.listadeProdutos = listadeProdutos;
	}
	
	public static void listarProdutos(){
		for (Produto produto : listadeProdutos) {
			produto.show();
		}
	}
	
	public static boolean OKProduto(int id)
	{
		for(Produto produto : listadeProdutos)
		{
			if(produto.getId() == id)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean OKProduto(String Nome, String marca)
	{
		for(Produto produto : listadeProdutos)
		{
			if(Nome.equals(produto.getNome()) && marca.equals(produto.getMarca()))
			{
				return true;
			}
		}
		return false;
		
	}
	public static boolean OKProdutoNome(String Nome)
	{
		for(Produto produto : listadeProdutos)
		{
			if(Nome.equals(produto.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	
	public static Produto GetProduto(String Nome)
	{
		for(Produto produto : listadeProdutos)
		{
			if(Nome.equals(produto.getNome()))
			{
				return produto;
			}
		}
		return null;
		
	}
	public static Produto GetProduto(int id)
	{
		for(Produto produto : listadeProdutos)
		{
			if(id == produto.getId())
			{
				return produto;
			}
		}
		return null;
		
	}
	
	public static boolean RemoveProduto(int id)
	{
		for(Produto produto : listadeProdutos)
		{
			if(id == produto.getId())
			{
				ProdutoDAO.listadeProdutos.remove(produto);
				return true;
			}
		}
		return false;
	}
	
	public static void AtualizarID()
	{
		for(Produto produto : listadeProdutos)
		{
			produto.Incrementar();
		}
	}

}
