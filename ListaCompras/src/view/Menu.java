package view;

import java.util.Scanner;

import controller.*;


public class Menu{
	
	Scanner ler = new Scanner(System.in);
	
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	
	
	
	int id; // id de quem está logado

	public int Menu () throws Exception{
		
		int x = 0, y = 0;
        
		TelaInicial telainicial = new TelaInicial();
		while(x == 0){
			System.out.println("\n\nBem Vindo!! O que deseja fazer?\n   1 - Ver Promoções\n   2 - Cadastrar\n   3 - Fazer login\n   0 - Sair");

			y = ler.nextInt(); 

			switch(y)
			{
			case 1:
			{
				promocaoDAO.listar();
				x = 0;
				break;
				
			}
			case 2:
			{
				ViewClientes viewClientes = new ViewClientes();
				viewClientes.cadastrar();
				telainicial.TelaLogin();
				x = -1;
				break;

			}
			case 3: {
				//telainicial.TelaLogin();
				x = -1;
                break;
			 }
			case 0: {
				x = -1;
				break;
			}
			default: 
			{
				x = 0;
				System.out.println("\nN tem opcao demo");
				break; 
		    }
			} 
		}
		return x; 
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
		   }
		  }
	      }*/
        }


	
