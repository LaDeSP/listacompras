package view;

import java.util.Scanner;

import controller.LocalDAO;
import controller.SupermercadoDAO;

public class ViewSupermercados {
	
	Scanner ler = new Scanner(System.in);
	
	public ViewSupermercados()
	{
		
	}
	
	public void Menu(SupermercadoDAO supermercadoDAO, LocalDAO localDAO)
	{
		int i = 1, j;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Novo Supermercado\n   2 - Listar Supermercado\n   3 - Excluir Supermercado\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					
					supermercadoDAO.criar(localDAO);
					supermercadoDAO.EscreverArquivo();
					break;
				}
				case 2:
				{
					supermercadoDAO.listar();
					break;
				}
				case 3:
				{
					supermercadoDAO.listar();
					System.out.print("Opção: ");
					j = ler.nextInt();
					supermercadoDAO.RemoveSupermercado(j);
					break;
				}
				case 0:
				{
					i = 0;
					break;
				}
				default: {
					System.out.print("Opção Inexistente. Tente novamente\n");
					break;
				}
			}
		}
	}

}
