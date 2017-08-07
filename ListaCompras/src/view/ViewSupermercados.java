package view;

import controller.SupermercadoDAO;
import modelo.Local;

import java.util.Scanner;

public class ViewSupermercados {
	
	Scanner ler = new Scanner(System.in);
	
	public ViewSupermercados()
	{
		
	}
	public void criar(){
		String nome;
		int id_local;
		
		System.out.print("Nome do Supermercado: ");
		nome = ler.nextLine();
		Local local = ViewLocal.criar();
		if(local != null)
		{
			if (SupermercadoDAO.criar(nome, local.getId()))
	            System.out.println("Supermercado criado com sucesso");
	        else
	            System.out.println("Erro ao criar o supermercado");
		}
    }

    public void excluir() {
        int id;
        System.out.println("Digite o id do supermercado que deseja excluir: ");
        id = ler.nextInt();

        if (SupermercadoDAO.RemoveSupermercado(id))
            System.out.println("Supermercado removivo com sucesso!");
        else
            System.out.println("Erro ao remover supermercado...");
    }

    public void renomear_Nome() {
        String nome;
        int id;

        SupermercadoDAO.listar();

        System.out.println("Digite o id do supermercado que deseja editar:");
        id = ler.nextInt();

        System.out.println("Digite o novo nome: ");
        nome = ler.nextLine();

        if (SupermercadoDAO.Renomear_Nome(id, nome)) {
            System.out.println("Supermercado renomeado com sucesso...");
        } else {
            System.out.println("Erro ao renomear Supermercado.");
        }


    }
  

}
