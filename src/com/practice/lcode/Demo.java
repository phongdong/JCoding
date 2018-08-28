package com.practice.lcode;

public class Demo {
	
	static int divideWithCondition(int n, int a) {
		int res = 0;
		//boolean signed = (n < 0 && a < 0) == true ? false :  (n < 0) || (a < 0) ;
		int signed = ((n < 0) ^ (a < 0)) ? -1 : 1;
		n = Math.abs(n);
		a = Math.abs(a);
		while (n > a) {
			n -= a;
			res++;
		}
//		res = (signed == true) ? -res : res;
		return res * signed;
	}

	public static void main(String[] args) {
		System.out.println(divideWithCondition(10, -3));

	}

}
