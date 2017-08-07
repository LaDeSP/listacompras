package view;

public enum MenuMaster{ 
	listclientes("1", "Listar Clientes"),
	listadm("2", "Listar Administradores"),
	listmasters("3", "Listar Masters"),
	criaradm("4", "Criar administrador"),
	criarmaster("5", "Criar master"),
	exclientes("6", "Excluir clientes"),
	exadms("7", "Excluir administradores"),
	exmasters("8", "Excluir masters"),
	sair("0", "Sair");
	
	final String codigo1; 
	final String nome1; 

	MenuMaster(String opcao, String name){
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

