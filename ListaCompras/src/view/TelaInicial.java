package view;

import java.util.Scanner;

import controller.ClienteDAO;
import controller.ProdutoDAO;
import módulos.Produto;

public class TelaInicial {
	public TelaInicial(){
		Scanner ler = new Scanner(System.in);
		boolean run = true;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		int opcao = 0;
		while (run) {
			System.out.println("1 - Cadastro de Produto\n2 - Listar TODOS os produtos\n3 - Cadastrar Cliente\n4 - Listar Clientes\n5 - Sair");
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
				case 3:{
					clienteDAO.criarCliente();
					break;
				}
				case 4:{
					clienteDAO.Listar();
					break;
				}
				case 5: {
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
