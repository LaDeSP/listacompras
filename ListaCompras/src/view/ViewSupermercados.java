package view;

import controller.SupermercadoDAO;

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
		System.out.print("Digite o id do local: ");
		id_local = ler.nextInt();

        if (SupermercadoDAO.criar(nome, id_local))
            System.out.println("Supermercado excluido com sucesso...");
        else
            System.out.println("Erro ao excluir supermercado");
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
    /*
	public void Menu(SupermercadoDAO supermercadoDAO, LocalDAO localDAO)
	{
		int i = 1, j;
		System.out.print("\n");
		while(i != 0)
		{
			System.out.print("   1 - Novo Supermercado\n   2 - Listar Supermercado\n   3 - Excluir Supermercado\n   0 - Sair\n");
			i = ler.nextInt();
			switch(i)
			{
				case 1:
				{
					criar();
					supermercadoDAO.EscreverArquivo();
					break;
				}
				case 2:
				{
					supermercadoDAO.listar();
					break;
				}
				case 3:
				{
					supermercadoDAO.listar();
					System.out.print("Opção: ");
					j = ler.nextInt();
					supermercadoDAO.RemoveSupermercado(j);
					break;
				}
				case 0:
				{
					i = 0;
					break;
				}
			}
		}
	}*/

}
