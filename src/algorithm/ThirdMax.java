/*https://leetcode.com/problems/third-maximum-number/
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.*/

package algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] {1,1,2}));
	}

	public static int thirdMax(int[] nums) {
		
		Arrays.sort(nums);
		
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		if(set.size() < 3) {
			return nums[nums.length-1];
		}
		
		int cnt = 0, num = nums[nums.length-1];
		
		for (int i = nums.length-1; i >= 0; i--) {
			if(nums[i] == num) {
				continue;
			}else {
				num = nums[i];
				cnt++;
			}
			
			if(cnt == 2) {
				break;
			}
		}
		
		return num;
		
		
	}
}
