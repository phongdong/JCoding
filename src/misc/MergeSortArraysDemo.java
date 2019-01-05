package misc;

public class MergeSortArraysDemo
{
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5} ;
        int[] arr2 = {2, 4, 6, 8};
        MergeSortedArrays msarrays = new MergeSortedArrays();
        msarrays.mergeSortArrays(arr1, arr2); 
	}
}
