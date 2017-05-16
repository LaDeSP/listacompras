package módulos;

public class Produto {
	private String Nome;
	private int id;
	private String Marca;
	private int Preco[];
	
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
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
	
}
