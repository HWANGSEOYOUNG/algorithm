/*We have an array A of integers, and an array queries of queries.

For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the i-th query is the sum of the even values of A.

(Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)

Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.

 

Example 1:

Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
Output: [8,6,2,4]
Explanation: 
At the beginning, the array is [1,2,3,4].
After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 
입력 : A = [1,2,3,4], 쿼리 = [[1,0], [-3,1], [-4,0], [2,3]]
출력 : [8,6,2,4]
설명:
처음에 배열은 [1,2,3,4]입니다.
A [0]에 1을 더한 후 배열은 [2,2,3,4]이고 짝수 값의 합은 2 + 2 + 4 = 8입니다.
A [1]에 -3을 더한 후 배열은 [2, -1,3,4]이고 짝수 값의 합은 2 + 4 = 6입니다.
A [0]에 -4를 더한 후 배열은 [-2, -1,3,4]이며 짝수 값의 합은 -2 + 4 = 2입니다.
A [3]에 2를 더한 후 배열은 [-2, -1,3,6]이고 짝수 값의 합은 -2 + 6 = 4입니다.

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
1 <= queries.length <= 10000
-10000 <= queries[i][0] <= 10000
0 <= queries[i][1] < A.length*/

package algorithm;

import java.util.Arrays;

public class SumEvenAfterQueries {

	public static void main(String[] args) {
		
		int[] A = new int[] {1,2,3,4};
		int[][] queries = new int[][] {{1,0},{-3,1},{-4,0},{2,3}};
		
		System.out.println(Arrays.toString(sumEvenAfterQueries(A,queries)));
	}

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		
//		int[] newArr = new int[A.length];
//		
//		for (int i = 0; i < A.length; i++) {
//			A[queries[i][1]] += queries[i][0];
//			
//			int sum = 0;
//			
//			for(int j = 0; j <A.length; j++) {
//				
//				if(A[j]%2 == 0) {
//					sum += A[j];
//				}
//			}
//			newArr[i] = sum;
//			
//		}
//		return newArr;
		
//		int S = 0; // 짝수의 합
//		
//		// 일단 짝수를 다 더한다
//		for(int x : A) {
//			if(x%2 == 0) {
//				S += x;
//			}
//		}
//		
//		int[] ans = new int[queries.length]; // 새로운 배열
//		
//		for(int i = 0 ; i < queries.length; ++i) {
//			int val = queries[i][0], index = queries[i][1];
//			
//			if(A[index]% 2 ==0) {
//				S -= A[index];
//			}// index가 짝수면 일단 그 값을 빼준다
//			
//			// 그 다음에 해당 인덱스에 더할 값을 더해준다
//			A[index] += val;
//			
//			// 그리고 나서 그게 짝수면 다시 S에 그 값을 더한다
//			if(A[index] % 2 == 0) {
//				S += A[index];
//			}
//			
//			//짝수 합을 새로운 배열에 저장
//			ans[i] = S;
//		}
//		
//		return ans;
		
		
		int[] result = new int[A.length];
		int originSum = 0;
		
		for(int i : A) {
			if(i%2 == 0) {
				originSum += i;
			}
		}
		
		for (int i = 0; i < queries.length; i++) {
			int oldNum = A[queries[i][1]];
			int newNum = oldNum + queries[i][0];
			A[queries[i][1]] =newNum;
			
			if(oldNum % 2 == 0) {
				originSum -= oldNum;
			}
			
			if(newNum %2 == 0) {
				originSum += newNum;
			}
			
			result[i] = originSum;
		}
		
		return result;
	}

}
