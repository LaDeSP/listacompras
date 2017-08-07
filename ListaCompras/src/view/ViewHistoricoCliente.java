package view;

import java.util.Scanner;

import controller.HistoricoClienteDAO;


public class ViewHistoricoCliente {
    static Scanner ler = new Scanner(System.in); 
	
	public static void Listar()//master ver o historico de todos os clientes
	{
		HistoricoClienteDAO.Listar();
	}
	public static void Listar(int id)//O cliente conseguir ver o seu historico
	{
		HistoricoClienteDAO.Listar(id);
	}
	
	public static void Excluir()
	{
		HistoricoClienteDAO.Listar();
		int id;
		id = ler.nextInt(); ler.nextLine();
		if(HistoricoClienteDAO.RemoverHistorico(id))
		{
			System.out.println("Historico removido com sucesso");
		}
		else
		{
			System.out.println("Erro ao excluir historico");
		}
	}
	
}