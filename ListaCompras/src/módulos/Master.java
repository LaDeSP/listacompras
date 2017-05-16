package módulos;

public class Master {
	
	private String senha;
	private String email;
	private int id_supermercado;
	
	public Master(String senha, String email, int id_supermercado) {
	this.senha = senha;
	this.email = email;
	this.id_supermercado = id_supermercado;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId_supermercado() {
		return id_supermercado;
	}
	public void setId_supermercado(int id_supermercado) {
		this.id_supermercado = id_supermercado;
	}

}