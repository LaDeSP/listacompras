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
		//MasterDAO.criarPrimeiro();
	}
	
	public void LerArquivo() throws ClassNotFoundException
	{
		File f = new File(Constantes.LocalDs);
		if(f.exists())
		{
			LocalDAO.lerArquivo();
			LocalDAO.Incrementar();
		}
		f = new File(Constantes.AdministradorDs);
		if(f.exists())
		{
			AdministradorDAO.lerArquivo();
			AdministradorDAO.IncrementarID();
		}
		f = new File(Constantes.ClienteDs);
		if(f.exists())
		{
			ClienteDAO.lerArquivo();
			ClienteDAO.AtualizarID();
		}
		f = new File(Constantes.HistoricoCDs);
		if(f.exists())
		{
			HistoricoClienteDAO.LerArquivo();
			HistoricoClienteDAO.Incrementar();
		}
		f = new File(Constantes.ListaDeProdutoDs);
		if(f.exists())
		{
			ListaDeProdutosDAO.lerArquivo();
			ListaDeProdutosDAO.Incrementar();
		}
		f = new File(Constantes.MasterDs);
		if(f.exists())
		{
			MasterDAO.lerArquivo();
			MasterDAO.Incrementar();
		}
		
		f = new File(Constantes.PrecoDs);
		if(f.exists())
		{
			PrecoDAO.lerArquivo();
			PrecoDAO.Incrementar();
		}
		f = new File(Constantes.ProdutoDs);
		if(f.exists())
		{
			ProdutoDAO.lerArquivo();
			ProdutoDAO.AtualizarID();
		}
		f = new File(Constantes.PromocaoDs);
		if(f.exists())
		{
			PromocaoDAO.lerArquivo();
			PromocaoDAO.Incrementar();
		}
		f = new File(Constantes.SupermercadoDs);
		if(f.exists())
		{
			SupermercadoDAO.lerArquivo();
			SupermercadoDAO.Incrementar();
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

}