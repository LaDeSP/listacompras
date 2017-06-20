package controller;

import view.ViewCadastrarPromocao;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Promocao;


public class PromocaoDAO extends DAO{

	private static List<Promocao> listadePromocao = new ArrayList<Promocao>();
	private Promocao promocao = null;
	public PromocaoDAO(){
		
	}
	
	public void Escrever()
	{
		Escrever(Constantes.PromocaoDs, listadePromocao);
	}
	
	public boolean lerArquivo() throws ClassNotFoundException
	{
		this.listadePromocao = (List<Promocao>) Ler(Constantes.PromocaoDs, listadePromocao);
		return true;
	}
	
	public void criarPromocao(int id){
		ViewCadastrarPromocao vcap = new ViewCadastrarPromocao();
		this.promocao=vcap.criar(id);
		if(promocao != null)
		{
			PromocaoDAO.listadePromocao.add(this.promocao);
			System.out.println("\nPromo�o criada com sucesso");
		}
	}
	
	public Promocao getLastPromocao(){
		return this.promocao;
	}
	
	public static List<Promocao> getListadePromocao() {
		return listadePromocao;
	}
	
	public static void setListadePromocao(List<Promocao> listadePromocao) {
		PromocaoDAO.listadePromocao = listadePromocao;
	}
	
	public void listar(){
		for (Promocao promocao : listadePromocao) {
			promocao.show();
		}
		System.out.print("\n");
	}
	public Promocao GetPromocao(int x){
		int z = 1;
		for (Promocao promocao : listadePromocao) 
		{
			if(z == x)
			{
				return promocao;
			}
			z++;
		}
		return null;
	}
	public Promocao GetPromocaoPorId(int id){
		int z = 1;
		for (Promocao promocao : listadePromocao) 
		{
			if(id == promocao.getId())
			{
				return promocao;
			}
			z++;
		}
		return null;
	}
}