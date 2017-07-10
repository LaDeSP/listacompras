package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Administrador;
import modelo.Cliente;
import modelo.HistoricoCliente;


public class AdministradorDAO extends DAO{
	
	private static List<Administrador> listadeadms = new ArrayList<Administrador>();
	Administrador adm = null;
	private static Scanner leitura;

	public static boolean criarAdministrador(String Nome, String senha, String email, int id_supermercado) throws Exception
	{
			leitura = new Scanner(System.in);
		
		
		while(!DAO.ValidarEmail(email)) //verificamos se o email é valido
		{
			System.out.println("Erro no E-mail!!");
			System.out.print("Novo email: ");
			email = leitura.nextLine();
			System.out.print("\n");
		}
		while(!DAO.ValidarSenha(senha)) //verificamos se a senha é valida
		{
			System.out.println("Senha muito pequena!!");
			System.out.print("Novo senha: ");
			senha = leitura.nextLine();
			System.out.print("\n");
		}
		//verificar se o id_supermercado existe
		while(SupermercadoDAO.GetSupermercado(id_supermercado)==null){
			System.out.print("Id do supermercado inexistente");
			
			SupermercadoDAO.getListadeSupermercados();
			System.out.printf("Digite o id_supermercado: ");
			id_supermercado=leitura.nextInt();
			
		}
			
		
		senha = MD5.criptografar(senha); //criptografamos a senha
		
		Administrador administrador = new Administrador(Nome, senha, email, id_supermercado); //criamos o adm
		
		if(administrador==null)
			return false;
		
		AdministradorDAO.listadeadms.add(administrador); //adicionamos o adm na lista de administradores
		return true;
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.AdministradorDs, listadeadms);
	}
	
	public static void lerArquivo()
	{
		AdministradorDAO.listadeadms = (List<Administrador>) Ler(Constantes.AdministradorDs, listadeadms);
	}
	public static void Listar()
	{
		for(Administrador adm : listadeadms)
		{
			adm.show();
		}
	}
	public static boolean OKAdm(String Nome)
	{
		for(Administrador adm : listadeadms)
		{
			if(Nome.equals(adm.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	public static Administrador GetAdm(String Nome)
	{
		for(Administrador adm : listadeadms)
		{
			if(Nome.equals(adm.getNome()))
			{
				return adm;
			}
		}
		return null;
		
	}
	public static Administrador GetAdm(int id)
	{
		for(Administrador adm : listadeadms)
		{
			if(id == adm.getId())
			{
				return adm;
			}
		}
		return null;
		
	}
	public static void RemoverADM(int id)
	{
		for(Administrador adm : listadeadms)
		{
			if(id == adm.getId())
			{
				AdministradorDAO.listadeadms.remove(adm);
				return ;
			}
		}
		
	}
}
