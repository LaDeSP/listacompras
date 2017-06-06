package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Master {
	
	private int id;
	private String senha;
	private String email;
	private int id_supermercado;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Master(String senha, String email, int id_supermercado) {
	this.senha = senha;
	this.email = email;
	this.id_supermercado = id_supermercado;
	id = count.incrementAndGet();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void show() {
		System.out.println("Email : "+email+"   Senha: "+ senha);
		
	}
	
}