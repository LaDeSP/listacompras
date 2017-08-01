package view;

public enum MenuSupermercados{ 
	
	novosupermercado("1", "Novo Supermercado"),
	listarsupermercados("2", "Listar Supermercados"),
	excluirsupermercados("3", "Excluir Supermercados"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuSupermercados(String opcao, String name){
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

