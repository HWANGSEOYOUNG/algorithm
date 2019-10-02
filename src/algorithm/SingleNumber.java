/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4*/


package algorithm;

import java.util.HashMap;

public class SingleNumber {
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {4,1,2,1,2};
		
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
        
//        HashMap<Integer, Integer> set = new HashMap<Integer,Integer>();
//        
//        for(int i = 0; i < nums.length; i++) {
//        	set.put(nums[i],set.getOrDefault(nums[i], 0)+1);
//        }
//        
//        for(int key : set.keySet()) {
//        	if(set.get(key)==1) {
//        		return key;
//        	}
//        }
//        
//        return 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i],nums[i]);
			}else {
				map.remove(nums[i], nums[i]);
			}
		}
		
		return (int)map.keySet().toArray()[0];		
    }

}
