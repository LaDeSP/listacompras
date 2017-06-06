package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Produto {
	private String Nome;
	private int id;
	private String Marca;
	private int Preco[];
	private static final AtomicInteger count = new AtomicInteger(0);
	
	
	public Produto() {
		super();
		id = count.incrementAndGet();
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
	public int[] getPreco() {
		return Preco;
	}
	public void setPreco(int[] preco) {
		Preco = preco;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id+"- "+this.Nome+" "+this.Marca);
		
	}
	
}
