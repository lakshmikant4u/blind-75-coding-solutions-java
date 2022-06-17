package blind75.twosum;

import java.util.Arrays;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

/*
Example 1:
	
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
		
Example 3:
	
Input: nums = [3,3], target = 6
Output: [0,1]
*/

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(bruteForce(nums, 9))); // Brute Force

	}

	private static int[] bruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		// In case there is no solution, we'll just return null
		return null;

	}

}
