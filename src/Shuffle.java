import java.util.Random;

public class Shuffle {

	public static void shuffle(int[] nums) {
		int last = nums.length - 1;
		while (last > 0) {
			
			int randNum = randInt(0, last);
			System.out.print("randInt: " + randNum + " ");
			
			int tmp = nums[randNum];
			nums[last] = nums[randNum];
			nums[randNum] = tmp;
			
			last --;
		}
	}
	
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void swap(int a, int b) {
		int tmp = a;
		b = a;
		a = tmp;
	}
}
