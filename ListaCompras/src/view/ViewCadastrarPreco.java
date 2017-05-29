package view;

import java.util.Scanner;

import módulos.Preco;

public class ViewCadastrarPreco {
	Scanner entrada = new Scanner(System.in);
	int id_produto;
	boolean status;
	int id_supermercado;
	int id_cliente;
	double precoProduto;
	Preco preco;
	public ViewCadastrarPreco() {

	}

	public Preco showAndSet() {
		
		this.preco = new Preco();
		
		System.out.print("Id Produto:");
		this.preco.setId_produto(entrada.nextInt());	
		
		System.out.print("Status:");
		this.preco.setStatus(entrada.nextBoolean());
		
		System.out.print("Id Supermercado:");
		this.preco.setId_supermercado(entrada.nextInt());
		
		System.out.print("Id Cliente:");
		this.preco.setId_cliente(entrada.nextInt());
		
		System.out.print("Preço Produto:");
		this.preco.setPrecoProduto(entrada.nextDouble());	
		
		return this.preco;
		
	}

}
