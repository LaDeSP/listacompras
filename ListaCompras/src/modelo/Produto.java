package modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import controller.ClienteDAO;

public class Produto implements Serializable{
	/**
	 * 
	 */
	//Atributos
	private static final long serialVersionUID = 1L;
	private String Nome;
	private int id;
	private String Marca;
	private int id_Cliente;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	
	//Metodos
	public void Incrementar()
	{
		count.incrementAndGet();
	}
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public Produto(String nome, String marca, int id_Cliente) {
		id = count.incrementAndGet();
		this.Nome = nome;
		this.Marca = marca;
		this.id_Cliente = id_Cliente;
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
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id+"- "+this.Nome+" "+this.Marca+"  Criador desse produto: "+id_Cliente);
		
	}
	
}
