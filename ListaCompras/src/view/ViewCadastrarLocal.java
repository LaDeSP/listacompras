package view;

import java.util.Scanner;

import módulos.Local;

public class ViewCadastrarLocal {
	Scanner entrada = new Scanner(System.in);
	String cep;
	Local local;
	String cidade;
	String estado;
	public ViewCadastrarLocal() {

	}

	public Local showAndSet() {
		
		this.local = new Local();
		
		System.out.print("CEP:");
		this.local.setCEP(entrada.nextLine());	
		
		System.out.print("Cidade:");
		this.cidade.setCidade(entrada.nextLine());
		
		System.out.print("Estado:");
		this.estado.setEstado(entrada.nextLine());
		
		return this.local;
		
	}

}
