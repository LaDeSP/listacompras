package módulos;

public class Cliente {
	private int id;
	private String Nome;
	private String Senha;
	private String Email;
	private int Listas[];
	
	public Cliente(String nome, String senha, String email) {
		id = 1;
		Nome = nome;
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

	public void show() {
		System.out.print("Nome: "+Nome+"\nSenha: "+Senha+"\nEmail: "+Email+"\nId: "+id+"\n");
		
	}
}