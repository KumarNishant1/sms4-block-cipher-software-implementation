package edu.dartmouth.cs55project.sms4blockcipherimpl.controller;

import edu.dartmouth.cs55project.sms4blockcipherimpl.decrypt.SMS4Decrypt;
import edu.dartmouth.cs55project.sms4blockcipherimpl.encrypt.SMS4Encrypt;
import edu.dartmouth.cs55project.sms4blockcipherimpl.roundkey.RoundKey;


/*
 * Provide the plain text and the encrypting key here. Both of them are in hexadecimal and 128 bits long.
 */
public class Controller {
	
	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Controller.class);
	
	public void start(){
		
		logger.info("starting the SMS4 Encryption App");
		
		// number of times to encrypt
		int numEncr = 10;
		
		logger.info("Encypting "+ numEncr + " times");
		
		//plain text
		int[] plainText = new int[32];
		
		plainText[0] = 0X01234567;
		plainText[1] = 0X89abcdef;
		plainText[2] = 0Xfedcba98;
		plainText[3] = 0X76543210;
		
		System.out.println("plain text     " + Integer.toHexString(plainText[0]) + " " + Integer.toHexString(plainText[1]) +
			" " +	Integer.toHexString(plainText[2]) + " " + Integer.toHexString(plainText[3])	);
		
		logger.info("PLAIN TEXT     " + Integer.toHexString(plainText[0]) + " " + Integer.toHexString(plainText[1]) +
			" " +	Integer.toHexString(plainText[2]) + " " + Integer.toHexString(plainText[3])	);
		
		// Encrypting key
		int[] encryptingKey = new int[32];
		
		encryptingKey[0] = 0X01234567;
		encryptingKey[1] = 0X89abcdef;
		encryptingKey[2] = 0Xfedcba98;
		encryptingKey[3] = 0X76543210;
		
		System.out.println("encrypting key " + Integer.toHexString(encryptingKey[0]) + " " + Integer.toHexString(encryptingKey[1]) +
				" " +	Integer.toHexString(encryptingKey[2]) + " " + Integer.toHexString(encryptingKey[3])	);
			
		logger.info("ENCRYPTING KEY  " + Integer.toHexString(encryptingKey[0]) + " " + Integer.toHexString(encryptingKey[1]) +
				" " +	Integer.toHexString(encryptingKey[2]) + " " + Integer.toHexString(encryptingKey[3])	);
		
		// generate round keys
		logger.info("generating round keys");
		
		RoundKey roundKeys = new RoundKey();
		int[] rk = roundKeys.generateRoundKeys(encryptingKey);
				
		
		// Encrypt
		int[] x = encryptPlainText(encryptingKey, plainText, rk, numEncr);
		
		
		// Decrypt
		int[] decryptedText = decryptCipherText(encryptingKey, x, rk, numEncr);	
	}
	
	private int[] encryptPlainText(int[] encryptingKey, int[] plainText, int[] roundKeys, int numEncr){
		
		int[] x = new int[32];
		
		/*
		 * This loop will call the encrypt function number of times specified by user.
		 * The cipher generated at the end of each iteration becomes the plain text for the next iteration. 
		 */
		for(int i=0; i<numEncr; i++){
			
			SMS4Encrypt encr = new SMS4Encrypt();
			x = encr.encrypt(encryptingKey, plainText, roundKeys);
			
			plainText[0] = x[31];
			plainText[1] = x[30];
			plainText[2] = x[29];
			plainText[3] = x[28];
			
			logger.info("encrypted text at the end of iteration " + (i+1) + " " + Integer.toHexString(x[31]) + " " + 
					Integer.toHexString(x[30]) + " " + Integer.toHexString(x[29]) + " " + Integer.toHexString(x[28]));
		}
		
		System.out.println("cipher text    " + Integer.toHexString(x[31]) + " " + Integer.toHexString(x[30]) + " " +
				Integer.toHexString(x[29]) + " " + Integer.toHexString(x[28]));
		
		logger.info("CIPHER TEXT    " + Integer.toHexString(x[31]) + " " + Integer.toHexString(x[30]) + " " +
				Integer.toHexString(x[29]) + " " + Integer.toHexString(x[28]));
		
		return x;
	}
	
	private int[] decryptCipherText(int[] encryptingKey, int[] x, int[] roundKeys, int numEncr){
		
		int[] cipherText = new int[4];
		cipherText[0] = x[31];
		cipherText[1] = x[30];
		cipherText[2] = x[29];
		cipherText[3] = x[28];
		
		int[] y = new int[32];
		
		/*
		 * This loop will call the decrypt function number of times specified by user.
		 * The plain text generated at the end of each iteration becomes cipher text for the next iteration.
		 */
		for(int i=numEncr; i>0; i--){
			
			SMS4Decrypt decr = new SMS4Decrypt();
			y = decr.decrypt(encryptingKey, cipherText, roundKeys);
			
			cipherText[0] = y[0];
			cipherText[1] = y[1];
			cipherText[2] = y[2];
			cipherText[3] = y[3];
			
			logger.info("decrypted text at the end of iteration " + i + " " + Integer.toHexString(y[0]) + " " + 
					Integer.toHexString(y[1]) + " " + Integer.toHexString(y[2]) + " " + Integer.toHexString(y[3]));
		}
		System.out.println("decrypted text " + Integer.toHexString(y[0]) + " " + Integer.toHexString(y[1]) + " " +
				Integer.toHexString(y[2]) + " " + Integer.toHexString(y[3]));
		
		logger.info("DECRYPTED TEXT " + Integer.toHexString(y[0]) + " " + Integer.toHexString(y[1]) + " " +
				Integer.toHexString(y[2]) + " " + Integer.toHexString(y[3]));
	
		int[] decryptedText = new int[4];
		
		decryptedText[0] = y[0];
		decryptedText[1] = y[1];
		decryptedText[2] = y[2];
		decryptedText[3] = y[3];
		
		
		return decryptedText;
	}
	
	public static void main(String args[]){
		
		Controller ctrl = new Controller();
		ctrl.start();
	}
}
