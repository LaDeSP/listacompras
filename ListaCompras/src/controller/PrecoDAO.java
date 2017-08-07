package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Preco;
import view.ViewPromocoes;


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
	
	
	public static Preco criarPreco(int id_produto, boolean status, 
			int id_supermercado, int id_cliente, double precoProduto) {
		
		preco = new Preco(id_produto, status, id_supermercado, id_cliente, precoProduto);
		if(preco != null)
		{
			PrecoDAO.listadePrecos.add(preco);
			return preco;
		}else
			return null;
	}
	public static boolean criarPromocao(int id_produto, boolean status, 
			int id_supermercado, int id_cliente, double precoProduto) {
		preco = new Preco(id_produto, status, id_supermercado, id_cliente, precoProduto);
		if(preco != null)
		{
			PrecoDAO.listadePrecos.add(preco);
			ViewPromocoes.InicioCriar(preco.getId());
			return true;
		}else
			return false;
	}
	
	public static boolean renomear_preco(int id_supermercado, int id_produto, double preco) {
		for(Preco p: listadePrecos) {
			if(p.getId_supermercado()==id_supermercado && p.getId_produto()==id_produto) {
				p.setPrecoProduto(preco);
				return true;
			}
		}
		return false;	
	}
	public static boolean remover(int id_supermercado, int id_produto) {
		
		for(Preco p : listadePrecos) {
			if(p.getId_supermercado()==id_supermercado && p.getId_produto()==id_produto) {
				PrecoDAO.listadePrecos.remove(p);
				return true;
			}
		}
		
		
		return false;
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
	
	public static void Incrementar()
	{
		for(Preco preco : listadePrecos)
		{
			preco.Incrementar();
		}
	}
}