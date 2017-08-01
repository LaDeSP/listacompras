package view;

import view.MenuPrincipal;
import java.util.Scanner;
import controller.*;
import modelo.Produto;

public class ShowEnum {
	
	Scanner ler = new Scanner(System.in);
	
	AdministradorDAO administradorDAO = new AdministradorDAO();
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	LocalDAO localDAO = new LocalDAO();
	PrecoDAO precoDAO = new PrecoDAO();
	MasterDAO masterDAO = new MasterDAO();
	SupermercadoDAO supermercadoDAO = new SupermercadoDAO();
	HistoricoClienteDAO historicoDAO = new HistoricoClienteDAO();
	ListaDeProdutosDAO listaDAO = new ListaDeProdutosDAO();
	ProdutoDAO produtoDAO = new ProdutoDAO();
	ViewLogin viewlogin = new ViewLogin();
	int id;
	
	public int showEnumMP() throws Exception {
		
		// TODO Auto-generated method stub
		
		for(MenuPrincipal copcao: MenuPrincipal.values()){
			System.out.printf("%s %s\n", copcao.codigo, copcao.nome);
		}
		
		int i = 0, y = 0; 
		
		y = ler.nextInt();
		
		while (i == 0){
			
			switch (y)
			{
				case 1: 
				{   
					listaDAO.Listar(i);
					break;
				}
				case 2: 
				{   
					promocaoDAO.listar();
					break;
				}
				case 3:
				{
					ViewClientes viewClientes = new ViewClientes();
					viewClientes.Criar();
					showEnumMC();
					break;

				}
				case 4:
				{
					showEnumML();
	                break;
				}
				case 0: {
					i = -1;
					break;
				}
				default: 
				{
					i = 0;
					System.out.println("\nOpção inválida!");
					break; 
				}
			 }
		  }
		return i;  
	   }
	
	public int showEnumML() throws Exception{
		
		for(MenuLogin copcao: MenuLogin.values()){
			System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
	 	}
		int i = 0, y = 0, x = 0;
		
		while(i == 0)
		{
			
			y = ler.nextInt();
			
			switch(y)
			{
				case 1:
				{
					id = viewlogin.ViewloginCliente();
					//System.out.println("ID: "+id);
				
					if(id != 0)
					{
						x = 1;
						System.out.println("\n\nID -> "+id+"  Entrou");
						showEnumMC();
					}
					else
					{
						System.out.println("\nCliente não existe!\n\n1 Tentar Novamente\n0 Voltar");
					}
					break;
				}
				case 2:
				{
					id = viewlogin.ViewloginADM(administradorDAO);
					if(id != 0)
					{
						x = 2;
					}
					break;
				}
				case 3:
				{
					id = viewlogin.ViewloginMaster(masterDAO);
					if(id != 0)
					{
						x = 3;
					}
					break;
				}
				case 0:
				{
					i = -1;
					showEnumMP();
					break;
				}
				default:
				{
				  System.out.println("Opção inválida!");
				}
			}
		}
		return i;

		}
	

	public int showEnumMC() throws Exception
	{
		
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		ViewClientes viewclientes = new ViewClientes();
		
		int i = 0, y = 0;
		
		//System.out.println(id);
		//ClienteDAO.listar();
		System.out.println("Bem Vindo!!");// "+ClienteDAO.GetCliente(id).getNome());
		
		for(MenuCliente copcao: MenuCliente.values()){
			System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
	 	}
		
		while(i == 0)
		{	
			y = ler.nextInt();
			
			switch(y)
			{
				case 1:
				{
					showEnumMPro(produtoDAO);
					break;
				}
				case 2:
				{
					showEnumMPromo();
					break;
				}
				case 3:
				{
					viewsupermercado.Menu(supermercadoDAO, localDAO);
					break;
				}
				case 4:
				{    
					showEnumSMC();
					// era listar alguma coisa viewclientes.MenuCliente(id, promocaoDAO);
					break;
				}
				case 0: 
				{
					System.out.println("\nAté logo !!");//+ClienteDAO.GetCliente(id).getNome()+"!!");
					i = -1;
					showEnumMP();
					break;
				}
				
			}
		}
		return i;
		}
	
	public int showEnumSMC(){
		
		int i = 0, y = 0;
		
		for(SubMenuC copcao: SubMenuC.values()){
			System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
	 	}
		
		while(i == 0)
		{	
			y = ler.nextInt();
			
			switch(y)
			{
			
				case 1:
				{
					ViewClientes.Alterar_Nome(id);
					break;
				}
				case 2:
				{
					ViewClientes.Alterar_Email(id);;
					break;
				}
				case 3:
				{
					ViewClientes.Alterar_Senha(id);;
					break;
				} 
				case 0: 
				{
					i = -1; 
					break; 
			    }
			  }
		  }
		return i;
	   }
	
	
	public int showEnumMPro(ProdutoDAO produtoDAO)
	{   
		boolean flag; 
		
	    int y = 0, i = 0;
		
		ViewProdutos viewprodutos = new ViewProdutos();
	//	ViewPromocoes viewprecos = new ViewPrecos();
		ViewSupermercado viewsupermercado = new ViewSupermercado();
		
		//if (flag = true){
		//	viewsupermercado.showAndSet(localDAO);
		//}
		
		
		for(MenuProduto copcao: MenuProduto.values()){
			System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
	 	}
		
		while(i == 0)
		{	
			y = ler.nextInt();
			
			switch(y)
			{
				case 1:
				{
					int id_Cliente = 0;
					ViewProdutos.Criar(id_Cliente);
					//de onde veio esse localDAO
					viewsupermercado.showAndSet(localDAO);
					//Produto produto = produtoDAO.getLastProduto();
					break;
				}
				case 2:
				{
					ViewProdutos.Listar();
					//produtoDAO.listarProdutos();
					break;
				}
				case 0:
				{
					i = -1;
					break;
						
				}
			}
		}
		return i;
      }
	
	public int showEnumMPromo(){
	
	int y = 0, i = 0;
	
	for(MenuPromo copcao: MenuPromo.values()){
		System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
 	}
	
	while(i == 0)
	{	
		y = ler.nextInt();
		
	switch(y)
	{
		//A primeira op��o est� escrito inserir promo��o, a terceira op��o est� escrito criar promo��o, est� meio redundante
		case 1:
		{
			ViewPromocoes.InicioCriar(id);
			break;
		}
		case 2:
		{
			PromocaoDAO.listar();
			break;
		}
		case 3:
		{
			//precoDAO.criarPreco(i, false, i, i, i);
		}
		case 0:
		{
			i = -1;
			break;
				
	   	}
     }
    }
	return i;
   }
}

	
