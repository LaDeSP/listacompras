package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Master;

public class MasterDAO extends DAO{
	
	private static Master master = null;
	private static List<Master> listademasters = new ArrayList<Master>();
	
	public static void Criar(String senha, String email)
	{
		Master master = new Master(senha, email);
		if(master == null)
		{
			System.out.println("Erro ao cadastrar Master");
		}
		else
		{
			System.out.println("Master cadastrado com sucesso");
			MasterDAO.listademasters.add(master);
		}
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
	public static void Incrementar()
	{
		for(Master master : listademasters)
		{
			master.Incrementar();
		}
	}
}
