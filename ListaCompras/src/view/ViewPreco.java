package view;

import controller.PrecoDAO;
import java.util.Scanner;

public class ViewPreco {
	static Scanner ler = new Scanner(System.in);
	
	//criar
	public void criar(int id_produto, int id_supermercado, int id_cliente) {
		double preco;
		System.out.println("Digite o preço: ");
		preco=ler.nextDouble();
		
		if(PrecoDAO.criarPreco(id_produto, true, id_supermercado, id_cliente, preco))
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
