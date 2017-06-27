package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Administrador;
import view.ViewCadastrarAdministrador;

public class AdministradorDAO extends DAO{
	
	private static List<Administrador> listadeadms = new ArrayList<Administrador>();
	Administrador adm = null;
	
	public void criarAdministrador()
	{
		ViewCadastrarAdministrador viewadm = new ViewCadastrarAdministrador();
		this.adm = viewadm.show();
		if(adm != null)
		{
			AdministradorDAO.listadeadms.add(this.adm);
			System.out.println("\nAdministrador criado com sucesso");
		}
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.AdministradorDs, listadeadms);
	}
	
	public static void lerArquivo()
	{
		AdministradorDAO.listadeadms = (List<Administrador>) Ler(Constantes.AdministradorDs, listadeadms);
	}
	public static void Listar()
	{
		for(Administrador adm : listadeadms)
		{
			adm.show();
		}
	}
	public static boolean OKAdm(String Nome)
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
	public static Administrador GetAdm(String Nome)
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
	public static Administrador GetAdm(int id)
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
	public static void RemoverADM(int id)
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
