package view;

import java.io.File;
import java.util.Scanner;

import controller.*;

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
		MasterDAO.criarPrimeiro();
	}
	
	public void LerArquivo() throws ClassNotFoundException
	{
		File f = new File(Constantes.LocalDs);
		if(f.exists())
		{
			LocalDAO.lerArquivo();
		}
		f = new File(Constantes.AdministradorDs);
		if(f.exists())
		{
			AdministradorDAO.lerArquivo();
		}
		f = new File(Constantes.ClienteDs);
		if(f.exists())
		{
			ClienteDAO.lerArquivo();
		}
		f = new File(Constantes.HistoricoCDs);
		if(f.exists())
		{
			HistoricoClienteDAO.lerArquivo();
		}
		f = new File(Constantes.ListaDeProdutoDs);
		if(f.exists())
		{
			ListaDeProdutosDAO.lerArquivo();
		}
		f = new File(Constantes.MasterDs);
		if(f.exists())
		{
			MasterDAO.lerArquivo();
		}
		
		f = new File(Constantes.PrecoDs);
		if(f.exists())
		{
			PrecoDAO.lerArquivo();
		}
		f = new File(Constantes.ProdutoDs);
		if(f.exists())
		{
			ProdutoDAO.lerArquivo();
		}
		f = new File(Constantes.PromocaoDs);
		if(f.exists())
		{
			PromocaoDAO.lerArquivo();
		}
	}
	
	public void EscreverArquivo() throws ClassNotFoundException
	{
		ProdutoDAO.Escrever();
		ClienteDAO.Escrever();
		AdministradorDAO.Escrever();
		PromocaoDAO.Escrever();
		PrecoDAO.Escrever();
		MasterDAO.Escrever();
		SupermercadoDAO.EscreverArquivo();
		HistoricoClienteDAO.Escrever();
		ListaDeProdutosDAO.Escrever();
		LocalDAO.Escrever();
	}
	
	public int TelaLogin() throws Exception
	{
		return id;
		
		
	}
	
		ViewLogin view = new ViewLogin();
		/*int i = 0, x = 0;
		while(x == 0)
		{
			System.out.println("Sign in\n   1 - Cliente\n   2 - Administrador\n   3 - Master\n");
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
				default: {
					System.out.println("Opção inválida, tente de novo!");
				}
			}
			System.out.print("\n");
		}
		return x;
	}*/

}