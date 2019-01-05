package misc;

import java.util.Arrays;

public class FindNumber {
	public static String findNumber(int[] arr, int k) {
        /*
         * Write your code here.
         */
        int low = 0;
        int high = arr.length-1;
        Arrays.sort(arr);
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] == k) {
                index = mid;
                break;
            }
        }
        
        if (index != -1) {
            return "YES";
        }
        return "NO";

    }
}
