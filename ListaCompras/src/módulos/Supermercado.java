package módulos;

public class Supermercado {
   
	private int id;
	private string nome;
	private int id_local;
	
	public Supermercado(int id, string nome, int id_local) {
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

	public string getNome() {
		return nome;
	}

	public void setNome(string nome) {
		this.nome = nome;
	}

	public int getId_local() {
		return id_local;
	}
	
	public void setId_local(int id_local) {
		this.id_local = id_local;
	}
	

}
