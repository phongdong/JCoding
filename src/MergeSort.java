

public class MergeSort {
	public static int[] mergesort(int[] input) {
		return mergesort(input, 0, input.length-1);
	}
	public static int[] mergesort(int[] input, int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			mergesort(input, start, mid);
			mergesort(input, mid + 1, end);
		}
		int i = 0;
		int first = start, last = mid + 1;
		int[] tmp = new int[end - start + 1];
		while (first <= mid && last <= end) {
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
		}
		while (first <= mid) {
			tmp[i++] = input[first++];
		}
		while (last <= end) {
			tmp[i++] = input[last++];
		}
		i = 0;
		while(start <= end) {
			input[start++] = tmp[i++];
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] a = {3,2,6,7,9,1};
		Utility.printArray(mergesort(a));
	}

}












