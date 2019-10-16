/*Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.*/

package algorithm;

import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(countPrimes(n));
	}

	public static int countPrimes(int n) {

		int cnt = 0;
		
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j ==0) {
					flag = false;
					break;	
				}
				
			}	
			if(flag)
				cnt++;
		}
		return cnt;
		
//        int count=0;
//        int[] arr = new int[n];
//        Arrays.fill(arr,1);
//        
//        for(int i=2;i<n;i++){
//            for(int j=2; i*j < n;j++){
//                arr[i*j] = 0;
//            }
//        }
//        for(int i=2;i<arr.length;i++){
//            if(arr[i] == 1){
//                count++;
//            }
//        }
//        return count;

//		if (n == 0 || n == 1 || n == 2) {
//			return 0;
//		}
//
//		List<Integer> prime = new ArrayList<Integer>();
//
//		prime.add(2);
//
//		for (int i = 2; i < n; i++) {
//			for (int j = 0; j < prime.size(); j++) {
//				if (i % prime.get(j) == 0)
//					break;
//
//				if (j + 1 == prime.size())
//					prime.add(i);
//			}
//		}
//
//		return prime.size();

//		int result = 0, cnt = 0;
//		for (int i = 2; i < n; i++) {
//			for (int j = 2; j <= i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//			}
//
//			if (cnt == 1) {
//				result++;
//			}
//			cnt = 0;
//		}
//
//		return result;
	}
}
