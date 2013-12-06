package edu.dartmouth.cs55project.sms4blockcipherimpl.lookup;

public class LinearSubstitution {
	
	public int linearSub_L(int inp){
		 
		int xor_2 = Integer.rotateLeft(inp, 2);
		
		int xor_10 = Integer.rotateLeft(inp, 10);
		
		int xor_18 = Integer.rotateLeft(inp, 18);
		
		int xor_24 = Integer.rotateLeft(inp, 24);
		
		int C = inp ^ xor_2;
		C = C ^ xor_10;
		C = C ^ xor_18;
		C = C ^ xor_24;
		
		return C;
	}
	
	/*
	 * This function is used in the generation of the round keys.
	 */
	public int linearSub_LPrime(int inp){
		 
		int xor_13 = Integer.rotateLeft(inp, 13);
		
		int xor_23 = Integer.rotateLeft(inp, 23);
		
		int C = inp ^ xor_13;
		C = C ^ xor_23;
		
		return C;
	}
}

