package edu.dartmouth.cs55project.sms4blockcipherimpl.roundkey;

import edu.dartmouth.cs55project.sms4blockcipherimpl.lookup.*;

public class RoundKey {
	
	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(RoundKey.class);
	
	/*
	 * Generates the round keys from the given encrypting key.
	 * Accepts the encrypting key as input.
	 */
	public int[] generateRoundKeys(int[] encryptingKey){
		
		int[] rk = new int[32];
		
		int mk0 = encryptingKey[0];
		int mk1 = encryptingKey[1];
		int mk2 = encryptingKey[2];
		int mk3 = encryptingKey[3];
		
		// system parameters
		int fk0 = 0Xa3b1bac6;
		int fk1 = 0X56aa3350;
		int fk2 = 0X677d9197;
		int fk3 = 0Xb27022dc;
		
		int k0 = mk0 ^ fk0;
		int k1 = mk1 ^ fk1;
		int k2 = mk2 ^ fk2;
		int k3 = mk3 ^ fk3;
		
		ConstantParameter ck = new ConstantParameter();
		
		for(int i=0; i<32; i++){

			int B = -1;
			if(i == 0){

				B = k1 ^ k2 ^ k3;
				int ck_dec = (int)Long.parseLong(ck.getCK(i), 16);
				B = B ^ ck_dec;

			}
			else if( i == 1){

				B = k2 ^ k3 ^ rk[i-1];
				int ck_dec = (int)Long.parseLong(ck.getCK(i), 16);
				B = B ^ ck_dec;

			}
			else if( i == 2){

				B = k3 ^ rk[i-2] ^ rk[i-1]  ;
				int ck_dec = (int)Long.parseLong(ck.getCK(i), 16);
				B = B ^ ck_dec;

			}
			else{
				B = rk[i-3] ^ rk[i-2] ^ rk[i-1]  ;
				int ck_dec = (int)Long.parseLong(ck.getCK(i), 16);
				B = B ^ ck_dec;
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
			int	 C = ls.linearSub_LPrime(dec);


			int op = -1;
			if(i==0){

				op = k0 ^ C;
				rk[i] = op;
				logger.info("RoundKey[" + i + "] " + Integer.toHexString(rk[i]) );
				
			}
			else if(i == 1){

				op = k1 ^ C;
				rk[i] = op;
				logger.info("RoundKey[" + i + "] " + Integer.toHexString(rk[i]) );
				
			}
			else if(i == 2){

				op = k2 ^ C;
				rk[i] = op;
				logger.info("RoundKey[" + i + "] " + Integer.toHexString(rk[i]) );
				
			}
			else if(i == 3){

				op = k3 ^ C;
				rk[i] = op;
				logger.info("RoundKey[" + i + "] " + Integer.toHexString(rk[i]) );
				
			}
			else{
				op = rk[i-4] ^ C;
				rk[i] = op;
				logger.info("RoundKey[" + i + "] " + Integer.toHexString(rk[i]) );

			}

		}
		
		return rk;
	}
}
