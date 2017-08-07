package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Supermercado implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private int id_local;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Supermercado(String nome, int id_local) {
		id = count.incrementAndGet();
		this.nome = nome;
		this.id_local = id_local;
	}
	public void Incrementar()
	{
		count.incrementAndGet();
	}

	public Supermercado() {
		id = count.incrementAndGet();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_local() {
		return id_local;
	}
	
	public void setId_local(int id_local) {
		this.id_local = id_local;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Dados do Supermercado");
		System.out.println(id+"\n"+this.nome+"\n"+this.id_local);
		
	}

}
