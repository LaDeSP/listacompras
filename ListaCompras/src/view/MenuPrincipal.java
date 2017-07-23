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
      promocoes("1", "Ver Promoções"),
	  cadastro("2", "Cadastrar"),
	  login("3", "Fazer Login"),
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

/*public int showEnum() throws Exception {
	// TODO Auto-generated method stub
	for(MenuPrincipal copcao: MenuPrincipal.values()){
		System.out.printf("%s %s\n", copcao.codigo, copcao.nome);
	}
	
    Scanner ler = new Scanner(System.in);
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	int w = 0, y = 0; 
	
	y = ler.nextInt();
	
	while (w == 0){
		switch (y)
		{
			case 1: 
			{
				promocaoDAO.listar();
				w = 0;
				break;
			}
			case 2:
			{
				ViewClientes viewClientes = new ViewClientes();
				viewClientes.cadastrar();
				//telainicial.TelaLogin();
				w = -1;
				break;

			}
			case 3:
			{
				//MenuLogin.
				//w = -1;
                break;
			}
			case 0: {
				w = -1;
				break;
			}
			default: 
			{
				w = 0;
				System.out.println("\nN tem opcao demo");
				break; 
			}
		 }
	  }
	return y;  
   }*/
}
	