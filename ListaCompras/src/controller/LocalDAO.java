package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Local;


public class LocalDAO extends DAO{
	private static List<Local> listadeLocal = new ArrayList<Local>();
	static Local local = null;
	//FileOutputStream fos= new FileOutputStream("LocalDAO");//criar serialização. Salvar e ler dados. Output e input Stream 
	//ObjectOutputStream oos= new ObjectOutputStream(fos);
	
	public static boolean criar(String cEP, String cidade, String estado, String Rua) {
		
		local = new Local(cEP, cidade, estado, Rua);
		if(local != null)
		{
			LocalDAO.listadeLocal.add(local);
			System.out.println("\nLocal criado com sucesso");
			return true;
		}
		return false;
	}
	
	public static void Escrever()
	{
		Escrever(Constantes.LocalDs, listadeLocal);
	}
	
	public static boolean lerArquivo() throws ClassNotFoundException
	{
		listadeLocal = (List<Local>) Ler(Constantes.LocalDs, listadeLocal);
		return true;
	}
	 

	public static Local getLastLocal(){
		return local;
	}
	/**
	 * @return the listadeProdutos
	 */
	public static List<Local> getListadeLocal() {
		return listadeLocal;
	}
	/**
	 * @param listadeProdutos the listadeProdutos to set
	 */
	
	public static void setListadeLocal(List<Local> listadeLocal) {
		LocalDAO.listadeLocal = listadeLocal;
	}
	
	public static void listar(){
		for (Local local : listadeLocal) {
			local.show();
		}
	}
	public static boolean OKLocal(String CEP)
	{
		for(Local local : listadeLocal)
		{
			if(CEP.equals(local.getCEP()))
			{
				return true;
			}
		}
		return false;
		
	}
	public static Local GetLocal(String CEP)
	{
		for(Local local : listadeLocal)
		{
			if(CEP.equals(local.getCEP()))
			{
				return local;
			}
		}
		return null;
		
	}
	public static boolean OKId(int id){
		for(Local local:listadeLocal){
			if(id==local.getId()){
				return true;
			}
		}
		return false;
	}

}
