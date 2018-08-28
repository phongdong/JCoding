

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int x, int l, int r) {
		if (r >= l) {
			int mid = (l + r) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				return binarySearch(arr, x, mid+1, r);
			} else {
				return binarySearch(arr, x, l, mid-1);
			}
		}
		
		return -1;
	}
	
	public static int binarySearch1(int a[], int x, int l, int r) {
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == x) return mid;
			else if (a[mid] < x) l = mid+1;
			else r = mid-1;
		}
		return -1;
	}
	
	public  static void main(String[] args) {
		int[] nums = {0,1,2,4,5,6,7,9,10};
		System.out.println(binarySearch(nums,10, 0, 8));
	}
}
