package view;


import controller.LocalDAO;
import modelo.Local;

import java.util.Scanner;

public class ViewLocal {
    static Scanner ler = new Scanner(System.in);

    public static Local criar() {
        String cep, cidade, estado, rua;


        System.out.println("Digite o CEP: ");
        cep = ler.nextLine();
        /*while (LocalDAO.verificaCEP(cep) == false) {

            System.out.println("CEP invalido!\nDigite o CEP: ");
            cep = ler.nextLine();
        }*/
        System.out.println("Informe a cidade: ");
        cidade = ler.nextLine();
        System.out.println("Digite o estado: ");
        estado = ler.nextLine();
        System.out.println("Informe a rua: ");
        rua = ler.nextLine();
        
        Local local = LocalDAO.criar(cep, cidade, estado, rua);
        if (local != null) 
        {
            System.out.println("\nLocal criado com sucesso");
            return local;
        }
        else 
        {
            System.out.println("Erro ao cadastrar local.");
            return null;
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

    public static void Alterar_Cidade() {
        String cep, cidade = null;

        System.out.println("Digite o CEP do local: ");
        cep = ler.nextLine();
        while (LocalDAO.OKLocal(cep) == false) {
            System.out.println("CEP invalido!\nDigite um CEP válido: ");
            cep = ler.nextLine();
            System.out.println("Digite nome da cidade: ");
            cidade = ler.nextLine();
        }
        if (LocalDAO.Renomear_Cidade(cidade, cep)) {
            System.out.println("Cidade alterada com sucesso.");
        } else {
            System.out.println("Erro para alterar.");
        }
    }

    public static void Alterar_Estado() {
        String cep, estado = null;

        System.out.println("Digite o CEP do local: ");
        cep = ler.nextLine();
        while (LocalDAO.OKLocal(cep) == false) {
            System.out.println("CEP invalido!\nDigite um CEP válido: ");
            cep = ler.nextLine();
            System.out.println("Digite nome do estado: ");
            estado = ler.nextLine();
        }
        if (LocalDAO.Renomear_Estado(estado, cep)) {
            System.out.println("Estado alterado com sucesso.");
        } else {
            System.out.println("Erro ao alterar.");
        }
    }

    public static void Alterar_Rua() {
        String cep, rua = null;

        System.out.println("Digite o CEP do local: ");
        cep = ler.nextLine();
        while (LocalDAO.OKLocal(cep) == false) {
            System.out.println("CEP invalido!\nDigite um CEP válido: ");
            cep = ler.nextLine();
            System.out.println("Digite nome da rua: ");
            rua = ler.nextLine();
        }
        if (LocalDAO.Renomear_Rua(rua, cep)) {
            System.out.println("Rua alterada com sucesso.");
        } else {
            System.out.println("Erro para alterar.");
        }
    }
}
