package view;

import controller.PrecoDAO;
import controller.ProdutoDAO;
import controller.SupermercadoDAO;

import java.util.Scanner;

public class ViewPreco {
	static Scanner ler = new Scanner(System.in);
	
	//criar o preço
	public static void criar(int id_cliente) {
		double preco;
		int id_produto, id_supermercado;
		
		System.out.println("Digite o preço: ");
		preco=ler.nextDouble();
		
		System.out.println("Digite o id do produto: ");
		ProdutoDAO.listarProdutos();
		id_produto = ler.nextInt();
		
		while(ProdutoDAO.OKProduto(id_produto)==false) { //verifica se o id é valido
			System.out.println("Id do produto inexistente!\nDigite um id valido");
			id_produto = ler.nextInt();
		}
		System.out.println("Id do supermercado.");
			SupermercadoDAO.listar();
		id_supermercado = ler.nextInt();
		
		//verifica o id do supermercado
		
		while(SupermercadoDAO.GetSupermercado(id_supermercado)==null) {
			System.out.println("Id do supermercado inexistente!\nDigite um id valido");
			id_supermercado=ler.nextInt();
		}
			//ja verificou todos os campos
		
		if(PrecoDAO.criarPreco(id_produto, true, id_supermercado, id_cliente, preco))
		{
			System.out.println("Preço ok");
		}
		else
			System.out.println("Erro preço");
		
	}
	//excluir
	public static void excluir() {
		double preco;
		int id_supermercado, id_produto;
		
		
		System.out.println("Id do supermercado: ");
		SupermercadoDAO.listar();
		id_supermercado = ler.nextInt();
		
		while(SupermercadoDAO.GetSupermercado(id_supermercado)==null) {
			System.out.println("Id do supermercado inexistente!\nDigite um id valido");
			id_supermercado=ler.nextInt();
		}
		
		System.out.println("Digite o id do produto: ");
		ProdutoDAO.listarProdutos();
		id_produto = ler.nextInt();
		
		while(ProdutoDAO.OKProduto(id_produto)==false) { //verifica se o id é valido
			System.out.println("Id do produto inexistente!\nDigite um id valido");
			id_produto = ler.nextInt();
		}
		
		if(PrecoDAO.remover(id_supermercado, id_produto)) {
		System.out.println("Preço excluido com sucesso.");
		}else {
			System.out.println("Erro ao excluir preço.");
		}
	}
	
	//alterar
	public static void alterar_Preco(){
		double preco;
		int id_supermercado, id_produto;
		
		System.out.println("Novo Preço: ");
		preco=ler.nextDouble();
		//falta realizar o controle do preço 
		
		System.out.println("Id do supermercado");
		SupermercadoDAO.listar();
		id_supermercado = ler.nextInt();
		
		while(SupermercadoDAO.GetSupermercado(id_supermercado)==null) {
			System.out.println("Id do supermercado inexistente!\nDigite um id valido");
			id_supermercado=ler.nextInt();
		}
		
		System.out.println("Digite o id do produto: ");
		ProdutoDAO.listarProdutos();
		id_produto = ler.nextInt();
		
		while(ProdutoDAO.OKProduto(id_produto)==false) { //verifica se o id é valido
			System.out.println("Id do produto inexistente!\nDigite um id valido");
			id_produto = ler.nextInt();
		}
		
	
		if(PrecoDAO.renomear_preco(id_supermercado, id_produto, preco))
			System.out.println("Preço alterado com sucesso...");
		else
			System.out.println("Erro ao alterar preco.");
	}
	//menu
}
