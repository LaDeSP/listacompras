package view;

import java.util.Scanner;

import controller.AdministradorDAO;
import controller.ClienteDAO;
import controller.MasterDAO;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Master;

public class ViewLogin {
	
	Scanner ler = new Scanner(System.in);
	public ViewLogin()
	{}
	public int ViewloginCliente(ClienteDAO clienteDAO)
	{
		Cliente cliente;
		int x = 0;
		String Nome, Senha;
		System.out.print("Nome: ");
		Nome = ler.nextLine();
		System.out.print("Senha: ");
		Senha = ler.nextLine();
		cliente = clienteDAO.GetCliente(Nome);
		
		if(cliente != null && cliente.getSenha().equals(Senha))
		{
			x = cliente.getId();
		}
		
		return x;
	}
	public int ViewloginADM(AdministradorDAO administradorDAO) 
	{
		Administrador administrador;
		int x = 0;
		String Nome, Senha;
		System.out.print("Nome: ");
		Nome = ler.nextLine();
		System.out.print("Senha: ");
		Senha = ler.nextLine();
		administrador = administradorDAO.GetAdm(Nome);
		if(administrador != null && administrador.getSenha().equals(Senha))
		{
			x = administrador.getId();
		}
		return x;
	}
	public int ViewloginMaster(MasterDAO masterDAO) 
	{
		Master master;
		int x = 0;
		String Email, Senha;
		System.out.print("Email: ");
		Email = ler.nextLine();
		System.out.print("Senha: ");
		Senha = ler.nextLine();
		master = masterDAO.getMaster(Email);
		if(master != null && master.getSenha().equals(Senha))
		{
			x = master.getId();
		}
		return x;
	}
}
