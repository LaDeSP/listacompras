package view;

import java.util.Scanner;

import controller.LocalDAO;
import modelo.Supermercado;

public class ViewSupermercado {
	Scanner entrada = new Scanner(System.in);
	String nome;
	Supermercado supermercado;
	int id_local;
	public ViewSupermercado() {

	}

	public Supermercado showAndSet(LocalDAO localDAO) {
		
		this.supermercado = new Supermercado();
		
		System.out.print("Nome:");
		this.supermercado.setNome(entrada.nextLine());	
		this.supermercado.setId_local(localDAO.criar().getId());
		
		return this.supermercado;
		
	}

}

