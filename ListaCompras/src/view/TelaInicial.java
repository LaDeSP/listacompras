package view;

import java.util.Scanner;

import controller.ProdutoDAO;
import módulos.Produto;

public class TelaInicial {
	public TelaInicial(){
		Scanner ler = new Scanner(System.in);
		boolean run = true;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		int opcao = 0;
		while (run) {
			System.out.println("1 - Cadastro de Produto\n2 - Listar TODOS os produtos\n3 - Sair");
			opcao = ler.nextInt();
			switch (opcao) {
				case 1: {
					produtoDAO.criar();
					Produto produto = produtoDAO.getLastProduto();
					//produto.show();
					break;				
	
				}
				case 2:{
					produtoDAO.listarProdutos();
					break;
				}
				case 3: {
					run = false;
					break;
				}
				default: {
					System.out.println("Opção Inválida");
						
				}
			}

		}
		System.out.println("ByeBye");
		ler.close();
	}

}
