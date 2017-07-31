package view;

import java.util.Scanner;

import controller.ListaDeProdutosDAO;

public class ViewListadeProdutos {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void Listar(int id)
	{
		ListaDeProdutosDAO.Listar(id);
	}
	
	public static void Remover(int id)
	{
		//pode ser que de erro na hora de ler o int
		ListaDeProdutosDAO.Listar(id);
		int id_Produto = entrada.nextInt();
		int id_Cliente = entrada.nextInt();
		if(ListaDeProdutosDAO.Remover(id_Produto, id_Cliente))
		{
			System.out.println("Produto removido com sucesso");
		}
		else
		{
			System.out.println("Erro ao excluir");
		}
	}

}
