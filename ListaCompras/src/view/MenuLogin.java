/**
 * 
 */
package view;

import controller.PromocaoDAO;

/**
 * @author lui
 *
 */

public enum MenuLogin{ 
	logincliente("1", "Cliente"),
	loginadm("2", "Administrador"),
	loginmaster("3", "Master"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuLogin(String opcao, String name){
		codigo1 = opcao; 	
	    nome1 = name;
	    
	    }
	
	public String getCodigo(){
		return codigo1;
      }
	public String getNome(){
		return nome1;
      }
}
