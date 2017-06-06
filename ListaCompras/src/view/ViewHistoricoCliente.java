package view;

import java.util.Scanner;
import modelo.HistoricoCliente;


public class ViewHistoricoCliente {
    HistoricoCliente hc;
    Scanner ler = new Scanner(System.in);
    int id_produto, id_cliente; 
	
    public ViewHistoricoCliente()
    {
    	
    }
	public HistoricoCliente criar(){
			
		
		System.out.println("Id Produto");
		this.id_produto = ler.nextInt(); ler.nextLine();
		
		System.out.println("Id Cliente:");
		this.id_cliente = ler.nextInt(); ler.nextLine();
		
		this.hc = new HistoricoCliente(id_produto, id_cliente);
	
		return this.hc;
	}
}