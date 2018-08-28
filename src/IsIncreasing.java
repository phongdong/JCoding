
public class IsIncreasing {
	public static boolean isCreasing(int[] nums) {
		boolean isUp = nums[0] <= nums[1];
		boolean flag = false;
		
		for (int i=1; i < nums.length - 1; i++) {
			flag = nums[i] <= nums[i+1];
			if (flag != isUp)
				return false;
		}
		return true;
	}
	
//	
//	public static boolean checkSloop(int[] nums, int n) {
//		if (n == 1) return false;
//		else if (n == 2) return nums[0] == nums[1] ? false : (nums[0] < nums[1] || nums[0] > nums[1]);
//		else 
//			return checkSloop(nums, n/2) && checkSloop(nums, n);
//	}

	public static void main(String[] args) {
		int[] a = {5,6,5,5,8,4,3,2,1};
//		System.out.println(checkSloop(a, 6));
	}

}
