/*Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.

Return a list of all powerful integers that have value less than or equal to bound.

You may return the answer in any order.  In your answer, each value should occur at most once.

 

Example 1:

Input: x = 2, y = 3, bound = 10
Output: [2,3,4,5,7,9,10]
Explanation: 
2 = 2^0 + 3^0
3 = 2^1 + 3^0
4 = 2^0 + 3^1
5 = 2^1 + 3^1
7 = 2^2 + 3^1
9 = 2^3 + 3^0
10 = 2^0 + 3^2
Example 2:

Input: x = 3, y = 5, bound = 15
Output: [2,4,6,8,10,14]*/

package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers {
	public static void main(String[] args) {
		int x = 2, y = 3, bound = 10;
		System.out.println(powerfulIntegers(x,y,bound));
	}
	
	public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        
		int[] arr = new int[bound];
		List<Integer> list = new ArrayList<Integer>();
        
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 1; i <= bound; i++) {
			set.add(i);
		}
       
        int k = 0;
        for (int i = 0; i < bound; i++) {
			for (int j = 0; j < bound; j++) {
				if(set.contains((int)(Math.pow(x, i)+Math.pow(y, j)))) {
					arr[k++] = (int)(Math.pow(x, i)+Math.pow(y, j));
				}
			}
		}
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        return list;
    }
}