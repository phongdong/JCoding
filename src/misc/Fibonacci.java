package misc;

public class Fibonacci {
	static int Max = 100;
	static int NIL = -1;
	
	static int look[] = new int[Max];
	
	public static void _initialize() {
		for (int i = 0; i < Max; i++) {
			look[i] = NIL;
		}
	}
	
	public static int fib(int n) {
		if (look[n] == NIL) {
			if (n <= 1)
				look[n] = n;
			else {
				look[n] = fib(n-1) + fib(n-2);
			}
		}
		return look[n];
	}
	
	public static int fib2(int n) {
		if (n <= 1) return n;
		else return fib2(n-1) + fib2(n-2);
	}
	
	public static int fib3(int n) {
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
		
	}
	
}
