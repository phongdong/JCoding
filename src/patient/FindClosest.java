package patient;

// Given a sorted array and a number x, find the pair in array whose sum is
// closest to x
public class FindClosest {
    public static void main(String[] args) {
        int[] sortedArray = {1, 4, 5, 8, 10, 20, 30, 40};
        int closestNumber = 36;
        System.out.println("hit");
        findClosest(sortedArray, closestNumber);

    }
    static void findClosest(int[] sortedArray, int closestNumber) {
        int l = 0;
        int r = sortedArray.length - 1;
        int i = 0;
        int j = 0;

        int diff = Integer.MAX_VALUE;
        while (l < r) {
            if (Math.abs(sortedArray[l] + sortedArray[r] - closestNumber) <= diff) {
                diff = Math.abs(sortedArray[l] + sortedArray[r] - closestNumber);
                i = l;
                j = r;
            }
            if (sortedArray[l] + sortedArray[r] > closestNumber) {
                r --;
            } else {
                l++;
            }

        }
        System.out.printf("%d : %d", sortedArray[i], sortedArray[j]);
    }
}
