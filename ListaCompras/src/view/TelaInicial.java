package view;

import java.util.Scanner;

import controller.*;
import módulos.Produto;

public class TelaInicial {
	public TelaInicial(){
		Scanner ler = new Scanner(System.in);
		boolean run = true;
		boolean z;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		AdministradorDAO administradorDAO = new AdministradorDAO();
		int opcao = 0;
		while (run) {
			System.out.println("1 - Cadastro de Produto\n2 - Listar TODOS os produtos\n3 - Cadastrar Cliente\n4 - Listar Clientes");
			System.out.println("5 - Criar Adiministrador\n6 - Listar Administrador\n7 - Procurar ADM\n8 - sair");
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
				case 5:{
					administradorDAO.criarAdministrador();
					break;
				}
				case 6:{
					administradorDAO.Listar();
					break;
				}
				case 7:{
					String Nome = ler.nextLine();
					z = administradorDAO.getAdm(Nome);
					break;
				}
				case 8: {
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
