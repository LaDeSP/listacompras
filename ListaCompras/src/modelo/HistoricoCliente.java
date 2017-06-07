package modelo;
/*aaaaaaaaaaaaa*/
public class HistoricoCliente {
    private int Id;
    private int Id_produto;
    private int Id_cliente;
    
   
    public HistoricoCliente (){ 
    	
    
    }

    public HistoricoCliente(int id_produto, int id_cliente) {
    	
        this.Id_produto = id_produto;
        this.Id_cliente = id_cliente;
        
        
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

	public void show() {
		System.out.println("Produto: "+Id_produto+"    Cliente: "+Id_cliente);
		
	}
}