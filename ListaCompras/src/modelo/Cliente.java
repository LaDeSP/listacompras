package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import controller.ListaDeProdutosDAO;

public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String Nome;
	private String Senha;
	private String Email;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Cliente(String nome, String senha, String email) {
		id = count.incrementAndGet();
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
	
	public int getId()
	{
		return id;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}


	public void setNome(String nome) {
		Nome = nome;
	}

	public void show() {
		
		System.out.print("Nome: "+Nome+"\nSenha: "+Senha+"\nEmail: "+Email+"\nId: "+id+"\n");
		
	}

	public String getNome() {
		return this.Nome;
	}
}