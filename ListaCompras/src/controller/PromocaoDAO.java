package controller;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modelo.Cliente;
import modelo.Produto;
import modelo.Promocao;


public class PromocaoDAO extends DAO{

	private static List<Promocao> listadePromocao = new ArrayList<Promocao>();
	private static Promocao promocao = null;
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
		promocao = new Promocao(id_preco, inicio, fim);
		if(promocao != null)
		{
			PromocaoDAO.listadePromocao.add(promocao);
			return true;
		}else {
			return false;
		}
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
	public static Promocao GetPromocao(int x){
		int z = 1;
		for (Promocao promocao : listadePromocao) 
		{
			if(z == x)
			{
				return promocao;
			}
			z++;
		}
		return null;
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
	public static void Renomear_Inicio(Calendar inicio, int id)
	{
		GetPromocaoPorId(id).setInicio(inicio);
	}
	public static void Renomear_Fim(Calendar fim, int id)
	{
		GetPromocaoPorId(id).setFim(fim);
	}
	
}