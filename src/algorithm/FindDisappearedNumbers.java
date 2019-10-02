/*Given an array of integers where 1 ¡Â a[i] ¡Â n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]*/

package algorithm;

import java.util.*;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
//		List<Integer> list = new ArrayList<>();
//		Set<Integer> set = new HashSet<Integer>();
//		
//		for(int num : nums){
//			set.add(num);
//		}
//		
//		int maxNum = nums.length;
//		
//		Iterator<Integer> iter = set.iterator();
//		
//		for(int i = 1; i <= maxNum; i++) {
//			if(!set.contains(i)) {
//				list.add(i);
//			}
//		}
//		
//		return list;
		
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[nums.length+1];
		
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==0)
				list.add(i);
		}
		
		return list;
	}

}
