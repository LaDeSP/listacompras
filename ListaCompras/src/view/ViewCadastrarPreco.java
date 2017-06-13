package view;

import java.util.Scanner;

import controller.ProdutoDAO;
import controller.PromocaoDAO;
import controller.SupermercadoDAO;
import modelo.Preco;

public class ViewCadastrarPreco {
	Scanner entrada = new Scanner(System.in);
	int id_produto;
	boolean status;
	int id_supermercado;
	int id_cliente;
	double precoProduto;
	Preco preco;
	public ViewCadastrarPreco() {

	}
public Preco showAndSet(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		
		String Nome;
		this.preco = new Preco();
		produtoDAO.listarProdutos();
		if(produtoDAO.GetProduto(1) == null)
		{
			System.out.println("Não existe Produto");
			return null;
		}
		System.out.print("\nQual Produto:");
		this.preco.setId_produto(entrada.nextInt()); entrada.nextLine();

		this.preco.setStatus(true);
		
		//Buscar Supermercado
		if(supermercadoDAO.GetSupermercado(1) == null)
		{
			System.out.println("Não existe Supermercado");
			return null;
		}
		System.out.print("Supermercado:");
		Nome = entrada.nextLine();
		while(supermercadoDAO.GetSupermercado(Nome) == null){
			System.out.println("Digite Novamente: ");
			Nome = entrada.nextLine();
		}
		this.preco.setId_supermercado(supermercadoDAO.GetSupermercado(Nome).getId());
		
		this.preco.setId_cliente(id);
		
		System.out.print("Preço Produto:");
		this.preco.setPrecoProduto(entrada.nextDouble());	
		
		
		return this.preco;
		
	}
	public Preco showAndSetPromocao(ProdutoDAO produtoDAO, int id, SupermercadoDAO supermercadoDAO) {
		
		String Nome;
		this.preco = new Preco();
		produtoDAO.listarProdutos();
		if(produtoDAO.GetProduto(1) == null)
		{
			System.out.println("Não existe Produto");
			return null;
		}
		System.out.print("\nQual Produto:");
		this.preco.setId_produto(entrada.nextInt()); entrada.nextLine();

		this.preco.setStatus(true);
		
		//Buscar Supermercado
		if(supermercadoDAO.GetSupermercado(1) == null)
		{
			System.out.println("Não existe Supermercado");
			return null;
		}
		System.out.print("Supermercado:");
		Nome = entrada.nextLine();
		while(supermercadoDAO.GetSupermercado(Nome) == null){
			System.out.println("Digite Novamente: ");
			Nome = entrada.nextLine();
		}
		this.preco.setId_supermercado(supermercadoDAO.GetSupermercado(Nome).getId());
		
		this.preco.setId_cliente(id);
		
		System.out.print("Preço Produto:");
		this.preco.setPrecoProduto(entrada.nextDouble());
		
		//Criar Promocao
				PromocaoDAO promocaoDAO = new PromocaoDAO();
				promocaoDAO.criarPromocao(this.preco.getId());
		return this.preco;
		
	}

}
