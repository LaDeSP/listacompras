package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Administrador;
import modelo.HistoricoCliente;
import view.ViewHistoricoCliente;


public class HistoricoClienteDAO extends DAO{
	private static List<HistoricoCliente> listahistorico = new ArrayList<HistoricoCliente>();
	//private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	
	HistoricoCliente historico;
	
	public HistoricoClienteDAO()
	{
		
	}
	
	public void Escrever()
	{
		Escrever(Constantes.HistoricoCDs, listahistorico);
	}
	
	public void lerArquivo()
	{
		HistoricoClienteDAO.listahistorico = (List<HistoricoCliente>) Ler(Constantes.HistoricoCDs, listahistorico);
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
