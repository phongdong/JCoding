
public class Sort {
	public static void selectionSort(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min_index])
					min_index = j;
			}
			int tmp = a[min_index];
			a[min_index] = a[i];
			a[i] = tmp;
		}
	}
	
	public static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		return a;
	}
	
	public static int[] insertionSort2(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j]>key) {
				a[j+1] = a[j];
				--j;
			}
			a[j+1] = key;
		}
		return a;
	}
	
	
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j>=0 && a[j]>key) {
				a[j+1] = a[j];
				--j;
			}
			a[j+1] = key;
		}
		
		return a;
	}
	
	public static int  binarySearch(int[] a, int n, int l, int r) {
		if (r >= l) {
			int mid = (r + l) / 2;
			if (a[mid] == n) {
				return mid;
			} else if (a[mid] > n) {
				return binarySearch(a, n, l, mid);
			} else {
				return binarySearch(a, n, mid+1, r);
			}
		}
		
		return -1;
	}
	
	public static int partition2(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = 0; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				int tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
			}
		}
		
		int tmp = a[i+1];
		a[i+1] = high;
		a[high] = tmp;
		return i + 1;
	}
	
	public static int binarySearch2(int[] a, int x, int l, int r) {
		while (l <= r) {
			int mid = (l+r)/2;
			if (a[mid] == x) return mid;
			else if (a[mid] < x)
				l = mid + 1;
			else 
				r = mid - 1;
		}
		return -1;
	}
	
	public static int partition(int[] a, int low, int high) {
		int i = low -1;
		int pivot = a[high];
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				//swap a[j] and a[i]
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		//swap a[i+1] vs pivot
		int tmp = a[i+1];
		a[i+1] = a[high];
		a[high] = tmp;
		System.out.println(i+1);
		return i+1;
		
	}
	
	public static void quickSort(int[] a, int low, int high) {
		if (low < high ) {
			int pi = partition(a,low, high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {10, 80, 30, 90, 40, 50, 70};
		insertionSort2(a);
		Utility.printArray(a);
		
	}
	
	
	
	
}
