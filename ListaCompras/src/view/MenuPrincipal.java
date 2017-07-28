/**
 * 
 */
package view;

import java.util.Scanner;
import view.MenuLogin;
import controller.PromocaoDAO;

/**
 * @author lui
 *
 */
public enum MenuPrincipal{
      produtos("1", "Ver Produtos"),
	  promocoes("2", "Ver Promoções"),
	  cadastro("3", "Cadastrar"),
	  login("4", "Fazer Login"),
	  sair("0", "Sair");

   final String codigo; 
   final String nome; 

   MenuPrincipal(String opcao, String name){

	codigo = opcao; 	
	nome = name;
	
}

public String getCodigo(){
	return codigo;
}
public String getNome(){
  return nome;
}

}
	