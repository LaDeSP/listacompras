package controller;
import java.math.BigInteger;
import java.security.MessageDigest;


public class MD5 {
    public static String criptografar(String s) throws Exception{
   
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(s.getBytes(),0,s.length());
       return new BigInteger(1,m.digest()).toString(16);
    }
}