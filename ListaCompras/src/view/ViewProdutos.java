package view;

import java.util.Scanner;

import controller.ProdutoDAO;
import modelo.Produto;

public class ViewProdutos {
	Scanner ler = new Scanner(System.in);
	
	public ViewProdutos()
	{
		
	}
	public void Menu(ProdutoDAO produtoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Novo Produto\n   2 - Listar Produtos\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					produtoDAO.criar();
					Produto produto = produtoDAO.getLastProduto();
					break;
				}
				case 2:
				{
					produtoDAO.listarProdutos();
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
	
	public void MenuMaster(ProdutoDAO produtoDAO)
	{
		int i = 1, j;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Novo Produto\n   2 - Listar Produtos\n   3 - Excluir Produto\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					produtoDAO.criar();
					Produto produto = produtoDAO.getLastProduto();
					break;
				}
				case 2:
				{
					produtoDAO.listarProdutos();
					break;
				}
				case 3:
				{
					produtoDAO.listarProdutos();
					System.out.print("Opção: ");
					j = ler.nextInt();
					produtoDAO.RemoveProduto(j);
					break;
				}
				case 0:
				{
					i = 0;
					break;
						
				}
				default:{
					System.out.print("Opção Inexistente. Tente novamente\n");
					break;
				}
			}
		}
			
	}

}
