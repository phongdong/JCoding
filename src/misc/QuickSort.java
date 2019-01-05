package misc;

public class QuickSort {
	public static int partition(int a[], int low, int high) {
		int i = low - 1;
		int pivot = a[high];
		
		for (int j = low; j <= high - 1; j++) {
			if (a[j] <= pivot) {
				i++;
				
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		int tmp = a[i+1];
		a[i+1] = a[high];
		a[high] = tmp;
		
		return i+1;
	}
	
	public static void sort(int a[], int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi-1);
			sort(a, pi+1, high);
		}
	}
}
