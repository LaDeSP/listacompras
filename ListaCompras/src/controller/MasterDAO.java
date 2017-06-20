package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Master;
import view.ViewCadastrarMaster;

public class MasterDAO extends DAO{
	
	private Master master = null;
	private static List<Master> listademasters = new ArrayList<Master>();
	
	public MasterDAO()
	{
		
	}
	
	public void Escrever()
	{
		Escrever(Constantes.MasterDs, listademasters);
	}
	
	public boolean lerArquivo() throws ClassNotFoundException
	{
		this.listademasters = (List<Master>) Ler(Constantes.MasterDs, listademasters);
		return true;
	}
	
	public void criarPrimeiro()
	{
		ViewCadastrarMaster view = new ViewCadastrarMaster();
		master = view.showPrimeiro();
		MasterDAO.listademasters.add(master);
	}
	public void criar()
	{
		ViewCadastrarMaster view = new ViewCadastrarMaster();
		master = view.show();
		//if(master != null)
		try
		{
			MasterDAO.listademasters.add(master);
			System.out.println("\nMaster criado com sucesso");
		}
		catch(IOException e){
			e.printStackTrace();	
		}
	}
	
	public void Listar()
	{
		System.out.print("\n");
		for(Master master : listademasters)
		{
			master.show();
		}
	}
	public Master getMaster(String Email) {
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
