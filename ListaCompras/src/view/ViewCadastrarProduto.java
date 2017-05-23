package view;

import java.util.Scanner;

import módulos.Produto;

public class ViewCadastrarProduto {
	Scanner entrada = new Scanner(System.in);
//	String nome;
	String marca;
	Produto produto;
	public ViewCadastrarProduto() {

	}

	public Produto showAndGet() {
		
		this.produto = new Produto();
		
		System.out.print("Nome:");
		this.produto.setNome(entrada.nextLine());	
		
		System.out.print("Marca");
		this.marca = entrada.nextLine();
		this.produto.setMarca(this.marca);
		
		return this.produto;
		
	}

}
