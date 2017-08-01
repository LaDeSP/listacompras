package view;

public enum MenuADMs{ 
	produtos("1", "Produtos"),
	promocoes("2", "Promoções"),
	supermercado("3", "Supermercados"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuADMs(String opcao, String name){
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

