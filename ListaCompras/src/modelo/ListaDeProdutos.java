package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class ListaDeProdutos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	private int id;
	private Produto produto;
	int id_Cliente;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public ListaDeProdutos(Produto produto, int id_cliente) {
		this.id = count.incrementAndGet();
		this.produto = produto;
		this.id_Cliente = id_cliente;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void show()
	{
		System.out.println("ID_Promocao: " +produto.getId());
		//+"   id_preco: "+promocao.getId_preco()+" Começo da promoção: "+promocao.getInicio().get(Calendar.DAY_OF_MONTH)+"/"+promocao.getInicio().get(Calendar.MONTH)+"/"+promocao.getInicio().get(Calendar.YEAR)
		//System.out.println(" Fim da promoção: "+promocao.getFim().get(Calendar.DAY_OF_MONTH)+"/"+promocao.getFim().get(Calendar.MONTH)+"/"+promocao.getFim().get(Calendar.YEAR));
	}

	


}
