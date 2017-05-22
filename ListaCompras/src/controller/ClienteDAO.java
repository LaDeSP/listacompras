package controller;

import java.util.Scanner;
import módulos.Cliente;
public class ClienteDAO {
	static void criarCliente()
	{
		Scanner ler = new Scanner(System.in);
		String Nome, Email, Senha;
		System.out.printf("\nNome: ");
		Nome = ler.nextLine();
		System.out.printf("Email: ");
		Email = ler.nextLine();
		System.out.printf("Senha: ");
		Senha = ler.nextLine();
		
		
		Cliente p = new Cliente(Nome, Senha, Email);
	}
	
}
