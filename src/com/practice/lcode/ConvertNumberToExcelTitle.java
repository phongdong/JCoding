package com.practice.lcode;

public class ConvertNumberToExcelTitle {
	public static String convertToSheet(int n) {
		StringBuilder str = new StringBuilder();
		while (n > 0) {
			n--;
			str.append((char)('A' + n%26));
			n = n/26;
		}
		return str.reverse().toString();
	}
	public static void convertToSheet2(int n) {
	
		while (n > 0) {
			n--;
			System.out.print((char)('A' + n%26));
			n = n/26;
		}
	}
	
	public static void groupByOwners(String files) {
		
	}

	public static void main(String[] args) {
		//convertToSheet2(701);
	}
}
