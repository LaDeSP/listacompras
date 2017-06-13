package modelo;

import java.util.concurrent.atomic.AtomicInteger;
import java.io.Serializable;

public class Local implements Serializable {
	private String CEP;
	private int id;
	private String Cidade;
	private String Estado;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Local(String cEP, String cidade, String estado) {
		CEP = cEP;
		this.id = count.incrementAndGet();
		Cidade = cidade;
		Estado = estado;
	}

	public Local() {
		this.id = count.incrementAndGet();
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	public int getId() {
		return id;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Dados do local");
		System.out.println(id+"\n"+CEP+"\n"+Cidade+"\n"+Estado);
	}
	
}
