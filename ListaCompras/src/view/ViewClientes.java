package view;

import java.util.Scanner;

import modelo.Cliente;

import controller.ClienteDAO;
import controller.PromocaoDAO;

public class ViewClientes {
	
	Scanner ler = new Scanner(System.in);

	public ViewClientes()
	{
		
	}
			
		
		public void cadastrar() throws Exception
		{
			String nome, senha, email;
			
			System.out.print("Nome: ");
			nome = ler.nextLine();
			System.out.print("Senha: ");
			senha = ler.nextLine();
			System.out.print("Email: ");
			email = ler.nextLine();
			
			if(ClienteDAO.criarCliente(nome, email, senha)){
				System.out.println("Cliente cadastrado com sucesso");
			}else{
				System.out.println("Erro ao cadastrar cliente");
			}
			
			
	}
	
	
	public void Menu(ClienteDAO clienteDAO)
	{
		int i = 1;
		boolean z;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - listar Clientes\n   2 - Procurar Cliente\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					clienteDAO.listar();
					break;
				}
				case 2:
				{
					String Nome = ler.nextLine();
					z = clienteDAO.OKCliente(Nome);
					if(z == true)
					{
						System.out.print("Existe esse Cliente\n");
					}
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
	public void MenuMaster()
	{
		int i = 1, j;
		boolean z;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - listar Clientes\n   2 - Procurar Cliente\n   3 - Excluir Cliente\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					ClienteDAO.listar();
					break;
				}
				case 2:
				{
					String Nome = ler.nextLine();
					z = ClienteDAO.OKCliente(Nome);
					if(z == true)
					{
						System.out.print("Existe esse Cliente\n");
					}
					break;
				}
				case 3:
				{
					ClienteDAO.listar();
					System.out.print("Opção: ");
					j = ler.nextInt();
					ClienteDAO.RemoverCliente(j);
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
	public void MenuCliente(int id, PromocaoDAO promocaoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Inserir na Lista\n   2 - Ver a Lista\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					ClienteDAO.InserirNaLista(promocaoDAO, id);
					break;
				}
				case 2:
				{
					ClienteDAO.GetCliente(id).show(id);
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
