package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.HistoricoCliente;
import view.ViewHistoricoCliente;


public class HistoricoClienteDAO {
	private static List<HistoricoCliente> listahistorico = new ArrayList<HistoricoCliente>();
	//private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	
	HistoricoCliente historico;
	
	public HistoricoClienteDAO()
	{
		
	}
	public void Criar()
	{
		ViewHistoricoCliente view = new ViewHistoricoCliente();
		historico = view.criar();
		HistoricoClienteDAO.listahistorico.add(historico);
	}
	public void Listar() {
		for(HistoricoCliente historico : listahistorico)
		{
			historico.show();
		}
		
	}
	
}
