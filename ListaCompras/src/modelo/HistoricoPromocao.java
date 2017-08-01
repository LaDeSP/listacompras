package modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class HistoricoPromocao {
	
	private static final long serialVersionUID = 1L;
	private int Id;
    private int Id_produto;
    private int Id_cliente;
    private static final AtomicInteger count = new AtomicInteger(0);
    
    public HistoricoPromocao(int Id_produto, int Id_Cliente)
    {
    	this.Id_produto = Id_produto;
        this.Id_cliente = Id_Cliente;
        Id = count.incrementAndGet();
    }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getId_produto() {
		return Id_produto;
	}

	public void setId_produto(int id_produto) {
		Id_produto = id_produto;
	}

	public int getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		Id_cliente = id_cliente;
	}
	
	public void show()
	{
		System.out.println("Id produto: "+this.Id_produto+"  Id cliente: "+this.Id_cliente);
	}
    
}
