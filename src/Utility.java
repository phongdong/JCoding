
class Utility {
	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " +a[i]);
		}
	}
	public static void swap(int a, int b) {
		int tmp = b;
		b = a;
		a = tmp;
	}
}
