package controller;

import modelo.Local;

import java.util.ArrayList;
import java.util.List;

public class LocalDAO extends DAO{
	private static List<Local> listadeLocal = new ArrayList<Local>();
	static Local local = null;
	//FileOutputStream fos= new FileOutputStream("LocalDAO");//criar serialização. Salvar e ler dados. Output e input Stream 
	//ObjectOutputStream oos= new ObjectOutputStream(fos);
    public static boolean verificaCEP(String cep) {
        String padrao = "^\\d{5}-\\d{3}%";


        if (cep.matches(padrao)) {
            return true;
        } else {
            return false;
        }
    }

	public static Local criar(String cEP, String cidade, String estado, String Rua) {

        if (!OKLocal(cEP, cidade, estado, Rua)) { //verifica se o local já existe

            local = new Local(cEP, cidade, estado, Rua);
            if (local != null) {
                LocalDAO.listadeLocal.add(local);
                return local;
            } else {
                return null;
            }
        }
        return null;
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

    public static boolean OKLocal(String CEP, String cidade, String estado, String rua) {
        for (Local local : listadeLocal) {
            if (CEP.equals(local.getCEP()) && cidade.equals(local.getCidade()) && estado.equals(local.getEstado()) && rua.equals(local.getRua())) {
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

    public static boolean RemoverLocal(String CEP) {
        //VERIFICA SE EXISTE CEP
        if (OKLocal(CEP)) {
            for (Local local : listadeLocal) {
                if (CEP.equals(local.getCEP())) {
                    LocalDAO.listadeLocal.remove(local);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Renomear_Cidade(String cidade, String CEP) {

        Local local = GetLocal(CEP);
        if (local != null) {
            local.setCidade(cidade);
            return true;
        } else {
            return false;
        }
    }

    public static boolean Renomear_Estado(String estado, String CEP) {
        Local local = GetLocal(CEP);
        if (local != null) {
            local.setEstado(estado);
            return true;
        } else {
            return false;
        }
    }

    public static boolean Renomear_Rua(String rua, String CEP) {
        Local local = GetLocal(CEP);
        if (local != null) {
            local.setRua(rua);
            return true;
        } else {
            return false;
        }
    }
    
    public static void Incrementar()
    {
    	for(Local local : listadeLocal)
    	{
			local.Incrementar();
		}
    }

}
