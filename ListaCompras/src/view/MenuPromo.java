package view;

public enum MenuPromo{ 
	
	novapromocao("1", "Nova Promoção"),
	listarpromocoes("2", "Listar Promoção"),
	criarpromocao("3", "Criar promoção"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuPromo(String opcao, String name){
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

	