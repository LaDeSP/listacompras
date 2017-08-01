package view;

import controller.ClienteDAO;
import controller.PrecoDAO;
import controller.ProdutoDAO;
import controller.PromocaoDAO;
import controller.SupermercadoDAO;
import java.util.Scanner;

public class ViewPreco {
	static Scanner ler = new Scanner(System.in);
	
	//criar
	public void criar() {
		double preco;
		System.out.println("Digite o preço: ");
		preco=ler.nextDouble();
		
		if(PrecoDAO.criarPreco(id_produto, status, id_supermercado, id_cliente, preco))
			System.out.println("Preço ok");
		else
			System.out.println("Erro preço");
		
	}
	//excluir
	
	//alterar
	public void alterar_Preco(int id){
		double preco;
		System.out.println("Novo Preço: ");
		preco=ler.nextDouble();
	
		PrecoDAO.renomear_preco(id,preco);
	}
	//menu
}
