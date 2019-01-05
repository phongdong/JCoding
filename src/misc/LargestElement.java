package misc;

public class LargestElement {
	public static int[] largestElement(int a[], int k) {
		int result[] = new int[k];
		int m = 0;
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < a.length-1-j; i++) {
				if (a[i] > a[i+1]) {
					int tmp = a[i+1];
					a[i+1] = a[i];
					a[i] = tmp;
				}
			}
			
		}
		for (int i = a.length - k; i < a.length; i++) {
			result[m++] = a[i];
		}
		return result;
	}
}
