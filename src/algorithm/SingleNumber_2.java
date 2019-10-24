/*https://leetcode.com/problems/single-number-iii/
 * 
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]*/

package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber_2 {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,2,5};
		System.out.println(Arrays.toString(singleNumber(nums)));
	}

	public static int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		
		int size= 0;
		for (int key : map.keySet()) {
			if(map.get(key) == 1) {
				size++;
			}
		}
		
		int[] result = new int[size];
		
		size = 0;
		for (int key : map.keySet()) {
			if(map.get(key) == 1) {
				result[size++] = key;
			}
		}
		
		return result;
		
	}

}
