/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]*/

package algorithm;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = new int[] {4,2,4,0,0,3,0,5,1,0};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
//		int cntZero = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 0) {
//				cntZero++;
//			}
//		}
//		
//		if(cntZero > 0) {
//			int[] arrMinZero = new int[nums.length - cntZero];
//
//			int i = 0, j = 0;
//
//			while (i < nums.length) {
//				if (nums[i] != 0) {
//					arrMinZero[j] = nums[i];
//					j++;
//					i++;
//				} else {
//					i++;
//				}
//			}
//			
//			for (int k = 0; k < nums.length; k++) {
//				if (k >= arrMinZero.length) {
//					nums[k] = 0;
//				} else {
//					nums[k] = arrMinZero[k];
//				}
//			}
//			
//			System.out.println(Arrays.toString(nums));
//		}
//
//		System.out.println(Arrays.toString(nums));
		
        int nonZeroPos = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] != 0) {
              nums[nonZeroPos] = nums[i];
              if (nonZeroPos++ < i) {
                 nums[i] = 0;
              }
           }
        }
        System.out.println(Arrays.toString(nums));

	}

}
