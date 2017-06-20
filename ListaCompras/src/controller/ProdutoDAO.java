package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Produto;
import view.ViewCadastrarProduto;

public class ProdutoDAO extends DAO{
	
	private static List<Produto> listadeProdutos = new ArrayList<Produto>();
	Produto produto = null;
	
	public void Escrever()
	{
		Escrever(Constantes.ProdutoDs, listadeProdutos);
	}
	
	public boolean lerArquivo() throws ClassNotFoundException
	{
		this.listadeProdutos = (List<Produto>) Ler(Constantes.ProdutoDs, listadeProdutos);
		return true;
	}
	
	
	public void criar() {
		ViewCadastrarProduto vCP = new ViewCadastrarProduto();
		this.produto = vCP.showAndGet();
		//if(produto != null)
		try
		{
			System.out.println("\nProduto criado com sucesso");
			ProdutoDAO.listadeProdutos.add(this.produto);
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		Escrever(Constantes.ProdutoDs, listadeProdutos);
	}
	
	public Produto getLastProduto(){
		return this.produto;
	}
	
	public static List<Produto> getListadeProdutos() {
		return listadeProdutos;
	}
	
	public static void setListadeProdutos(List<Produto> listadeProdutos) {
		ProdutoDAO.listadeProdutos = listadeProdutos;
	}
	
	public void listarProdutos(){
		for (Produto produto : listadeProdutos) {
			produto.show();
		}
	}
	
	public boolean OKProduto(String Nome)
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
	public Produto GetProduto(String Nome)
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
	public Produto GetProduto(int id)
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
	
	public void RemoveProduto(int id)
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
