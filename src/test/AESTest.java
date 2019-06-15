package test;

import org.junit.Test;

import criptografia.AES;

public class AESTest {	

	@Test
	public void teste() {
		for (int i = 0; i < 5; i++) {
		final String secretKey = "Aula12";
	     
	    String originalString = "senha";
	    String encryptedString = AES.encrypt(originalString, secretKey);
	    String decryptedString = AES.decrypt(encryptedString, secretKey);
	     
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
		}
	}
}
