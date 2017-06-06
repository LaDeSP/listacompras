package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Supermercado;
import view.ViewSupermercado;


public class SupermercadoDAO {
	private static List<Supermercado> listadeSupermercados = new ArrayList<Supermercado>();
	Supermercado supermercado = null;
	public void criar(LocalDAO localDAO) {
		ViewSupermercado vCP = new ViewSupermercado();
		this.supermercado = vCP.showAndSet(localDAO);
		SupermercadoDAO.listadeSupermercados.add(this.supermercado);
	}
	public Supermercado getLastSupermercado(){
		return this.supermercado;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Supermercado> getListadeSupermercados() {
		return listadeSupermercados;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	
	public static void setListadeSupermercados(List<Supermercado> listadeSupermercados) {
		SupermercadoDAO.listadeSupermercados = listadeSupermercados;
	}
	
	public void listar(){
		for (Supermercado supermercado : listadeSupermercados) {
			supermercado.show();
		}
	}
	
	public boolean OKSupermercado(String Nome)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(Nome.equals(supermercado.getNome()))
			{
				return true;
			}
		}
		return false;
		
	}
	public Supermercado GetSupermercado(String Nome)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(Nome.equals(supermercado.getNome()))
			{
				return supermercado;
			}
		}
		return null;
		
	}
	public Supermercado GetSupermercado(int id)
	{
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(id == supermercado.getId())
			{
				return supermercado;
			}
		}
		return null;
		
	}
	public void RemoveSupermercado(int id)
	{
		System.out.print("Entrou\n");
		for(Supermercado supermercado : listadeSupermercados)
		{
			if(id == supermercado.getId())
			{
				SupermercadoDAO.listadeSupermercados.remove(supermercado);
				return ;
			}
		}
	}
	

}
