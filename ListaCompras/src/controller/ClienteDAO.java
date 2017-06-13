package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import view.ViewCadastrarcliente;
import view.ViewListarPromocoes;

public class ClienteDAO {
	
	private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	Cliente cliente = null;
	Scanner leitura = new Scanner(System.in);
	
	public void criarCliente(){
		ViewCadastrarcliente viewcadastro = new ViewCadastrarcliente();
		this.cliente = viewcadastro.view();
		if(cliente != null)
		{
			ClienteDAO.listadeclientes.add(this.cliente);
			System.out.println("\nCliente criado com sucesso");
		}
	}
	
	
	public void Listar()
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
	public Cliente GetCliente(String Nome)
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
	public Cliente GetCliente(int id)
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
	public void InserirNaLista(PromocaoDAO promocaoDAO, int id)
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