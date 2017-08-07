package view;

public enum SubMenuSPM{ 
	
	altnomsupermercado("1", "Alterar nome de supermercado"),
	altlocal("2", "Alterar local"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	SubMenuSPM(String opcao, String name){
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
