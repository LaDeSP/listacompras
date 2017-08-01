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
	
	
	public static boolean criarPreco(int id_produto, boolean status, 
			int id_supermercado, int id_cliente, double precoProduto) {
		preco = new Preco(id_produto, status, id_supermercado, id_cliente, precoProduto);
		if(preco != null)
		{
			PrecoDAO.listadePrecos.add(preco);
			return true;
		}else
			return false;
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
	
	public static boolean renomear_preco(int id, double precoProduto) {
		for(Preco preco: listadePrecos) {
			if(preco.getId()==id) {
				preco.setPrecoProduto(precoProduto);
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

}