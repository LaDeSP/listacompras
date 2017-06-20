package controller;

import view.TelaInicial;

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
			inicio.LerArquivo();
			i = inicio.TelaLogin();
			if(i != -1)
			{
				inicio.Antesdoinicial(i);
			}
			else
			{
				j = 0;
				System.out.println("Adeus");
			}
			inicio.EscreverArquivo();
			
		}
		//inicio.Inicial(i);
	}

}
