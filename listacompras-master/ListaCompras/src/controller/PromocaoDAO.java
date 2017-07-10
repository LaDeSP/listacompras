package controller;

import view.ViewPromocoes;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
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
	
	public static void criarPromocao(int id){
		
		if(promocao != null)
		{
			PromocaoDAO.listadePromocao.add(promocao);
			System.out.println("\nPromo�o criada com sucesso");
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
		int z = 1;
		for (Promocao promocao : listadePromocao) 
		{
			if(id == promocao.getId())
			{
				return promocao;
			}
			z++;
		}
		return null;
	}
}