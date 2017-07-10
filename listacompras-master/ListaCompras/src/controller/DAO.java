package controller;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

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
	
	public static boolean ValidarEmail(String Email)
	{
		try 
		{
			InternetAddress emailAddr = new InternetAddress(Email);
			emailAddr.validate();
		}
		catch(AddressException ex)
		{
			return false;
		}
		return true;
	}
	
	public static boolean ValidarSenha(String senha)
	{
		if(senha.length() > 7)
		{
			return true;
		}
		return false;
	}
	
	
}
