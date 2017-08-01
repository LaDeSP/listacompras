package view;


import controller.LocalDAO;

import java.util.Scanner;

public class ViewLocal {
    static Scanner ler = new Scanner(System.in);

    public static void criar() {
        String cep, cidade, estado, rua;


        System.out.println("Digite o CEP: ");
        cep = ler.nextLine();
        while (!LocalDAO.verificaCEP(cep)) {

            System.out.println("CEP invalido!\nDigite o CEP: ");
            cep = ler.nextLine();
        }
        System.out.println("Informe a cidade: ");
        cidade = ler.nextLine();
        System.out.println("Digite o estado: ");
        estado = ler.nextLine();
        System.out.println("Informe a rua: ");
        rua = ler.nextLine();

        if (LocalDAO.criar(cep, cidade, estado, rua)) {
            System.out.println("\nLocal criado com sucesso");
        } else {
            System.out.println("Erro ao cadastrar local.");
        }
    }

    public static void excluir() {
        String cep;

        System.out.println("Digite o CEP do local que deseja remover: ");
        cep = ler.nextLine();

        if (LocalDAO.RemoverLocal(cep)) {
            System.out.println("Local removido com sucesso...");
        } else {
            System.out.println("Erro ao remover local.");
        }
    }
}
