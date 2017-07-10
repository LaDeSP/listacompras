package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Supermercado;


public class SupermercadoDAO extends DAO{
	private static List<Supermercado> listadeSupermercados = new ArrayList<Supermercado>();
	static Supermercado supermercado = null;
	private static Scanner leitura;
	
	
	public static boolean criar(String nome, int id_local) {
		
		//verificar o NOME
		if(OKSupermercado(nome)){
			System.out.print("Supermercado existente");
			return false;
			
		}
		//VERIFICAR O ID_local
		if(LocalDAO.OKId(id_local)==false){
			//vai ter que adicionar um local
			return false;
			
		}	
		
		
			Supermercado supermercado = new Supermercado(nome, id_local);
			SupermercadoDAO.listadeSupermercados.add(supermercado);
			System.out.println("\nSupermercado criado com sucesso");
		return true;

			
	}
	public static boolean EscreverArquivo()
	{
		Escrever(Constantes.SupermercadoDs, listadeSupermercados);
		return true;
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadeSupermercados = (List<Supermercado>) Ler(Constantes.SupermercadoDs, listadeSupermercados);
		return true;
	}
	
	public static Supermercado getLastSupermercado(){
		return supermercado;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Supermercado> getListadeSupermercados() {
		return listadeSupermercados;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	
	public static void setListadeSupermercados(List<Supermercado> listadeSupermercados) {
		SupermercadoDAO.listadeSupermercados = listadeSupermercados;
	}
	
	public static void listar(){
		for (Supermercado supermercado : listadeSupermercados) {
			supermercado.show();
		}
	}
	
	public static boolean OKSupermercado(String Nome)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(Nome.equals(supermercado.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	public static Supermercado GetSupermercado(String Nome)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(Nome.equals(supermercado.getNome()))
			{
				return supermercado;
			}
		}
		return null;
		
	}
	public static Supermercado GetSupermercado(int id)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(id == supermercado.getId())
			{
				return supermercado;
			}
		}
		return null;
		
	}
	public static void RemoveSupermercado(int id)
	{
		System.out.print("Entrou\n");
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(id == supermercado.getId())
			{
				SupermercadoDAO.listadeSupermercados.remove(supermercado);
				return ;
			}
		}
	}
	

}
