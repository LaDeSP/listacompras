package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import controller.PromocaoDAO;

public class ViewPromocoes {
	static Scanner ler = new Scanner(System.in);
		
	
	public ViewPromocoes()
	{
		
	}
	public static void InicioCriar(int id)
	{
		ViewPreco.criar(id);
	}
	public void criar(int id_preco) {
		
		String dataI;
		Calendar inicio = new GregorianCalendar();
		Calendar fim = new GregorianCalendar();
		try {
			System.out.println("Inicio da promocao: ");
		    System.out.println("dd/MM/yyyy");
			dataI = ler.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
			inicio.setTime(df.parse(dataI));
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		try {
		    ler = new Scanner(System.in);
		    	    System.out.println("Fim da promocao: ");
		    	    System.out.println("dd/MM/yyyy");
	
			dataI = ler.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
			fim.setTime(df.parse(dataI));
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
		
    		 if(PromocaoDAO.criar(id_preco, inicio, fim))
    			 System.out.println("Promocao cadastrada com sucesso!");
    		 else
    			 System.out.println("Erro ao cadastrar promoção");
	}
	
	public void excluir()	{

		int id;
		PromocaoDAO.listar();
		System.out.print("ID da Promocao que deve ser excluido: ");
		id = ler.nextInt();
		while(PromocaoDAO.GetPromocaoPorId(id)==null)
		{
			System.out.print("Não existe uma promoção com esse ID");
			System.out.print("Digite o ID da promoção que deve ser excluido: ");
			id = ler.nextInt();
		}
		if(!PromocaoDAO.RemovePromocao(id))
		{
			System.out.print("Erro ao excluir promocao");
		}
		else
		{
			System.out.print("Promocao excluido com sucesso!!");
		}
	}
	
public static void alterar_Inicio(int id)
	{
		String dataI;
		Calendar inicio= new GregorianCalendar();
		
				System.out.print("Digite a nova Data: ");
				System.out.println("dd/MM/yyyy");
		
			dataI = ler.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
			try {
				inicio.setTime(df.parse(dataI));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		if(PromocaoDAO.Renomear_Inicio(inicio, id)) {
		System.out.println("Data inicio alterada com sucesso!!");
		}else {
			System.out.println("Erro ao alterar...");
		}
	}

public static void alterar_Fim(int id)
	{
		String dataI;
		Calendar fim= new GregorianCalendar();
		
				System.out.print("Digite a nova Data: ");
				System.out.println("dd/MM/yyyy");
		
			dataI = ler.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
			try {
				fim.setTime(df.parse(dataI));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		if(PromocaoDAO.Renomear_Fim(fim, id)) {
		System.out.println("Data inicio alterada com sucesso!!");
		}else {
			System.out.println("Erro ao alterar..");
		}
	}
	/*
	public void Menu(PrecoDAO precoDAO, PromocaoDAO promocaoDAO, int id, SupermercadoDAO supermercadoDAO, ProdutoDAO produtoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Nova PromoÃ§Ã£o\n   2 - Listar PromoÃ§Ãµes\n   3 - Criar Preço\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					criar();
					break;
				}
				case 2:
				{
					promocaoDAO.listar();
					break;
				}
				case 3:
				{
					precoDAO.criarPreco(produtoDAO, id, supermercadoDAO);
				}
				case 0:
				{
					i = 0;
					break;
						
				}
			}
		}
	}
	public void menuADMMaster(PrecoDAO precoDAO, PromocaoDAO promocaoDAO, int id, SupermercadoDAO supermercadoDAO, ProdutoDAO produtoDAO)
	{
		int i = 1;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Listar PromoÃ§Ãµes\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					promocaoDAO.listar();
					break;
				}
				case 0:
				{
					i = 0;
					break;
						
				}
			}
		}
	}
	*/
}
