package edu.dartmouth.cs55project.sms4blockcipherimpl.encrypt;

import edu.dartmouth.cs55project.sms4blockcipherimpl.lookup.*;


public class SMS4Encrypt {
	
	/*
	 * Encrypts the plain text based on the SMS4 block cipher algorithm.
	 * Accepts the encrypting key, the plain text and the round keys as input.
	 *  
	 */
	
	public int[] encrypt(int[] encryptingKey, int[] plainText, int[] rk){
				
		
		int x0 = plainText[0];
		int x1 = plainText[1];
		int x2 = plainText[2];
		int x3 = plainText[3];
		
		int[] x = new int[32];
		
		for(int i=0; i<32; i++){
			
			int B = -1;
			if(i == 0){
				
				B = x1 ^ x2 ^ x3;
				B = B ^ rk[0];
				
			}
			else if( i == 1){
				
				B = x2 ^ x3 ^ x[i-1];
				B = B ^ rk[i];
			}
			
			else if( i == 2){
				
				B = x3 ^ x[i-1] ^ x[i-2];
				B = B ^ rk[i];
			}
			
			else{
				
				B = x[i-1] ^ x[i-2] ^ x[i-3];
				B = B ^ rk[i];
				
			}
			
			
			String sub = Integer.toHexString(B);
			
			String a0 ="";
			String a1 ="";
			String a2 ="";
			String a3 ="";
			if(sub.length() == 8){
				
				a0 = sub.substring(0, 2);
				a1 = sub.substring(2, 4);
				a2 = sub.substring(4, 6);
				a3 = sub.substring(6, 8);
				
			}
			else if(sub.length() == 7){
				
				a0 = sub.substring(0, 1);
				a0 = "0" + a0;
				
				a1 = sub.substring(1, 3);
				a2 = sub.substring(3, 5);
				a3 = sub.substring(5, 7);
				
			}
			else if(sub.length() == 6){
				
				a0 = "00";				
				a1 = sub.substring(0, 2);
				a2 = sub.substring(2, 4);
				a3 = sub.substring(4, 6);
				
			}
			else if(sub.length() == 5){
				
				a0 = "00";				
				a1 = sub.substring(0, 1);
				a1 = "0" + a1;
				
				a2 = sub.substring(1, 3);
				a3 = sub.substring(3, 5);
				
			}
			
			else if(sub.length() == 4){
				
				a0 = "00";				
				a1 = "00";
				
				a2 = sub.substring(0, 2);
				a3 = sub.substring(2, 4);
				
			}
			else if(sub.length() == 3){
				
				a0 = "00";				
				a1 = "00";
				
				a2 = sub.substring(0, 1);
				a2 = "0" + a2;
				a3 = sub.substring(1, 3);
				
			}
			
			else if(sub.length() == 2){
				
				a0 = "00";				
				a1 = "00";
				a2 = "00";
				
				a3 = sub.substring(0, 2);
				
			}
			
			else if(sub.length() == 1){
				
				a0 = "00";				
				a1 = "00";
				a2 = "00";
				
				a3 = sub.substring(0, 1);
				
			}
			
			
			SBox sb = new SBox();
			String b0 = sb.SBoxLookup(a0);
			String b1 = sb.SBoxLookup(a1);
			String b2 = sb.SBoxLookup(a2);
			String b3 = sb.SBoxLookup(a3);
			
			String str1 = b0 + b1 + b2 + b3;
			
			int dec = (int)Long.parseLong(str1, 16);
			
			LinearSubstitution ls = new LinearSubstitution();
			int	 C = ls.linearSub_L(dec);
				
			
			int op = -1;
			if(i == 0){
				
				op = x0 ^ C;
				x[i] = op;
				
			}
			
			else if(i == 1){
				
				op = x1 ^ C;
				x[i] = op;
				
			}
			else if(i == 2){
				
				op = x2 ^ C;
				x[i] = op;
				
			}
			else if(i == 3){
				
				op = x3 ^ C;
				x[i] = op;
				
			}
			else{
				op = x[i-4] ^ C;
				x[i] = op;
				
			}
			
		}
				
		return x;
	}
	
}
