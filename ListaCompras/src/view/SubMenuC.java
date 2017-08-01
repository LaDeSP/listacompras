package view;

public enum SubMenuC {
	altnome("1", "Alterar nome"),
	altemail("2", "Alterar email"),
	altsenha("2", "Alterar senha"),
	sair("0", "Voltar");
	
	final String codigo1; 
	final String nome1; 

	SubMenuC(String opcao, String name){
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
