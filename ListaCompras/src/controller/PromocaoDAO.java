package controller;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Produto;
import modelo.Promocao;


public class PromocaoDAO extends DAO{

	private static List<Promocao> listadePromocao = new ArrayList<Promocao>();
	private static Promocao promocao = null;
	static Scanner ler = new Scanner(System.in);
	
	public PromocaoDAO(){
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.PromocaoDs, listadePromocao);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadePromocao = (List<Promocao>) Ler(Constantes.PromocaoDs, listadePromocao);
		return true;
	}
	
	public static boolean criar(int id_preco, Calendar inicio, Calendar fim){

		//verificar se o id de preço existe ou nulo
		double id= id_preco;
		
		if(id==0 || PrecoDAO.OKPreco(id)) {
			System.out.println("Id_preco nulo ou inexistente!");
			return false;
		}
				
		promocao = new Promocao(id_preco, inicio, fim);
		
		if(promocao != null)
		{
			PromocaoDAO.listadePromocao.add(promocao);
			return true;
		}
		
			return false;
		
	}
	
	public static Promocao getLastPromocao(){
		return promocao;
	}
	
	public static List<Promocao> getListadePromocao() {
		return listadePromocao;
	}
	
	public static void setListadePromocao(List<Promocao> listadePromocao) {
		PromocaoDAO.listadePromocao = listadePromocao;
	}
	
	public static void listar(){
		for (Promocao promocao : listadePromocao) {
			promocao.show();
		}
		System.out.print("\n");
	}

	public static Promocao GetPromocaoPorId(int id){

		for (Promocao promocao : listadePromocao) 
		{
			if(id == promocao.getId())
			{
				return promocao;
			}
		
		}
		return null;
	}
	public static boolean RemovePromocao(int id)
	{
		for(Promocao promocao : listadePromocao)
		{
			if(id == promocao.getId())
			{
				PromocaoDAO.listadePromocao.remove(promocao);
				return true;
			}
		}
		return false;
	}
	public static boolean Renomear_Inicio(Calendar inicio, int id)
	{
		//verficar se o id existe
		
		if(id!=0 && GetPromocaoPorId(id)!= null) {
		GetPromocaoPorId(id).setInicio(inicio);
		return true;
		}
		return false;
	}
	public static boolean Renomear_Fim(Calendar fim, int id)
	{
		if(id!=0 && GetPromocaoPorId(id)!= null) {
		GetPromocaoPorId(id).setFim(fim);
		return true;
		}
		return false;
	}
	
	public static void Incrementar()
	{
		for(Promocao promocao : listadePromocao)
		{
			promocao.Incrementar();
		}
	}
	
}