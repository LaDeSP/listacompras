package view;

import java.util.Scanner;

import controller.ClienteDAO;
import controller.PromocaoDAO;

public class ViewClientes {
	
	Scanner ler = new Scanner(System.in);

	public ViewClientes()
	{
		
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
					clienteDAO.Listar();
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
	public void MenuMaster(ClienteDAO clienteDAO)
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
					clienteDAO.Listar();
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
				case 3:
				{
					clienteDAO.Listar();
					System.out.print("Opção: ");
					j = ler.nextInt();
					clienteDAO.RemoverCliente(j);
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
	public void MenuCliente(ClienteDAO clienteDAO, int id, PromocaoDAO promocaoDAO)
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
					clienteDAO.InserirNaLista(promocaoDAO, id);
					break;
				}
				case 2:
				{
					clienteDAO.GetCliente(id).show(id);
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
