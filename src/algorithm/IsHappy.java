/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

package algorithm;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
//      HashMap<Integer, Integer> map = new HashMap();
//      int re = n;
//      int weightNumber = n;
//      while (re != 1) {
//         int sum = 0;
//         while (weightNumber != 0) {
//            sum = sum + ((weightNumber % 10) * (weightNumber % 10));
//            weightNumber = weightNumber / 10;
//         }
//         re = sum;
//         weightNumber = sum;
//         if(!map.containsKey(re)) {
//            map.put(re,re);
//         }else {
//            return false;
//         }
//      }
//
//      return true;
   
		
		int num = n, one = n;
		Set<Integer> set = new HashSet<Integer>();
		
		while(num != 1) {
			int sum = 0;
			while(one != 0) {
				sum += ((one%10)*(one%10));
				one = one / 10;
			}
			num = sum;
			one = sum;
			if(!set.contains(num)) {
				set.add(num);
			}else {
				return false;
			}
		}
		
		return true;
		
	}

}
