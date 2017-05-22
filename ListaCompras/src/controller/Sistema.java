package controller;
/**
 * 
 */
import java.util.Scanner;
/**
 * @author laboratorio
 * 
 */
public class Sistema {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int opcao;
		// TODO Auto-generated method stub
		System.out.println("1 - sign up\t\t2 - sign in");
		opcao = ler.nextInt();
		if(opcao == 1)
		{
			ClienteDAO.criarCliente();
		}
	}

}
