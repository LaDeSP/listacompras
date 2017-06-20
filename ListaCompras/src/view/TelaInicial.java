package view;

import java.io.File;
import java.util.Scanner;

import controller.*;
import modelo.Local;

public class TelaInicial {
	Scanner ler = new Scanner(System.in);
	ProdutoDAO produtoDAO = new ProdutoDAO();

	AdministradorDAO administradorDAO = new AdministradorDAO();
	PromocaoDAO promocaoDAO = new PromocaoDAO();
	LocalDAO localDAO = new LocalDAO();
	PrecoDAO precoDAO = new PrecoDAO();
	MasterDAO masterDAO = new MasterDAO();
	SupermercadoDAO supermercadoDAO = new SupermercadoDAO();
	HistoricoClienteDAO historicoDAO = new HistoricoClienteDAO();
	ListaDeProdutosDAO listaDAO = new ListaDeProdutosDAO();
	int id; // id de quem está logado
	
	public TelaInicial(){
		masterDAO.criarPrimeiro();
	}
	
	public void LerArquivo() throws ClassNotFoundException
	{
		File f = new File(Constantes.LocalDs);
		if(f.exists())
		{
			localDAO.lerArquivo();
		}
		f = new File(Constantes.AdministradorDs);
		if(f.exists())
		{
			administradorDAO.lerArquivo();
		}
		f = new File(Constantes.ClienteDs);
		if(f.exists())
		{
			ClienteDAO.lerArquivo();
		}
		f = new File(Constantes.HistoricoCDs);
		if(f.exists())
		{
			historicoDAO.lerArquivo();
		}
		f = new File(Constantes.ListaDeProdutoDs);
		if(f.exists())
		{
			listaDAO.lerArquivo();
		}
		f = new File(Constantes.MasterDs);
		if(f.exists())
		{
			masterDAO.lerArquivo();
		}
		
		f = new File(Constantes.PrecoDs);
		if(f.exists())
		{
			precoDAO.lerArquivo();
		}
		f = new File(Constantes.ProdutoDs);
		if(f.exists())
		{
			produtoDAO.lerArquivo();
		}
		f = new File(Constantes.PromocaoDs);
		if(f.exists())
		{
			promocaoDAO.lerArquivo();
		}
	}
	
	public void EscreverArquivo() throws ClassNotFoundException
	{
		produtoDAO.Escrever();
		ClienteDAO.Escrever();
		administradorDAO.Escrever();
		promocaoDAO.Escrever();
		precoDAO.Escrever();
		masterDAO.Escrever();
		supermercadoDAO.EscreverArquivo();
		historicoDAO.Escrever();
		listaDAO.Escrever();
		localDAO.Escrever();
	}
	
	public void MenuCliente() throws ClassNotFoundException
	{
		ViewProdutos viewprodutos = new ViewProdutos();
		ViewPromocoes viewpromocoes = new ViewPromocoes();
		ViewSupermercados viewsupermercado = new ViewSupermercados();
		ViewClientes viewclientes = new ViewClientes();
		int i = 1;
		System.out.println("Bem Vindo!! "+ClienteDAO.GetCliente(id).getNome());
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
					viewclientes.MenuCliente(id, promocaoDAO);
					break;
				}
				case 0: 
				{
					i = 0;
					System.out.println("\nAt� logo "+ClienteDAO.GetCliente(id).getNome()+"!!");
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
					viewclientes.MenuMaster();
					break;
				}
				case 5:
				{
					viewadms.MenuMaster(administradorDAO);
					break;
				}
				case 0: {
					i = 0;
					System.out.println("\nAté logo Master!!");
					break;
				}
			}
		}
	}
	
	public void MenuUsuario() throws Exception
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
					ViewClientes viewClientes = new ViewClientes();
					viewClientes.cadastrar();
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
	
	public void Antesdoinicial(int x) throws Exception
	{
		//localDAO.lerArquivo();
		//supermercadoDAO.lerArquivo();
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
	
	public int TelaLogin() throws Exception
	{
		ViewLogin view = new ViewLogin();
		int i = 0, x = 0;
		while(x == 0)
		{
			System.out.println("Sign in\n   1 - Cliente\n   2 - Administrador\n   3 - Master\n   4 - Entrar sem cadastro\nSign up\n   5 - Criar Cliente\n0 - Sair");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					id = view.ViewloginCliente();
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
					ViewClientes viewClientes = new ViewClientes();
					viewClientes.cadastrar();
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

}
