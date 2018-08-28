package com.bot.j8assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */


public class J8Assignment2 {
	
	static int[] findSum(int[] nums, int target) {
		HashMap< Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int completement = target - nums[i];
			if (hm.containsKey(completement)) {
				return new int[] {hm.get(completement) , i};
			}
			else 
				hm.put(nums[i], i);
		}
		return new int[] {};
	}
	
	static void findSum2(int[] nums, int target) {
		Arrays.sort(nums);
		int l = 0, r = nums.length - 1;
		HashMap<Integer, Integer> hm = new HashMap<>();
		while (l <= r) {
			if (nums[l] + nums[r] == target)
				hm.put(nums[l], nums[r]);
			l++;
			r--;
		}
		for (Entry<Integer, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 6, 1, 3, 11, 4, 5};
		int target = 9;
		findSum2(nums, target);
//		System.out.println(Arrays.toString(findSum(nums, target)));
	}

}
