package view;

import java.util.Scanner;

import módulos.Promocao;

public class ViewCadastrarPromocao {
	Scanner leitura = new Scanner(System.in);
		int id;
		int id_preco;
		int id_endereco;
		int id_supermercado;
		int id_produto;
		
	Promocao promocao;
	
	 	public ViewCadastrarPromocao(){
	 		
	 	}

		public Promocao criar(){
			this.promocao = new Promocao(id, id_preco, id_endereco, id_supermercado, id_produto);
			
			System.out.print("Id");
			this.id = leitura.nextInt();
			
			System.out.print("Id preco:");
			this.id_preco=leitura.nextInt();	
		
			System.out.print("Id endereco:");
			this.id_endereco=leitura.nextInt();	
		
			System.out.print("Id supermercado:");
			this.id_supermercado=leitura.nextInt();	
		
			System.out.print("Id produto:");
			this.id_produto=leitura.nextInt();	
		
			return this.promocao;
		}


}
