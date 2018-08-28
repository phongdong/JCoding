package com.practice1;

import java.util.Arrays;
import java.util.HashMap;

public class Sort {
	public static void quickSort(int[] nums, int low, int high) {
		if (low < high) {
			int p = pivot(nums, low, high);
			quickSort(nums, low, p - 1);
			quickSort(nums, p + 1, high);
		}
	}

	public static int pivot(int[] nums, int low, int high) {
		int i = low - 1;
		int pivot = nums[high];

		for (int j = low; j < high; j++) {
			if (nums[j] <= pivot) {
				i++;
				int tmp = nums[j];
				nums[j] = nums[i];
				nums[i] = tmp;
			}
		}

		int tmp = nums[i + 1];
		nums[i + 1] = pivot;
		nums[high] = tmp;

		return i + 1;
	}
	
	public static int[] mergeSort(int[] a) {
		return sort(a, 0, a.length-1);
	}
	
	public static int[] sort(int[] a, int l, int r) {
		int mid = (l + r) / 2;
		if (l < r) {
			sort(a, l, mid);
			sort(a, mid+1, r);
		}
		
		int i = l, j = mid +1;
		int k = 0;
		int[] tmp = new int[r-l+1]; 
		while (i <= mid && j <= r) {
			tmp[k++] = a[i] < a[j] ? a[i++] : a[j++];
		}
		while (i <= mid) {
			tmp[k++] = a[i++];
		}
		while (j <= r) {
			tmp[k++] = a[j++];
		}
		i=0;
		while (l <= r) {
			a[l++] = tmp[i++]; 
		}
		return a;
	}

	public static void main(String[] args) {
//		int[] nums = { 10, 80, 30, 90, 40, 50, 70 };
//		quickSort(nums, 0, 6);
//		System.out.println(Arrays.toString(nums));
		
//		int arr[] = {12, 11, 13, 5, 6, 7};
//		System.out.println(Arrays.toString(mergeSort(arr)));
//		
		HashMap<Integer, String> hashMap = new HashMap<>();
		String key = null;
		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
		
	}
}
