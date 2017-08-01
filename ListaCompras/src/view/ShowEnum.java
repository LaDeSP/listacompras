package view;

import view.MenuPrincipal;

import java.util.Calendar;
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
	ViewProdutos viewprodutos = new ViewProdutos();

	int id;


	// MENU PRINCIPAL

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
				ListaDeProdutosDAO.Listar(id);
				break;
			}
			case 2: 
			{   
				PromocaoDAO.listar();
				break;
			}
			case 3:
			{
				
				ViewClientes.Criar();
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
				System.out.println("\n\nOpção inválida!\n\n");
				showEnumMP();
				break; 
			}
			}
		}
		return i;  
	}

	//MENU LOGIN

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
				System.out.println("\nOpção inválida!");
				showEnumML();
				break; 
			}
			}
		}
		return i;

	}

	//MENU CLIENTE

	public int showEnumMC() throws Exception
	{
		ViewSupermercados viewsupermercados = new ViewSupermercados();
	
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
				viewsupermercados.criar();
				break;
			}
			case 4:
			{    
				showEnumSMC(id);
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
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumMC();
				break; 
			}
			}
		}
		return i;
	}

	//SUBMENU CLIENTE

	public int showEnumSMC(int id){

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
				ViewClientes.Alterar_Email(id);
				break;
			}
			case 3:
			{
				
				ViewClientes.Alterar_Senha(id);
				break;
			} 
			case 0: 
			{
				i = -1; 
				break; 
			}
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumSMC(id);
				break; 
			}
			}
		}
		return i;
	}

	//MENU PRODUTO

	public int showEnumMPro(ProdutoDAO produtoDAO)
	{   

		int y = 0, i = 0;

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
				ProdutoDAO.getLastProduto();
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
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumMPro(produtoDAO);
				break; 
			}
			}
		}
		return i;
	}

	//MENU PROMOÇÃO

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
			case 1:
			{
				double precoProduto = 0;
				int id_cliente = 0;
				int id_supermercado = 0;
				boolean status = false;
				int id_produto = 0;

				PrecoDAO.criarPreco(id_produto, status, id_supermercado, id_cliente, precoProduto);

				break;
			}
			case 2:
			{
				PromocaoDAO.listar();
				break;
			}
			case 3:
			{
				PrecoDAO.criarPreco(i, false, i, i, i);
			}
			case 0:
			{
				i = -1;
				break;

			}
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumMPromo();
				break; 
			}
		}
	}
	return i;
}

	//MENU ADMINISTRADOR

	public int showEnumMADMs(){

		int i = 0, y = 0;
		
		for(MenuADMs copcao: MenuADMs.values()){
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
				//viewsupermercado.Menu(supermercadoDAO, localDAO);
				break;
			}
			case 0: 
			{
				i = -1; 
				break; 
			}
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumMADMs();
				break; 
		    }
	    }
    }
  return i;
}

	//MENU SUPERMERCADOS

	public int showEnumMSPM(){

		int i = 0, y = 0, j;

		ViewSupermercados viewsupermercado = new ViewSupermercados();

		while(i == 0)
		{

			y = ler.nextInt();

			switch(y)
			{
			case 1:
			{
				viewsupermercado.criar();
				SupermercadoDAO.EscreverArquivo();
				break;
			}
			case 2:
			{
				SupermercadoDAO.listar();
				break;
			}
			case 3:
			{
				SupermercadoDAO.listar();
				System.out.print("Opção: ");
				j = ler.nextInt();
				SupermercadoDAO.RemoveSupermercado(j);
				break;
			}
			case 0:
			{
				i = -1;
				break;
			}
			default: 
			{
				System.out.println("\nOpção inválida!");
				showEnumMSPM();
				break; 
		    }
		} 
	 }
	return i;
   }
}

