/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8*/

package algorithm;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = new int[]{0,2,3};
		
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
//		int result = 0;
//		
//		Arrays.sort(nums);
//		
//		if(nums[0] != 0) {
//			return 0;
//		}
//		
//		for(int i = 0; i < nums.length; i++) {
//			if(i != nums[i]) {
//				result = i;
//				break;
//			}else{
//				result =i+1;
//			}
//		}
//		
//		return result;
		
		int sum = 0, total = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			total += i+1;
		}
		
		return total-sum;
	}

}
