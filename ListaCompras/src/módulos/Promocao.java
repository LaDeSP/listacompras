package módulos;

public class Promocao {
	private int id;
	private int id_preco;
	private int id_endereco;
	private int id_supermercado;
	private int id_produto;
	
	public Promocao(int id, int id_preco, int id_endereco, int id_supermercado,
			int id_produto) {
		super();
		this.id = id;
		this.id_preco = id_preco;
		this.id_endereco = id_endereco;
		this.id_supermercado = id_supermercado;
		this.id_produto = id_produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_preco() {
		return id_preco;
	}

	public void setId_preco(int id_preco) {
		this.id_preco = id_preco;
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public int getId_supermercado() {
		return id_supermercado;
	}

	public void setId_supermercado(int id_supermercado) {
		this.id_supermercado = id_supermercado;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
}

