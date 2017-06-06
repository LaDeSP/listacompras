package view;

import java.util.Scanner;

import modelo.Administrador;

public class ViewCadastrarAdministrador {
	Administrador adm;
	Scanner ler = new Scanner(System.in);
	
	public ViewCadastrarAdministrador(){	
	}
	
	public Administrador show()
	{
		String Senha, Email, Nome;
		int id_supermercado;
		System.out.print("Nome: ");
		Nome = ler.nextLine();
		System.out.print("Senha: ");
		Senha = ler.nextLine();
		System.out.print("Email: ");
		Email = ler.nextLine();
		System.out.print("Id Supermercado: ");
		id_supermercado = ler.nextInt();
		
		
		this.adm = new Administrador(Nome, Senha, Email, id_supermercado);
		return adm;
	}
}
