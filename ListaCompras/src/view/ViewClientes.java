package view;

import java.util.Scanner;

import controller.ClienteDAO;
import controller.DAO;

public class ViewClientes {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void Criar() throws Exception
	{
		String nome, senha, email;
		boolean resposta; 
		System.out.print("Digite o nome da conta: ");
		nome = ler.nextLine();
		System.out.print("Digite uma senha: ");
		senha = ler.nextLine();
		System.out.print("Digite um email: ");
		email = ler.nextLine();
		
		resposta = ClienteDAO.criarCliente(nome, email, senha);
		
		if(resposta == false)
		{
			System.out.println("Erro ao criar o cliente");
		}
		else
		{
			System.out.println("Cliente criado com sucesso");
		}
	}
	
	public static void Excluir()
	{
		int id;
		boolean resposta;
		ClienteDAO.listar();
		System.out.print("Digite o id da conta que quer excluir: ");
		id = ler.nextInt();
		resposta = ClienteDAO.RemoverCliente(id);
		if(resposta == false)
		{
			System.out.println("Erro ao excluir o cliente");
		}
		else
		{
			System.out.println("Cliente excluido com sucesso");
		}
	}
	
	public static void Alterar_Nome(int id)
	{
		String nome;
		System.out.print("Digite o novo nome: ");
		nome = ler.nextLine();
		while(ClienteDAO.OKCliente(nome) == true)
		{
			System.out.println("Esse nome já existe");
			System.out.print("Digite o novo nome: ");
			nome = ler.nextLine();
		}
		ClienteDAO.Renomear_Nome(nome, id);
		System.out.println("Nome alterado com sucesso!!");
	}
	
	public static void Alterar_Senha(int id)
	{
		String senha;
		System.out.print("Digite a novo senha: ");
		senha = ler.nextLine();
		while(!DAO.ValidarSenha(senha))
		{
			System.out.println("Senha muito pequena!!");
			System.out.print("Novo senha: ");
			senha = ler.nextLine();
		}
		ClienteDAO.Renomear_Senha(senha, id);
		System.out.println("Senha alterada com sucesso!!");
	}
	
	public static void Alterar_Email(int id)
	{
		String email;
		System.out.print("Digite o novo email: ");
		email = ler.nextLine();
		while(!DAO.ValidarEmail(email))
		{
			System.out.println("Erro no E-mail!!");
			System.out.print("Novo email: ");
			email = ler.nextLine();
			System.out.print("\n");
		}
		ClienteDAO.Renomear_Email(email, id);
		System.out.println("Email alterado com sucesso!!");
	}
	
	public static void Listar()
	{
		ClienteDAO.listar();
	}
}
