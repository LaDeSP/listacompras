/**
 * 
 */
package view;

import java.util.Scanner;

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
	
	private final String codigo1; 
	private final String nome1; 

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
	
public int showEnum() throws Exception {
	// TODO Auto-generated method stub
	for(MenuLogin copcao: MenuLogin.values()){
		System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
 	}
  }
}
	