package view;

import java.util.Scanner;

import controller.ProdutoDAO;
import controller.DAO;
import modelo.Produto;

public class ViewProdutos {
	Scanner ler = new Scanner(System.in);
	
	public ViewProdutos()
	{
		
	}
	public void criar(){
		String nome, marca;
		float preco;
		
		
		System.out.print("| CADASTRAR PRODUTO |");
		System.out.print("Nome : ");
		nome = ler.nextLine();
		System.out.print("Marca : ");
		marca = ler.nextLine();
		System.out.print("Preço : ");
		preco = ler.nextFloat();
		
		if(ProdutoDAO.criar(nome, marca, preco))
			System.out.println("\nProduto criado com sucesso");
		else
			System.out.println("\nO produto não pode ser criado");
		
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
					criar();
					break;
				}
				case 2:
				{
					ProdutoDAO.listarProdutos();
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
					criar();
				
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
			}
		}
			
	}

}
