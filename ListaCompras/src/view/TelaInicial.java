package view;

import java.util.Scanner;

import controller.*;

public class TelaInicial {
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
	int id; // id de quem está logado
	
	public TelaInicial(){
		masterDAO.criarPrimeiro();
	}
	public void MenuCliente()
	{
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		ViewClientes viewclientes = new ViewClientes();
		int i = 1;
		System.out.println("Bem Vindo!! "+clienteDAO.GetCliente(id).getNome());
		while(i != 0)
		{
			System.out.println("1 - Produto\n2 - Promoções\n3 - Supermercado\n4 - Clientes\n0 - Sair");
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
					viewclientes.MenuCliente(clienteDAO, id, promocaoDAO);
					break;
				}
				case 0: {
					i = 0;
					System.out.println("\nAt� logo "+clienteDAO.GetCliente(id).getNome()+"!!");
					break;
				}
				
			}
		}
	}
	
	public void MenuADM()
	{
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		int i = 1;
		System.out.println("Bem Vindo!! "+administradorDAO.GetAdm(id).getNome());
		while(i != 0)
		{
			System.out.println("1 - Produto\n2 - Promoções\n3 - Supermercado\n0 - Sair");
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
					viewpromocoes.menuADMMaster(precoDAO, promocaoDAO, id, supermercadoDAO, produtoDAO);
					break;
				}
				case 3:
				{
					viewsupermercado.Menu(supermercadoDAO, localDAO);
					break;
				}
				case 0: {
					i = 0;
					System.out.println("\nAt� logo "+administradorDAO.GetAdm(id).getNome()+"!!");
					break;
				}

			}
		}
	}

	public void MenuMaster()
	{
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		ViewClientes viewclientes = new ViewClientes();
		ViewADMs viewadms = new ViewADMs();
		int i = 1;
		System.out.println("Bem Vindo!! Master");
		while(i != 0)
		{
			System.out.println("1 - Produto\n2 - Promoções\n3 - Supermercado\n4 - Clientes\n5 - Administradores\n0 - Sair");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					viewprodutos.MenuMaster(produtoDAO);
					break;
				}
				case 2:
				{
					viewpromocoes.menuADMMaster(precoDAO, promocaoDAO, id, supermercadoDAO, produtoDAO);
					break;
				}
				case 3:
				{
					viewsupermercado.Menu(supermercadoDAO, localDAO);
					break;
				}
				case 4:
				{
					viewclientes.MenuMaster(clienteDAO);
					break;
				}
				case 5:
				{
					viewadms.MenuMaster(administradorDAO);
					break;
				}
				case 0: {
					i = 0;
					System.out.println("\nAt� logo Master!!");
					break;
				}
			}
		}
	}
	
	public void MenuUsuario()
	{
		int i = 1;
		System.out.println("Bem Vindo!!");
		while(i != 0)
		{
			System.out.println("1 - Cadastrar\n2 - Ver Promoções\n0 - Sair");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					clienteDAO.criarCliente();
					break;
				}
				case 2:
				{
					promocaoDAO.listar();
					break;
				}
				case 0: {
					i = 0;
					System.out.println("\nAt� logo!!");
					break;
				}
			}
		}
	}
	
	public void Antesdoinicial(int x)
	{
		if(x == 1)
		{
			MenuCliente();
		}
		if(x == 2)
		{
			MenuADM();
		}
		if(x == 3)
		{
			MenuMaster();
		}
		if(x == 4)
		{
			MenuUsuario();
		}
		
	}
	
	public int TelaLogin()
	{
		ViewLogin view = new ViewLogin();
		int i = 0, x = 0;
		while(x == 0)
		{
			System.out.println("Sign in\n   1 - Cliente\n   2 - Administrador\n   3 - Master\n   4 - Entrar sem cadastro\nSign up\n   5 - Criar Cliente");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					id = view.ViewloginCliente(clienteDAO);
					if(id != 0)
					{
						x = 1;
					}
					break;
				}
				case 2:
				{
					id = view.ViewloginADM(administradorDAO);
					if(id != 0)
					{
						x = 2;
					}
					break;
				}
				case 3:
				{
					id = view.ViewloginMaster(masterDAO);
					if(id != 0)
					{
						x = 3;
					}
					break;
				}
				case 4:
				{
					x = 4;
					break;
				}
				case 5:
				{
					clienteDAO.criarCliente();
					break;
				}
			}
			System.out.print("\n");
		}
		return x;
	}

}
