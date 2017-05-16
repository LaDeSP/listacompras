package módulos;

public class ADM {
	private String Senha;
	private String Email;
	private int Id_supermercado;
	
	public ADM(String senha, String email, int id_supermercado) {
		Senha = senha;
		Email = email;
		Id_supermercado = id_supermercado;
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