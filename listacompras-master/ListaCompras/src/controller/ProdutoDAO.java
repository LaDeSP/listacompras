package controller;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public static boolean criar(String nome, String marca, float preco) {
		
		//verificar se os dados inseridos estão corretos
		
		Produto produto = new Produto(nome, marca, preco);
		
		if(produto != null)
		{
			ProdutoDAO.listadeProdutos.add(produto);
			Escrever(Constantes.ProdutoDs, listadeProdutos);
			return true;
		} else {
			return false;
		}
		
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
	
	public static boolean OKProduto(String Nome)
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
	
	public static void RemoveProduto(int id)
	{
		for(Produto produto : listadeProdutos)
		{
			if(id == produto.getId())
			{
				ProdutoDAO.listadeProdutos.remove(produto);
				return ;
			}
		}
		
	}

}
