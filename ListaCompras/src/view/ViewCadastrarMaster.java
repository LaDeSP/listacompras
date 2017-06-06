package view;

import java.util.Scanner;

import modelo.Master;

public class ViewCadastrarMaster {
	Scanner ler = new Scanner(System.in);
	public ViewCadastrarMaster()
	{
		
	}

	public Master show()
	{
		String Email, Senha;
		int id = 0;
		System.out.println("Nome: ");
		Email = ler.nextLine();
		System.out.println("Senha: ");
		Senha = ler.nextLine();
		Master master = new Master(Senha, Email, id);
		return master;
	}
	public Master showPrimeiro()
	{
		Master master = new Master("96654117", "Alan", 0);
		return master;
	}
}
