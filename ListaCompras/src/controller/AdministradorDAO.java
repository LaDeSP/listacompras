package controller;

import java.util.ArrayList;
import java.util.List;

import módulos.Administrador;
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
	public boolean getAdm(String Nome)
	{
		for(Administrador adm : listadeadms)
		{
			if(Nome == adm.getNome())
			{
				System.out.println("Achou:\n");
				adm.show();
				return true;
			}
		}
		System.out.println("Não Achou:\n");
		return false;
		
	}
}
