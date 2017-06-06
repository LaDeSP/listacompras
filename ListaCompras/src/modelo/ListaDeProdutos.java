package modelo;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class ListaDeProdutos {

	/**
	 * @param args
	 */
	private int id;
	private Promocao promocao;
	int id_Cliente;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public ListaDeProdutos(Promocao promocao, int id_cliente) {
		this.id = count.incrementAndGet();
		this.promocao = promocao;
		this.id_Cliente = id_cliente;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void show()
	{
		System.out.print(id+" - ID_Promocao: " +promocao.getId()+"   id_preco: "+promocao.getId_preco()+" Começo da promoção: "+promocao.getInicio().get(Calendar.DAY_OF_MONTH)+"/"+promocao.getInicio().get(Calendar.MONTH)+"/"+promocao.getInicio().get(Calendar.YEAR));
		System.out.println(" Fim da promoção: "+promocao.getFim().get(Calendar.DAY_OF_MONTH)+"/"+promocao.getFim().get(Calendar.MONTH)+"/"+promocao.getFim().get(Calendar.YEAR));
	}

	


}
