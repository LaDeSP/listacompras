package controller;

import view.TelaInicial;
import view.Menu;

/**
 * @author laboratorio
 * 
 */
public class Sistema {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		int i = 0, j = 1;
		while(j != 0)
		{
			TelaInicial inicio = new TelaInicial();
			Menu menus = new Menu();
		   // inicio.LerArquivo();
		    
			//i = inicio.TelaLogin();
			i = menus.Menu();
			
			if(i == -1)
			{
				j = 0;
				System.out.println("Adeus");
			}
			
			inicio.EscreverArquivo();
			
		}
		//inicio.Inicial(i);
	}

}
