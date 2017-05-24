package controller;

import java.util.ArrayList;
import java.util.List;

import módulos.Cliente;
import view.ViewCadastrarcliente;

public class ClienteDAO {
	
	private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	Cliente cliente = null;
	
	public void criarCliente(){
		ViewCadastrarcliente viewcadastro = new ViewCadastrarcliente();
		this.cliente = viewcadastro.view();
		ClienteDAO.listadeclientes.add(this.cliente);
	}
	
	
	public void Listar()
	{
		for(Cliente cliente : listadeclientes)
		{
			cliente.show();
		}
	}
	
}
