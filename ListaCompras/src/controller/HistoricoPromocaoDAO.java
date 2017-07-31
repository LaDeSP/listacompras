package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.HistoricoPromocao;



public class HistoricoPromocaoDAO extends DAO{
	private static List<HistoricoPromocao> listahistoricoP = new ArrayList<HistoricoPromocao>();
	
	public static boolean Criar(int Id_Promocao, int Id_Cliente)
	{
		HistoricoPromocao HP = new HistoricoPromocao(Id_Promocao, Id_Cliente);
		if(HP != null)
		{
			HistoricoPromocaoDAO.listahistoricoP.add(HP);
			return true;
		}
		return false;
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.HistoricoPs, listahistoricoP);
	}
	
	public static void LerArquivo()
	{
		HistoricoPromocaoDAO.listahistoricoP = (List<HistoricoPromocao>) Ler(Constantes.HistoricoPs, listahistoricoP);
	}
	
	public static void Listar(int Id_Cliente) 
	{
		for(HistoricoPromocao HP : listahistoricoP)
		{
			if(HP.getId_cliente() == Id_Cliente)
			{
				HP.show();
			}
		}
	}
	public static void Listar() 
	{
		for(HistoricoPromocao HP : listahistoricoP)
		{
				HP.show();
		}
	}
	public static boolean RemoverHistorico(int Id) 
	{
		for(HistoricoPromocao HP : listahistoricoP)
		{
			if(HP.getId() == Id)
			{
				listahistoricoP.remove(HP);
				return true;
			}
		}
		return false;
	}
}
