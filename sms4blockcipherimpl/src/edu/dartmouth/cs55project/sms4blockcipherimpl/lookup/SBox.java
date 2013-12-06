package edu.dartmouth.cs55project.sms4blockcipherimpl.lookup;

/*
 * The S-Box as per the algorithm.
 */
public class SBox {
	
		public String SBoxLookup(String val){
		

		String[][] SBox = new String[16][16];
		
		SBox[0][0] = "d6";
		SBox[0][1] = "90";
		SBox[0][2] = "e9";
		SBox[0][3] = "fe";
		SBox[0][4] = "cc";
		SBox[0][5] = "e1";
		SBox[0][6] = "3d";
		SBox[0][7] = "b7";
		SBox[0][8] = "16";
		SBox[0][9] = "b6";
		SBox[0][10] = "14";
		SBox[0][11] = "c2";
		SBox[0][12] = "28";
		SBox[0][13] = "fb";
		SBox[0][14] = "2c";
		SBox[0][15] = "05";
		
		SBox[1][0] = "2b";
		SBox[1][1] = "67";
		SBox[1][2] = "9a";
		SBox[1][3] = "76";
		SBox[1][4] = "2a";
		SBox[1][5] = "be";
		SBox[1][6] = "04";
		SBox[1][7] = "c3";
		SBox[1][8] = "aa";
		SBox[1][9] = "44";
		SBox[1][10] = "13";
		SBox[1][11] = "26";
		SBox[1][12] = "49";
		SBox[1][13] = "86";
		SBox[1][14] = "06";
		SBox[1][15] = "99";
		
		SBox[2][0] = "9c";
		SBox[2][1] = "42";
		SBox[2][2] = "50";
		SBox[2][3] = "f4";
		SBox[2][4] = "91";
		SBox[2][5] = "ef";
		SBox[2][6] = "98";
		SBox[2][7] = "7a";
		SBox[2][8] = "33";
		SBox[2][9] = "54";
		SBox[2][10] = "0b";
		SBox[2][11] = "43";
		SBox[2][12] = "ed";
		SBox[2][13] = "cf";
		SBox[2][14] = "ac";
		SBox[2][15] = "62";
		
		
		
		SBox[3][0] = "e4";
		SBox[3][1] = "b3";
		SBox[3][2] = "1c";
		SBox[3][3] = "a9";
		SBox[3][4] = "c9";
		SBox[3][5] = "08";
		SBox[3][6] = "e8";
		SBox[3][7] = "95";
		SBox[3][8] = "80";
		SBox[3][9] = "df";
		SBox[3][10] = "94";
		SBox[3][11] = "fa";
		SBox[3][12] = "75";
		SBox[3][13] = "8f";
		SBox[3][14] = "3f";
		SBox[3][15] = "a6";
		
		SBox[4][0] = "47";
		SBox[4][1] = "07";
		SBox[4][2] = "a7";
		SBox[4][3] = "fc";
		SBox[4][4] = "f3";
		SBox[4][5] = "73";
		SBox[4][6] = "17";
		SBox[4][7] = "ba";
		SBox[4][8] = "83";
		SBox[4][9] = "59";
		SBox[4][10] = "3c";
		SBox[4][11] = "19";
		SBox[4][12] = "e6";
		SBox[4][13] = "85";
		SBox[4][14] = "4f";
		SBox[4][15] = "a8";
		
		SBox[5][0] = "68";
		SBox[5][1] = "6b";
		SBox[5][2] = "81";
		SBox[5][3] = "b2";
		SBox[5][4] = "71";
		SBox[5][5] = "64";
		SBox[5][6] = "da";
		SBox[5][7] = "8b";
		SBox[5][8] = "f8";
		SBox[5][9] = "eb";
		SBox[5][10] = "0f";
		SBox[5][11] = "4b";
		SBox[5][12] = "70";
		SBox[5][13] = "56";
		SBox[5][14] = "9d";
		SBox[5][15] = "35";
		
		
		SBox[6][0] = "1e";
		SBox[6][1] = "24";
		SBox[6][2] = "0e";
		SBox[6][3] = "5e";
		SBox[6][4] = "63";
		SBox[6][5] = "58";
		SBox[6][6] = "d1";
		SBox[6][7] = "a2";
		SBox[6][8] = "25";
		SBox[6][9] = "22";
		SBox[6][10] = "7c";
		SBox[6][11] = "3b";
		SBox[6][12] = "01";
		SBox[6][13] = "21";
		SBox[6][14] = "78";
		SBox[6][15] = "87";
		
		
		SBox[7][0] = "d4";
		SBox[7][1] = "00";
		SBox[7][2] = "46";
		SBox[7][3] = "57";
		SBox[7][4] = "9f";
		SBox[7][5] = "d3";
		SBox[7][6] = "27";
		SBox[7][7] = "52";
		SBox[7][8] = "4c";
		SBox[7][9] = "36";
		SBox[7][10] = "02";
		SBox[7][11] = "e7";
		SBox[7][12] = "a0";
		SBox[7][13] = "c4";
		SBox[7][14] = "c8";
		SBox[7][15] = "9e";

		SBox[8][0] = "ea";
		SBox[8][1] = "bf";
		SBox[8][2] = "8a";
		SBox[8][3] = "d2";
		SBox[8][4] = "40";
		SBox[8][5] = "c7";
		SBox[8][6] = "38";
		SBox[8][7] = "b5";
		SBox[8][8] = "a3";
		SBox[8][9] = "f7";
		SBox[8][10] = "f2";
		SBox[8][11] = "ce";
		SBox[8][12] = "f9";
		SBox[8][13] = "61";
		SBox[8][14] = "15";
		SBox[8][15] = "a1";

		SBox[9][0] = "e0";
		SBox[9][1] = "ae";
		SBox[9][2] = "5d";
		SBox[9][3] = "a4";
		SBox[9][4] = "9b";
		SBox[9][5] = "34";
		SBox[9][6] = "1a";
		SBox[9][7] = "55";
		SBox[9][8] = "ad";
		SBox[9][9] = "93";
		SBox[9][10] = "32";
		SBox[9][11] = "30";
		SBox[9][12] = "f5";
		SBox[9][13] = "8c";
		SBox[9][14] = "b1";
		SBox[9][15] = "e3";

		SBox[10][0] = "1d";
		SBox[10][1] = "f6";
		SBox[10][2] = "e2";
		SBox[10][3] = "2e";
		SBox[10][4] = "82";
		SBox[10][5] = "66";
		SBox[10][6] = "ca";
		SBox[10][7] = "60";
		SBox[10][8] = "c0";
		SBox[10][9] = "29";
		SBox[10][10] = "23";
		SBox[10][11] = "ab";
		SBox[10][12] = "0d";
		SBox[10][13] = "53";
		SBox[10][14] = "4e";
		SBox[10][15] = "6f";

		
		SBox[11][0] = "d5";
		SBox[11][1] = "db";
		SBox[11][2] = "37";
		SBox[11][3] = "45";
		SBox[11][4] = "de";
		SBox[11][5] = "fd";
		SBox[11][6] = "8e";
		SBox[11][7] = "2f";
		SBox[11][8] = "03";
		SBox[11][9] = "ff";
		SBox[11][10] = "6a";
		SBox[11][11] = "72";
		SBox[11][12] = "6d";
		SBox[11][13] = "6c";
		SBox[11][14] = "5b";
		SBox[11][15] = "51";

		SBox[12][0] = "8d";
		SBox[12][1] = "1b";
		SBox[12][2] = "af";
		SBox[12][3] = "92";
		SBox[12][4] = "bb";
		SBox[12][5] = "dd";
		SBox[12][6] = "bc";
		SBox[12][7] = "7f";
		SBox[12][8] = "11";
		SBox[12][9] = "d9";
		SBox[12][10] = "5c";
		SBox[12][11] = "41";
		SBox[12][12] = "1f";
		SBox[12][13] = "10";
		SBox[12][14] = "5a";
		SBox[12][15] = "d8";

		SBox[13][0] = "0a";
		SBox[13][1] = "c1";
		SBox[13][2] = "31";
		SBox[13][3] = "88";
		SBox[13][4] = "a5";
		SBox[13][5] = "cd";
		SBox[13][6] = "7b";
		SBox[13][7] = "bd";
		SBox[13][8] = "2d";
		SBox[13][9] = "74";
		SBox[13][10] = "d0";
		SBox[13][11] = "12";
		SBox[13][12] = "b8";
		SBox[13][13] = "e5";
		SBox[13][14] = "b4";
		SBox[13][15] = "b0";

		SBox[14][0] = "89";
		SBox[14][1] = "69";
		SBox[14][2] = "97";
		SBox[14][3] = "4a";
		SBox[14][4] = "0c";
		SBox[14][5] = "96";
		SBox[14][6] = "77";
		SBox[14][7] = "7e";
		SBox[14][8] = "65";
		SBox[14][9] = "b9";
		SBox[14][10] = "f1";
		SBox[14][11] = "09";
		SBox[14][12] = "c5";
		SBox[14][13] = "6e";
		SBox[14][14] = "c6";
		SBox[14][15] = "84";
		
		SBox[15][0] = "18";
		SBox[15][1] = "f0";
		SBox[15][2] = "7d";
		SBox[15][3] = "ec";
		SBox[15][4] = "3a";
		SBox[15][5] = "dc";
		SBox[15][6] = "4d";
		SBox[15][7] = "20";
		SBox[15][8] = "79";
		SBox[15][9] = "ee";
		SBox[15][10] = "5f";
		SBox[15][11] = "3e";
		SBox[15][12] = "d7";
		SBox[15][13] = "cb";
		SBox[15][14] = "39";
		SBox[15][15] = "48";
		
		
		String row = Character.toString(val.charAt(0));
		String col = Character.toString(val.charAt(1));
		
		return SBox[getIntVal(row)][getIntVal(col)];
	}
	
	private int getIntVal(String val){
		
		int index = -1;
		
		if(val.equalsIgnoreCase("a"))
			index = 10;
		
		else if(val.equalsIgnoreCase("b"))
			index = 11;
		
		else if(val.equalsIgnoreCase("c"))
			index = 12;
		
		else if(val.equalsIgnoreCase("d"))
			index = 13;
		
		else if(val.equalsIgnoreCase("e"))
			index = 14;
		
		else if(val.equalsIgnoreCase("f"))
			index = 15;
		
		else
			index = Integer.parseInt(val);
		
		return index;
	}
	
}
