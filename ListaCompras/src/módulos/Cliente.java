package módulos;

public class Cliente {
	private String Senha;
	private String Email;
	private int Listas[];
	
	public Cliente(String senha, String email) {
		Senha = senha;
		Email = email;
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

	public int[] getListas() {
		return Listas;
	}

	public void setListas(int[] listas) {
		Listas = listas;
	}
}