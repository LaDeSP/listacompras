package modelo;

import java.util.concurrent.atomic.AtomicInteger;

import controller.ListaDeProdutosDAO;

public class Cliente {
	private int id;
	private String Nome;
	private String Senha;
	private String Email;
	private ListaDeProdutosDAO listadeprodutoDAO;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Cliente(String nome, String senha, String email) {
		id = count.incrementAndGet();
		Nome = nome;
		Senha = senha;
		Email = email;
		listadeprodutoDAO = new ListaDeProdutosDAO();
	}

	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void show(int id) {
		
		listadeprodutoDAO.Listar(id);
		
	}
	public void show() {
		
		System.out.print("Nome: "+Nome+"\nSenha: "+Senha+"\nEmail: "+Email+"\nId: "+id+"\n");
		
	}

	public String getNome() {
		return this.Nome;
	}
	
	public void InserirNaLista(Promocao promocao, int id)
	{
		listadeprodutoDAO.Inserir(promocao, id);
	}
}