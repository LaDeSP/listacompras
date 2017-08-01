package view;

import java.util.Scanner;

import controller.HistoricoPromocaoDAO;

public class ViewHistoricoPromocao {
	static Scanner ler = new Scanner(System.in); 
	
	public static void Listar(int Id_Cliente)
	{
		HistoricoPromocaoDAO.Listar(Id_Cliente);
	}
	public static void Listar()
	{
		HistoricoPromocaoDAO.Listar();
	}
	public static void Excluir()
	{
		HistoricoPromocaoDAO.Listar();
		int id;
		id = ler.nextInt(); ler.nextLine();
		if(HistoricoPromocaoDAO.RemoverHistorico(id))
		{
			System.out.println("Historico removido com sucesso");
		}
		else
		{
			System.out.println("Erro ao excluir historico");
		}
	}

}
