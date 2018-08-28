package com.practice.lcode;

import java.util.Arrays;

public class Segregation {
	public static void segregate(int[] nums) {
		int l, r;
		l = 0;
		r = nums.length-1;
		while (l < r) {
			while (nums[l] == 0 && l < r) 
				l++;
			while (nums[r] == 1 && l < r)
				r--;
			if (l < r) {
				nums[l] = 0;
				nums[r] = 1;
				l++;
				r--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregate(nums);

	}

}
