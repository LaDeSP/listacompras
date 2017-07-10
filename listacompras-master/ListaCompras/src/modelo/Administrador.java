package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Administrador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	private String Senha;
	private String Email;
	private int Id_supermercado;
	private String Nome;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Administrador(String Nome, String senha, String email, int id_supermercado) {
		Senha = senha;
		Email = email;
		Id_supermercado = id_supermercado;
		this.Nome = Nome;
		id = count.incrementAndGet();
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