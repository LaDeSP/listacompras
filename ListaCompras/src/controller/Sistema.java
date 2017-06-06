package controller;

import view.TelaInicial;

/**
 * @author laboratorio
 * 
 */
public class Sistema {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0, j = 1;
		while(j != 0)
		{
			TelaInicial inicio = new TelaInicial();
			i = inicio.TelaLogin();
			inicio.Antesdoinicial(i);
		}
		//inicio.Inicial(i);
	}

}
