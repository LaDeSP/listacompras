package view;

import java.util.Scanner;

import controller.*;


public class Menu
{
	
	Scanner ler = new Scanner(System.in);
	ProdutoDAO produtoDAO = new ProdutoDAO();
	ClienteDAO clienteDAO = new ClienteDAO();
	AdministradorDAO administradorDAO = new AdministradorDAO();
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	LocalDAO localDAO = new LocalDAO();
	PrecoDAO precoDAO = new PrecoDAO();
	MasterDAO masterDAO = new MasterDAO();
	SupermercadoDAO supermercadoDAO = new SupermercadoDAO();
	HistoricoClienteDAO historicoDAO = new HistoricoClienteDAO();
	
	
	int id; // id de quem est� logado

	public Menu () throws Exception
	{
		
		int y = 1;
        
		TelaInicial telainicial = new TelaInicial();
		while(y != 0)
		{
			System.out.println("Bem Vindo!! O que deseja fazer?\n   1 - Ver Promo��es\n   2 - Cadastrar\n   3 - Fazer login\n   0 - Sair");

			y = ler.nextInt(); 

			switch(y)
			{
				case 1:
				{
					PromocaoDAO.listar();
					break;
				}
				case 2:
				{
					//ClienteDAO.criarCliente();
					break;

				}
				case 0: 
				{
					y = 0;
					System.out.println("\nAt� logo!!");
					break;
				}
				case 3: 
				{
					telainicial.TelaLogin();
					break;
				}

				default: 
				{
					y = 0;
					break;
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
			System.out.println("1 - Produto\n2 - Promo��es\n3 - Supermercado\n4 - Clientes");
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
			   System.out.println("cu de cabrito!!");
		   }
		  }
	      }*/
}


	