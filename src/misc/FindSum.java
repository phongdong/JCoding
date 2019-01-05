package misc;

import java.util.HashMap;
import java.util.Map;

public class FindSum {
	public static void findSum(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (hm.containsKey(complement)) {
				System.out.println(hm.get(complement) + ", " + i);
			}
			hm.put(nums[i], i);
		}
	}
	
	public static void twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println(map.get(complement) + ", " + nums[i]);
				
			}
			map.put(nums[i], i);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 3, 2, 4, 5, 6, 8, 9, 10, 11};
		int target = 10;
		findSum(nums, target);
		}
	
	

}
