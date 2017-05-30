package módulos;

public class Administrador {
	private String Senha;
	private String Email;
	private int Id_supermercado;
	private String Nome;
	
	public Administrador(String Nome, String senha, String email, int id_supermercado) {
		Senha = senha;
		Email = email;
		Id_supermercado = id_supermercado;
		this.Nome = Nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
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

	public void show() {
		System.out.print("Nome: "+Nome+"\nSenha: "+Senha+"\nEmail: "+Email+"\nId: "+Id_supermercado+"\n");
		
	}	

}