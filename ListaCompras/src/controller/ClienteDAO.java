package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import view.ViewListarPromocoes;

public class ClienteDAO extends DAO{
	
	private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	Cliente cliente = null; //provavelmente deve ser excluída
	static Scanner leitura = new Scanner(System.in);
	/**
	 * 
	 * @param nome Nome do Cliente
	 * @param email E-mail do Cliente
	 * @param senha Senha do Cliente
	 * @return True se cadastro foi realizado, False se cadastro do cliente não foi executado
	 * @throws Exception 
	 */
	public static boolean criarCliente(String nome, String email, String senha) throws Exception{
		
		//provavelmente deve ter uma validação dos dados 
		senha = MD5.criptografar(senha);
		Cliente cliente = new Cliente(nome, senha, email);
		ClienteDAO.listadeclientes.add(cliente);
		return true;
		
	}
	
	public static void Escrever()
	{
		DAO.Escrever(Constantes.ClienteDs, listadeclientes);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadeclientes = (List<Cliente>) DAO.Ler(Constantes.ClienteDs, listadeclientes);
		return true;
	}
	
	
	public static void listar()
	{
		for(Cliente cliente : listadeclientes)
		{
			cliente.show();
		}
	}
	public static boolean OKCliente(String Nome)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(Nome.equals(cliente.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	public static boolean OKClienteE(String email)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(email.equals(cliente.getEmail()) == true)
			{
				return true;
			}
		}
		return false;
		
	}
	public static Cliente GetCliente(String Nome)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(Nome.equals(cliente.getNome()))
			{
				return cliente;
			}
		}
		return null;
		
	}
	public static Cliente GetCliente(int id)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(id == cliente.getId())
			{
				return cliente;
			}
		}
		return null;
		
	}
	public static boolean RemoverCliente(int id)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(id == cliente.getId())
			{
				ClienteDAO.listadeclientes.remove(cliente);
				return true;
			}
		}
		return false;
	}
	public static void Renomear_Nome(String nome, int id)
	{
		GetCliente(id).setNome(nome);
	}
	public static void Renomear_Senha(String senha, int id)
	{
		GetCliente(id).setSenha(senha);
	}
	public static void Renomear_Email(String email, int id)
	{
		GetCliente(id).setEmail(email);
	}
	public static void AtualizarID()
	{
		for(Cliente cliente : listadeclientes)
		{
			cliente.Incrementar();
		}
	}
}