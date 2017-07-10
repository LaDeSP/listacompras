package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modelo.Preco;


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
	
	
	public static void criarPreco(int id_produto, boolean status, 
			int id_supermercado, int id_cliente, double precoProduto) {
		preco = new Preco(id_produto, status, id_supermercado, id_cliente, precoProduto);
		if(preco != null)
		{
			System.out.println("\nPre�o criado com sucesso!!\n");
			PrecoDAO.listadePrecos.add(preco);
		}
	}
	public static void criarPromocao(int id_produto, boolean status, int id_supermercado, 
			int id_cliente, double precoProduto, Calendar inicio, Calendar fim) {
		preco = new Preco(id_produto, status, id_supermercado, id_cliente, precoProduto);
		if(preco != null)
		{
			PromocaoDAO.criarPromocao(preco.getId(), inicio, fim);
			System.out.println("\nPromo��o criado com sucesso!!\n");
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