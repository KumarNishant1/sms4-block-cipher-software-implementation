package edu.dartmouth.cs55project.sms4blockcipherimpl.lookup;

/*
 * Constant Parameters as per the algorithm.
 */
public class ConstantParameter {
	
public String getCK(int index){
		
		String[] ck = new String[32];
		
		ck[0] = "00070e15";
		ck[1] = "1c232a31";
		ck[2] = "383f464d";
		ck[3] = "545b6269";
		
		ck[4] = "70777e85";
		ck[5] = "8c939aa1";
		ck[6] = "a8afb6bd";
		ck[7] = "c4cbd2d9";
		
		ck[8] = "e0e7eef5";
		ck[9] = "fc030a11";
		ck[10] = "181f262d";
		ck[11] = "343b4249";
		
		ck[12] = "50575e65";
		ck[13] = "6c737a81";
		ck[14] = "888f969d";
		ck[15] = "a4abb2b9";
		
		ck[16] = "c0c7ced5";
		ck[17] = "dce3eaf1";
		ck[18] = "f8ff060d";
		ck[19] = "141b2229";
		
		ck[20] = "30373e45";
		ck[21] = "4c535a61";
		ck[22] = "686f767d";
		ck[23] = "848b9299";
		
		ck[24] = "a0a7aeb5";
		ck[25] = "bcc3cad1";
		ck[26] = "d8dfe6ed";
		ck[27] = "f4fb0209";
		
		ck[28] = "10171e25";
		ck[29] = "2c333a41";
		ck[30] = "484f565d";
		ck[31] = "646b7279";
		
		return ck[index];
	}


}
