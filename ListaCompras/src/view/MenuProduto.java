/**
 * 
 */
package view;

/**
 * @author lui
 *
 */

public enum MenuProduto{ 
	novoproduto("1", "Novo Produto"),
	listarprodutos("2", "Listar Produtos"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuProduto(String opcao, String name){
		codigo1 = opcao; 	
	    nome1 = name;
	    
	    }
	
	public String getCodigo(){
		return codigo1;
      }
	public String getNome(){
		return nome1;
      }
}

