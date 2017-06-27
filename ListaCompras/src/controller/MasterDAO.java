package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Master;
import view.ViewCadastrarMaster;

public class MasterDAO extends DAO{
	
	private static Master master = null;
	private static List<Master> listademasters = new ArrayList<Master>();
	
	public MasterDAO()
	{
		
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.MasterDs, listademasters);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listademasters = (List<Master>) Ler(Constantes.MasterDs, listademasters);
		return true;
	}
	
	public static void criarPrimeiro()
	{
		ViewCadastrarMaster view = new ViewCadastrarMaster();
		master = view.showPrimeiro();
		MasterDAO.listademasters.add(master);
	}
	public static void criar()
	{
		ViewCadastrarMaster view = new ViewCadastrarMaster();
		master = view.show();
		if(master != null)
		{
			MasterDAO.listademasters.add(master);
			System.out.println("\nMaster criado com sucesso");
		}
	}
	
	public static void Listar()
	{
		System.out.print("\n");
		for(Master master : listademasters)
		{
			master.show();
		}
	}
	public static Master getMaster(String Email) {
		for(Master master : listademasters)
		{
			if(Email.equals(master.getEmail()))
			{
				return master;
			}
		}
		return null;
	}
}
