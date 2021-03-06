package view;

import java.util.Scanner;

import controller.AdministradorDAO;

public class ViewADMs {
	
	Scanner ler = new Scanner(System.in);
	
	public ViewADMs()
	{
		
	}
	
	public void Menu(AdministradorDAO administradorDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - listar Administradores\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					AdministradorDAO.Listar();
					break;
				}
				case 0:
				{
					i = 0;
					break;
						
				}
			}
		}
	}
	public void criar() throws Exception{
		String nome, senha, email;
		int id_supermercado;
		
		System.out.print("Nome do administrador: ");
		nome = ler.nextLine();
		System.out.print("Crie uma senha: ");
		senha = ler.nextLine();
		System.out.print("Digite o e-mail do administrador: ");
		email = ler.nextLine();
		System.out.print("Digite o Id_supermercado do administrador: ");
		id_supermercado = ler.nextInt();
		
		if(AdministradorDAO.criarAdministrador(nome, senha, email, id_supermercado))
			System.out.print("Administrador criado com sucesso!");
		else
			System.out.print("Não foi possível cadastrar o administrador!");
	}
	public void MenuMaster(AdministradorDAO administradorDAO) throws Exception
	{
		int i = 1, j;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - listar Administradores\n   2 - Criar Administrador\n   3 - Excluir ADM\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					AdministradorDAO.Listar();
					break;
				}
				case 2:
				{
					criar();
					break;
				}
				case 3:
				{
					AdministradorDAO.Listar();
					System.out.print("Opção: ");
					j = ler.nextInt();
					AdministradorDAO.RemoverADM(j);
					break;
				}
				case 0:
				{
					i = 0;
					break;
						
				}
			}
		}
	}

}
