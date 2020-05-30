package testecriptografia;
  
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
  
public class TesteCriptografia {
  
   public static void main(String args []) throws NoSuchAlgorithmException, 
   UnsupportedEncodingException {
	           
       String senha = "1234";
 //esta no banco  
//insert into usuario (username, password) values ('lucas@l.com','03AC674216F3E15C761EE1A5E255F067953623C8B388B4459E13F978D7C846F4');
        
       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
       byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
         
       StringBuilder hexString = new StringBuilder();
       for (byte b : messageDigest) {
         hexString.append(String.format("%02X", 0xFF & b));
       }
       String senhahex = hexString.toString();
        
       System.out.println(senhahex);
   }
   //a implementacao da criptografia esta na class UsuarioDAO
          
}