
public class FindDuplicates 
{
	public void findDuplicates(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[Math.abs(nums[i])] >= 0) 
			{
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
			}
			else {
				System.out.print(Math.abs(nums[i]) + " ");
			}
		}
	}
}
