package view;

import view.MenuPrincipal;
import java.util.Scanner;
import controller.*;

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
		
		PromocaoDAO promocaoDAO = new PromocaoDAO();
	
		
		int i = 0, y = 0; 
		
		y = ler.nextInt();
		
		while (i == 0){
			switch (y)
			{
				case 1: 
				{   System.out.printf("Prestando");
					//promocaoDAO.listar();
					i = 0;
					break;
				}
				case 2:
				{
					ViewClientes viewClientes = new ViewClientes();
					viewClientes.cadastrar();
					showEnumMC();
					break;

				}
				case 3:
				{
					showEnumML();
					//w = -1;
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
		int i = 0, x = 0;
		
		while(x == 0)
		{
			
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					id = viewlogin.ViewloginCliente();
				
					if(id != 0)
					{
						x = 1;
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
					x = -1;
					break;
				}
			}
			System.out.print("\n");
		}
		return x;

		}
	

	public int showEnumMC(){
		
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		ViewClientes viewclientes = new ViewClientes();
		
		int i = 1;
		
		System.out.println("Bem Vindo!! "+ClienteDAO.GetCliente(id).getNome());
		
		for(MenuCliente copcao: MenuCliente.values()){
			System.out.printf("%s %s\n", copcao.codigo1, copcao.nome1);
	 	}
		
		while(i != 0)
		{	
			i = ler.nextInt();
			
			switch(i)
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
					viewclientes.MenuCliente(id, promocaoDAO);
					break;
				}
				case 0: 
				{
					i = 0;
					System.out.println("\nAté logo "+ClienteDAO.GetCliente(id).getNome()+"!!");
					break;
				}
				
			}
		}
		return 0;
		}
	
       }
