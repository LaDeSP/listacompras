package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Preco {
	private int id;
	private int id_produto;
	private boolean status;
	private int id_supermercado;
	private int id_cliente;
	private double precoProduto;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Preco(int id_produto, boolean status, int id_supermercado,
			int id_cliente, double precoProduto){
		super();
		id = count.incrementAndGet();
		this.id_produto = id_produto;
		this.status = status;
		this.id_supermercado = id_supermercado;
		this.id_cliente = id_cliente;
		this.precoProduto = precoProduto;
	}

	public Preco() {
		id = count.incrementAndGet();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId_supermercado() {
		return id_supermercado;
	}

	public void setId_supermercado(int id_supermercado) {
		this.id_supermercado = id_supermercado;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Dados do Preço");
		System.out.println(id+"\n"+id_produto+"\n"+status+"\n"+id_cliente+"\n"+id_supermercado+"\n"+precoProduto);
		
	}
	
}
