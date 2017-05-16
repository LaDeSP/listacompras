package módulos;

public class Preco {
	private int id;
	private int id_produto;
	private boolean status;
	private int id_supermercado;
	private int id_cliente;
	private double precoProduto;
	
	public Preco(int id, int id_produto, boolean status, int id_supermercado,
			int id_cliente, double precoProduto) {
		super();
		this.id = id;
		this.id_produto = id_produto;
		this.status = status;
		this.id_supermercado = id_supermercado;
		this.id_cliente = id_cliente;
		this.precoProduto = precoProduto;
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
	
}
