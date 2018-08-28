import java.util.ArrayList;
import java.util.Arrays;

public class MinimumUniqueArraySum {
	static ArrayList<Integer> existingList = new ArrayList<Integer>(); 
	
	public static void minimumUniqueArrarySum(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		
		Arrays.sort(nums);
		System.out.println();
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		for ( int i = 1 ; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) {
				nums[i] = pickMinimiumNumber(nums);
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
	
	public static int pickMinimiumNumber(int[] nums) {
		int n = nums[0];
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numList.add(nums[i]);
		}
		
		while (numList.contains(n))
			n += 1;
				
		return n;
	}
}
