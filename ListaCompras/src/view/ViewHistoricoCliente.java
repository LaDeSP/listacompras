package view;

import java.util.Scanner;

import controller.HistoricoClienteDAO;


public class ViewHistoricoCliente {
    static Scanner ler = new Scanner(System.in); 
	
	public static void Listar()
	{
		HistoricoClienteDAO.Listar();
	}
	public static void Listar(int id)
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