package módulos;

public class Supermercado {
   
	private int id;
	private String nome;
	private int id_local;
	
	public Supermercado(int id, String nome, int id_local) {
		this.id = id;
		this.nome = nome;
		this.id_local = id_local;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_local() {
		return id_local;
	}
	
	public void setId_local(int id_local) {
		this.id_local = id_local;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Dados do Supermercado");
		System.out.println(this.nome+"\n"+this.id_local);
		
	}

}
