package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Administrador;
import view.ViewCadastrarAdministrador;

public class AdministradorDAO{
	
	private static List<Administrador> listadeadms = new ArrayList<Administrador>();
	Administrador adm = null;
	
	public void criarAdministrador()
	{
		ViewCadastrarAdministrador viewadm = new ViewCadastrarAdministrador();
		this.adm = viewadm.show();
		AdministradorDAO.listadeadms.add(this.adm);
	}
	public void Listar()
	{
		for(Administrador adm : listadeadms)
		{
			adm.show();
		}
	}
	public boolean OKAdm(String Nome)
	{
		for(Administrador adm : listadeadms)
		{
			if(Nome.equals(adm.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	public Administrador GetAdm(String Nome)
	{
		for(Administrador adm : listadeadms)
		{
			if(Nome.equals(adm.getNome()))
			{
				return adm;
			}
		}
		return null;
		
	}
	public Administrador GetAdm(int id)
	{
		for(Administrador adm : listadeadms)
		{
			if(id == adm.getId())
			{
				return adm;
			}
		}
		return null;
		
	}
	public void RemoverADM(int id)
	{
		for(Administrador adm : listadeadms)
		{
			if(id == adm.getId())
			{
				AdministradorDAO.listadeadms.remove(adm);
				return ;
			}
		}
		
	}
}
