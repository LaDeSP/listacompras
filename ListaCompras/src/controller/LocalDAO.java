package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Local;
import view.ViewCadastrarLocal;


public class LocalDAO extends DAO{
	private static List<Local> listadeLocal = new ArrayList<Local>();
	Local local = null;
	//FileOutputStream fos= new FileOutputStream("LocalDAO");//criar serialização. Salvar e ler dados. Output e input Stream 
	//ObjectOutputStream oos= new ObjectOutputStream(fos);
	
	public Local criar() {
		ViewCadastrarLocal vCP = new ViewCadastrarLocal();
		this.local = vCP.showAndSet();
		if(local != null)
		{
			LocalDAO.listadeLocal.add(this.local);
			System.out.println("\nLocal criado com sucesso");
		}
		return local;
	}
	
	public void Escrever()
	{
		Escrever(Constantes.LocalDs, listadeLocal);
	}
	
	public boolean lerArquivo() throws ClassNotFoundException
	{
		this.listadeLocal = (List<Local>) Ler(Constantes.LocalDs, listadeLocal);
		return true;
	}
	 

	public Local getLastLocal(){
		return this.local;
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
	
	public void listar(){
		for (Local local : listadeLocal) {
			local.show();
		}
	}
	public boolean OKLocal(String CEP)
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
	public Local GetLocal(String CEP)
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

}
