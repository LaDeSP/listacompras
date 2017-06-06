package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Master;
import view.ViewCadastrarMaster;

public class MasterDAO {
	
	private Master master = null;
	private static List<Master> listademasters = new ArrayList<Master>();
	
	public MasterDAO()
	{
		
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
		MasterDAO.listademasters.add(master);
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
