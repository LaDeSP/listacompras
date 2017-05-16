package módulos;

public class ListaDeProdutos {

	/**
	 * @param args
	 */
	private int id;
	private int id_Preço; 
	private int id_Supermercado;
	
	public ListaDeProdutos(int id, int id_Preço, int id_Supermercado) {
		this.id = id;
		this.id_Preço = id_Preço;
		this.id_Supermercado = id_Supermercado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Preço() {
		return id_Preço;
	}

	public void setId_Preço(int id_Preço) {
		this.id_Preço = id_Preço;
	}

	public int getId_Supermercado() {
		return id_Supermercado;
	}

	public void setId_Supermercado(int id_Supermercado) {
		this.id_Supermercado = id_Supermercado;
	}


}
