
public class RemoveElement {
	public static int removeElement2(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
	
//	
//	public static int removeElement2(int[] nums, int val) {
//		int n = nums.length;
//		int i = 0;
//		while (i < n) {
//			if (nums[i] == val) {
//				nums[i] = nums[n-1];
//				n--;
//			} else {
//				i++;
//			}
//		}
//		return n;
//	}
	
	public static int removeElement1(int[] nums, int val) {
		int last = nums.length - 1;
		int count = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[i] = nums[last];
				last--;
				count--;
			}
		}
		return count;
	}
	
	public static int removeElement3(int[] nums, int val) {
		int i = 0;
		int last = nums.length;
		while (i < last) {
			if (nums[i] == val) {
				nums[i] = nums[last-1];
				last--;
			} else {
				i++;
			}
		}
		return last;
	}

}
