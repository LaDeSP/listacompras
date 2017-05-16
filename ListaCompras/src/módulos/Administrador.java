package módulos;

public class ADM {
	private String Nome;
	private int id;
	private String Senha;
	private String Email;
	private int Id_supermercado;
	
	public ADM(String nome, int id, String senha, String email,
			int id_supermercado) {
		Nome = nome;
		this.id = id;
		Senha = senha;
		Email = email;
		Id_supermercado = id_supermercado;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getId_supermercado() {
		return Id_supermercado;
	}

	public void setId_supermercado(int id_supermercado) {
		Id_supermercado = id_supermercado;
	}
	
	

}