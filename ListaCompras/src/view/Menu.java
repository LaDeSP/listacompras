package view;

import java.util.Scanner;

import controller.*;


public class Menu{
	
	Scanner ler = new Scanner(System.in);
	
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	
	
	
	int id; // id de quem está logado

	public int Menu (int x) throws Exception{
		
		int w = 0, y = 0, z = 0, v = 0;
        
		TelaInicial telainicial = new TelaInicial();
		return v;
	}	
	public enum menuprincipal{
          promocoes("1", "Ver Promoções"),
		  cadastro("2", "Cadastrar"),
		  login("3", "Fazer Login"),
		  sair("0", "Sair");
	
	private final String codigo; 
	private final String nome; 
	
	menuprincipal(String opcao, String name){
	 
		codigo = opcao; 	
		nome = name;
		
	}
	
	public String getCodigo(){
		return codigo;
	}
	public String getNome(){
	    return nome;
	}
   //colocar leitura
	}
	public int showEnum() {
		// TODO Auto-generated method stub
		for(menuprincipal copcao: menuprincipal.values())
    		System.out.printf("%s %s", copcao.codigo, copcao.nome);
		return -1;
	}
}
		/*
		while(w == 0){
			System.out.println("\n\nBem Vindo!! O que deseja fazer?\n   1 - Ver Promoções\n   2 - Cadastrar\n   3 - Fazer login\n   0 - Sair");

			y = ler.nextInt(); 

			switch(y)
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
				telainicial.TelaLogin();
				w = -1;
				break;

			}
			case 3: {
				telainicial.TelaLogin();
				w = -1;
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
		while(z == 0){
			switch(x){
			   case 1: { 
				   
			   }
			}
		}
	} 

	
	/*public void MenuAll()
	
    {
	   
			
		//	if(id != 0)
		//	{
			//	x = 1;
			//}
		
	 	
		   while(i1 != 0)
		  {
			System.out.println("1 - Produto\n2 - Promoções\n3 - Supermercado\n4 - Clientes");
			i1 = ler.nextInt();
			
			switch(i1)
			{
				case 1:
				{
					viewprodutos.Menu(produtoDAO);
					break;
				}
				case 2:
				{
					viewpromocoes.Menu(precoDAO, promocaoDAO, id, supermercadoDAO, produtoDAO);
					break;
				}
				case 3:
				{
					viewsupermercado.Menu(supermercadoDAO, localDAO);
					break;
				}
				case 4:
				{
					viewclientes.MenuCliente(clienteDAO, id, promocaoDAO);
					break;
				}
				default: {
					i1 = 0;	
					break;
				}
			  }
		   if (i == 2)
		   { 
			   System.out.println("teste!!");
	
*/

	
