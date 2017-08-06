package view;

import java.util.Scanner;

import controller.AdministradorDAO;
import controller.ClienteDAO;
import controller.DAO;

public class ViewADMs {
	
	static Scanner ler = new Scanner(System.in);
	
	public ViewADMs()
	{
		
	}
	public static void criar() throws Exception {
	String nome, senha, email; int id_supermercado = 0;
	 
	
	System.out.println("Digite o nome da conta: ");
	nome = ler.nextLine();
	System.out.println("Digite uma senha: ");
	senha = ler.nextLine();
	System.out.println("Digite um email: ");
	email = ler.nextLine();
	AdministradorDAO.Listar();
	System.out.println("\n Digite o ID do supermercado: ");
	id_supermercado = ler.nextInt();
	

		if(AdministradorDAO.criarAdministrador(nome, email, senha, id_supermercado))
		{
			System.out.println("Administrador criado com sucesso");
		}
		else
		{
			System.out.println("Erro ao criar o Adm: "+nome);
		}
	
	}
	public static void excluir() {
		int id;
		
		AdministradorDAO.Listar();
		System.out.print("Digite o id da conta que deseja excluir: ");
		id = ler.nextInt();
		
		if(AdministradorDAO.RemoverAdm(id))
		{
			System.out.println("Administrador excluido com sucesso!");
		}
		else
		{
			System.out.println("Erro ao excluir o Administrador...");
		}
	}
	public static void alterar_Nome(int id)
	{
		String nome;
		System.out.print("Digite o novo nome: ");
		nome = ler.nextLine();
		while(AdministradorDAO.OKAdm(nome) == true)
		{
			System.out.println("Esse nome j� existe");
			System.out.print("Digite o novo nome: ");
			nome = ler.nextLine();
		}
		AdministradorDAO.Renomear_Nome(nome, id);
		System.out.println("Nome alterado com sucesso!!");
	}
	
	public static void alterar_Senha(int id)
	{
		String senha;
		System.out.print("Digite a nova senha: ");
		senha = ler.nextLine();
		while(!DAO.ValidarSenha(senha))
		{
			System.out.println("Senha muito pequena!");
			System.out.print("Nova senha: ");
			senha = ler.nextLine();
		}
		AdministradorDAO.Renomear_Senha(senha, id);
		System.out.println("Senha alterada com sucesso!");
	}
	
	public static void alterar_Email(int id)
	{
		String email;
		System.out.print("Digite o novo email: ");
		email = ler.nextLine();
		while(!DAO.ValidarEmail(email))
		{
			System.out.println("Erro no E-mail!!");
			System.out.print("Novo email: ");
			email = ler.nextLine();
			System.out.print("\n");
		}
		AdministradorDAO.Renomear_Email(email, id);
		System.out.println("Email alterado com sucesso!!");
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
					AdministradorDAO.RemoverAdm(j);
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
