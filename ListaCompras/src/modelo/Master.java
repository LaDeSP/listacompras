package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Master implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String senha;
	private String email;
	//private int id_supermercado;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Master(String senha, String email) {
	this.senha = senha;
	this.email = email;
	//this.id_supermercado = id_supermercado;
	id = count.incrementAndGet();
	}
	public void Incrementar()
	{
		count.incrementAndGet();
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

	public void show() {
		System.out.println("Email : "+email+"   Senha: "+ senha);
		
	}
	
}