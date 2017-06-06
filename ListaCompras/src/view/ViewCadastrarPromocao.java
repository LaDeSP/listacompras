package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import modelo.Promocao;

public class ViewCadastrarPromocao {
	Scanner leitura = new Scanner(System.in);
		private Calendar inicio = Calendar.getInstance();
		private Calendar fim = Calendar.getInstance();
		private Promocao promocao;
	
	
	
	 	public ViewCadastrarPromocao(){
	 		
	 	}

		public Promocao criar(int id){
			
			System.out.println("Data de Inicio da promocao: dd/M/Y");
			
			//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/Y");
			
			
			/*try {
				this.inicio.setTime(dateFormat.parse(leitura.nextLine()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
			System.out.print("Dia: "); inicio.set(Calendar.DAY_OF_MONTH, leitura.nextInt());
			System.out.print("Mês: "); inicio.set(Calendar.MONTH, leitura.nextInt());
			System.out.print("Ano: "); inicio.set(Calendar.YEAR, leitura.nextInt());
			System.out.println("Data de FIM da promocao: dd/M/Y");
			
			
			/*try {
				this.fim.setTime(dateFormat.parse(leitura.nextLine()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
			
			System.out.print("Dia: "); fim.set(Calendar.DAY_OF_MONTH, leitura.nextInt());
			System.out.print("Mês: "); fim.set(Calendar.MONTH, leitura.nextInt());
			System.out.print("Ano: "); fim.set(Calendar.YEAR, leitura.nextInt());
			
			this.promocao = new Promocao(id, this.inicio, this.fim);
			return this.promocao;
		}


}
