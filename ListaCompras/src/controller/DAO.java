package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO{
	
	public static boolean Escrever(String Nome, Object objeto)
	{
		try {
			FileOutputStream fos = new FileOutputStream(Nome);
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(objeto);
	    	oos.flush();
	    	oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return false;
	}
	
	public static Object Ler(String Nome, Object objeto)
	{
		try {
			FileInputStream fos = new FileInputStream(Nome);
			ObjectInputStream  oos = new ObjectInputStream(fos);
	    	
			try {
				objeto = oos.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			oos.close();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		return objeto;
	}
	
}
