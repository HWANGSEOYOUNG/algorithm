/*https://leetcode.com/problems/relative-ranks/
 * 
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.*/

package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class FindRelativeRanks {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findRelativeRanks(new int[] { 5, 4, 3, 2, 1 })));
	}

	public static String[] findRelativeRanks(int[] nums) {

		int[] newArr = new int[nums.length];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = nums[i];
		}

		Arrays.sort(newArr);

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		int cnt = 4;
		for (int i = newArr.length - 1; i >= 0; i--) {
			if (i == newArr.length - 1) {
				map.put(newArr[i], "Gold Medal");
			} else if (i == newArr.length - 2) {
				map.put(newArr[i], "Silver Medal");
			} else if (i == newArr.length - 3) {
				map.put(newArr[i], "Bronze Medal");
			} else {
				map.put(newArr[i], "" + cnt++);
			}
		}

		String[] arr = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {

			arr[i] = map.get(nums[i]);

		}

		return arr;

	}
}
