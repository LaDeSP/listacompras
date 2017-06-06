package modelo;


import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class Promocao {
	private int id;
	private int id_preco;
	private Calendar inicio = Calendar.getInstance();
	private Calendar fim = Calendar.getInstance();
	private static final AtomicInteger count = new AtomicInteger(0);

	public Promocao(int id_preco, Calendar inicio, Calendar fim) {
								
		this.id = count.incrementAndGet();
		this.id_preco = id_preco;
		this.inicio = inicio;
		this.fim = fim;
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

	public Calendar getInicio(){
		return inicio;
	}
	public void setInicio(Calendar inicio){
		this.inicio = inicio;
	}
	public Calendar getFim(){
		return fim;
	}
	public void setFim(Calendar fim){
		this.fim = fim;
	}
	
	public void show() {
		//gc.get(gc.DAY_OF_WEEK)
		// TODO Auto-generated method stub
		System.out.print(this.id+"° - id_preco: "+this.id_preco+" Começo da promoção: "+this.inicio.get(Calendar.DAY_OF_MONTH)+"/"+this.inicio.get(Calendar.MONTH)+"/"+this.inicio.get(Calendar.YEAR));
		System.out.println(" Fim da promoção: "+this.fim.get(Calendar.DAY_OF_MONTH)+"/"+this.fim.get(Calendar.MONTH)+"/"+this.fim.get(Calendar.YEAR));
		
	}
}
