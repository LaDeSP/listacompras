package view;

import java.util.Scanner;

import módulos.Produto;

public class ViewSupermercado {
	Scanner entrada = new Scanner(System.in);
	String nome;
	Supermercado supermercado;
	int id_local;
	public ViewSupermercado() {

	}

	public Supermercado showAndSet() {
		
		this.supermercado = new Supermercado();
		
		System.out.print("Nome:");
		this.supermercado.setNome(entrada.nextLine());	
		
		System.out.print("ID local:");
		this.id_local.setId_local(entrada.nextInt());
		
		return this.supermercado;
		
	}

}

