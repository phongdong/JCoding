package misc;

public class SortAlgorithm {
	
	public static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a) {
		
		return a;
	}
	
	public static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; i < high; j++) {
			if (a[j] < pivot) {
				j ++;
				int tmp = a[j];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		int tmp = a[i+1];
		a[i+1] = a[high];
		a[high] = tmp;
		return i+1;
	}
	
	public static int[] quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
		
		return a;
	}
	public static void main(String[] args) {
		int[] a = {3,2,6,7,9,1};
		Utility.printArray(bubbleSort(a));
	}

}
