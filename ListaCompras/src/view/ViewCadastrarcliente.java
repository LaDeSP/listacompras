package view;

import java.util.Scanner;

import modelo.Cliente;

public class ViewCadastrarcliente {
	Cliente cliente;
	Scanner ler = new Scanner(System.in);
	
	public ViewCadastrarcliente(){
	}
	
	
	public Cliente view()
	{
		String Nome, Senha, Email;
		System.out.print("Nome: ");
		Nome = ler.nextLine();
		System.out.print("Senha: ");
		Senha = ler.nextLine();
		System.out.print("Email: ");
		Email = ler.nextLine();
		this.cliente = new Cliente(Nome, Senha, Email);
		
		return this.cliente;
	}
}
