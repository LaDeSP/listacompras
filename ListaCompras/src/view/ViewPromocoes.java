package view;

import java.util.Scanner;

import controller.PrecoDAO;
import controller.ProdutoDAO;
import controller.PromocaoDAO;
import controller.SupermercadoDAO;

public class ViewPromocoes {
	Scanner ler = new Scanner(System.in);
	
	
	
	
	public ViewPromocoes()
	{
		
	}
	public void Menu(PrecoDAO precoDAO, PromocaoDAO promocaoDAO, int id, SupermercadoDAO supermercadoDAO, ProdutoDAO produtoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Nova Promoção\n   2 - Listar Promoções\n   3 - Criar Pre�o\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					precoDAO.criarPromocao(produtoDAO, id, supermercadoDAO);
					break;
				}
				case 2:
				{
					promocaoDAO.listar();
					break;
				}
				case 3:
				{
					precoDAO.criarPreco(produtoDAO, id, supermercadoDAO);
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
	public void menuADMMaster(PrecoDAO precoDAO, PromocaoDAO promocaoDAO, int id, SupermercadoDAO supermercadoDAO, ProdutoDAO produtoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Listar Promoções\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					promocaoDAO.listar();
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
