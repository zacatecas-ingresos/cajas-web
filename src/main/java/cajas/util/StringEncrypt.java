/**
 * @version 1.0
 * Clase que contiene los métodos encrypt y descrypt, cuyos objetivos son
 * encriptar y desencriptar respectivamente, utilizando los algoritmos y codificación
 * definidas en las variables estáticas alg y cI.
 * Requiere las bibliotecas Apache Commons Codec
 * @see <a href="http://commons.apache.org/proper/commons-codec/">Apache Commons Codec</a>
 * @see <a href="http://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html">javax.crypto Class Cipher</a>
 * @see <a href="http://es.wikipedia.org/wiki/Advanced_Encryption_Standard">WikiES: Advanced Encryption Standard</a>
 * @see <a href="http://es.wikipedia.org/wiki/Criptograf%C3%ADa">WikiES: Criptografía</a>
 * @see <a href="http://es.wikipedia.org/wiki/Vector_de_inicializaci%C3%B3n">WikiES: Vector de inicialización</a>
 * @see <a href="http://es.wikipedia.org/wiki/Cifrado_por_bloques">WikiES: Cifrado por bloques</a>
 * @see <a href="http://www.linkedin.com/in/jchinchilla">Julio Chinchilla</a>
 * @author Julio Chinchilla
 */

package cajas.util;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StringEncrypt {
    // Definición del tipo de algoritmo a utilizar (AES, DES, RSA)
    private final static String alg = "AES";
    // Definición del modo de cifrado a utilizar
    private final static String cI = "AES/CBC/PKCS5Padding";

    public static void main(String[] args) {
		String key = "92AE31A79FEEB2A3"; //llave
		String iv = "0123456789ABCDEF"; // vector de inicialización

		try {
			System.out.println("Texto encriptado: " + encrypt(key, iv, 1));
			System.out.println("Texto desencriptado: " + decrypt(key, iv, encrypt(key, iv, 1)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

   /**
    * Función de tipo String que recibe una llave (key), un vector de inicialización (iv)
    * y el texto que se desea cifrar
    * @param key la llave en tipo String a utilizar
    * @param iv el vector de inicialización a utilizar
    * @return el texto cifrado en modo String
    * @throws Exception puede devolver excepciones de los siguientes tipos: NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException
    */
   public static String encrypt(String key, String iv, Integer id) throws Exception {
	   String cleartext = id.toString();
       Cipher cipher = Cipher.getInstance(cI);
       SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), alg);
       IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
       cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
       byte[] encrypted = cipher.doFinal(cleartext.getBytes());
       
       return new String(Base64.getEncoder().encodeToString(encrypted));
   }

   /**
    * Función de tipo String que recibe una llave (key), un vector de inicialización (iv)
    * y el texto que se desea descifrar
    * @param key la llave en tipo String a utilizar
    * @param iv el vector de inicialización a utilizar
    * @param encrypted el texto cifrado en modo String
    * @return el texto desencriptado en modo String
    * @throws Exception puede devolver excepciones de los siguientes tipos: NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException
    */
   public static Integer decrypt(String key, String iv, String encrypted) throws Exception {
           Cipher cipher = Cipher.getInstance(cI);
           SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), alg);
           IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
           byte[] enc = Base64.getDecoder().decode(encrypted);
           cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
           byte[] decrypted = cipher.doFinal(enc);
           return Integer.getInteger(new String(decrypted));
   }

}
