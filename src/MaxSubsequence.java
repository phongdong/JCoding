
public class MaxSubsequence {
	 static public int maxSubSum(int[] arr) {
		 int max_so_far = 0;
		 int max_ending_here = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			 max_ending_here += arr[i];
			 if (max_ending_here < 0) 
				 max_ending_here = 0;
			 if (max_so_far < max_ending_here) {
				 max_so_far = max_ending_here;
			 }
		 }
		
		return max_so_far;
	}
	 
	 static int[] maxSub(int a[]) {
		 int max_so_far =0;
		 int max_ending_here = 0;
		 int array[] = new int[2];
		 boolean firstTime = true;
		 
		 for (int i = 0; i < a.length; i++) {
			 max_ending_here = max_ending_here + a[i];
			 if (max_ending_here < 0) {
				 max_ending_here = 0;
			 } else {
				 if (firstTime) {
					 array[0] = i; 
					 firstTime = false;
				 }
			 }
			 
			 if (max_so_far < max_ending_here) {
				 max_so_far = max_ending_here;
				 array[1] = i;
			 }
			 
		 }
		 return array;
	 }
}
	