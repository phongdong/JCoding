
public class BubbleSort {
	public static void sort(int a[]) {
		int n = a.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (a[j] > a[j+1]) {
					Utility.swap(a[j], a[j+1]);
				}
			}
		}
		
	}
}
