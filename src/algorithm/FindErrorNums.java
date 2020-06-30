/*The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]*/

package algorithm;

import java.util.*;

public class FindErrorNums {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findErrorNums(new int[] { 1,5,3,2,2,4,6,7,8,9 })));
	}

	public static int[] findErrorNums(int[] nums) {
		int[] arr = new int[2];
		Set<Integer> set = new HashSet<>();

		// nums 배열 모든 값을 set에 넣어주고, 중복된 값은 arr[0]에 넣어준다
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
			} else {
				arr[0] = nums[i];
			}
		}

		// 누락된 숫자 찾아서 arr[1]에 넣어준다
		for (int i = 1; i < nums.length; i++) {
			if(!set.contains(i)) {
				arr[1] = i;
				break;
			}
			if(i== nums.length-1) {
				arr[1] = nums.length;
			}
		}

		return arr;

	}
}
