package patient;

/*
    int[] sortedArray = [1, 2, 5, 8, 13, 16]
    Write a function that returns the number of pairs such that x + y <= target
*/

public class CountPairs {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 5, 8, 13, 16};
        countPairs(sortedArray, 10);
    }

    static void countPairs(int[] sortedArray, int target) {
        int l = 0;
        int r = sortedArray.length - 1;

        while (l < r) {
            if ( sortedArray[l] + sortedArray[r] > target) {
                r--;
                l=0;
            } else {
                System.out.printf("%d : %d\n", sortedArray[l], sortedArray[r]);
                l++;
                if (l == r && r > 0) {
                    l= 0;
                    r--;
                }
            }
        }
    }


}
