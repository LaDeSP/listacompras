package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Produto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Nome;
	private int id;
	private String Marca;
	private float Preco;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	
	public Produto(String nome, String marca, float preco) {
		id = count.incrementAndGet();
		this.Nome = nome;
		this.Marca = marca;
		this.Preco=preco;
	}
	/**
	 * @param args
	 */
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public float getPreco() {
		return Preco;
	}
	public void setPreco(float preco) {
		Preco = preco;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id+"- "+this.Nome+" "+this.Marca);
		
	}
	
}
