package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.HistoricoCliente;


public class HistoricoClienteDAO extends DAO{
	private static List<HistoricoCliente> listahistorico = new ArrayList<HistoricoCliente>();
	//private static List<Cliente> listadeclientes = new ArrayList<Cliente>();
	
	public static HistoricoCliente Criar(int id_produto, int id_cliente)
	{
		HistoricoCliente HC = new HistoricoCliente(id_produto, id_cliente);
		if(HC != null)
		{
			HistoricoClienteDAO.listahistorico.add(HC);
			return HC;
		}
		return null;
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.HistoricoCDs, listahistorico);
	}
	
	public static void LerArquivo()
	{
		HistoricoClienteDAO.listahistorico = (List<HistoricoCliente>) Ler(Constantes.HistoricoCDs, listahistorico);
	}
	
	public static void Listar() {
		for(HistoricoCliente historico : listahistorico)
		{
			historico.show();
		}
		
	}
	public static void Listar(int id) {
		for(HistoricoCliente historico : listahistorico)
		{
			if(historico.getId_cliente() == id)
			{
				historico.show();
			}
		}
		
	}
	public static boolean RemoverHistorico(int id)
	{
		for(HistoricoCliente HC : listahistorico)
		{
			if(id == HC.getId())
			{
				HistoricoClienteDAO.listahistorico.remove(HC);
				return true;
			}
		}
		return false;
	}
	public static HistoricoCliente GetHistorico(int id)
	{
		for(HistoricoCliente HC : listahistorico)
		{
			if(id == HC.getId())
			{
				return HC;
			}
		}
		return null;
	}
	public static void Incrementar()
	{
		for(HistoricoCliente HC : listahistorico)
		{
			HC.Incrementar();
		}
	}
	
}
