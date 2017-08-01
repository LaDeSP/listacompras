package view;

import controller.PrecoDAO;
import controller.ProdutoDAO;
import controller.SupermercadoDAO;

import java.util.Scanner;

public class ViewPreco {
	static Scanner ler = new Scanner(System.in);
	
	//criar
	public static void criar(int id_cliente) {
		double preco;
		int id_produto, id_supermercado;
		System.out.println("Digite o pre�o: ");
		preco=ler.nextDouble();
		ProdutoDAO.listarProdutos();
		id_produto = ler.nextInt();
		SupermercadoDAO.listar();
		id_supermercado = ler.nextInt();
		if(PrecoDAO.criarPreco(id_produto, true, id_supermercado, id_cliente, preco))
		{
			System.out.println("Pre�o ok");
		}
		else
			System.out.println("Erro pre�o");
		
	}
	//excluir
	
	//alterar
	public static void alterar_Preco(int id){
		double preco;
		System.out.println("Novo Pre�o: ");
		preco=ler.nextDouble();
	
		PrecoDAO.renomear_preco(id,preco);
	}
	//menu
}
