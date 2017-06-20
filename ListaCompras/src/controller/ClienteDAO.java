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
		senha = MD5.criptografar(senha);
		//provavelmente deve ter uma validação dos dados 
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
	public boolean OKCliente(String Nome)
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
	public void RemoverCliente(int id)
	{
		for(Cliente cliente : listadeclientes)
		{
			if(id == cliente.getId())
			{
				ClienteDAO.listadeclientes.remove(cliente);
				return ;
			}
		}
	}
	public static void InserirNaLista(PromocaoDAO promocaoDAO, int id)
	{
		ViewListarPromocoes viewlistarpromocoes = new ViewListarPromocoes();
		int i;
		
		if(promocaoDAO.GetPromocaoPorId(1) == null)
		{
			System.out.print("Não existe nenhuma promoção\n");
			return ;
		}
		
		System.out.println("Nome: " +GetCliente(id).getNome());
		
		//Listar as Promoções
		viewlistarpromocoes.Show(promocaoDAO);
		
		//Escolher a Promoção
		i = leitura.nextInt();
		
		//Inserir a promoção no Cliente
		System.out.println("Nome: " +GetCliente(id).getNome()+ " Promocao: " +promocaoDAO.GetPromocao(i).getId());
		GetCliente(id).InserirNaLista( promocaoDAO.GetPromocao(i) , id);
	}
	
}