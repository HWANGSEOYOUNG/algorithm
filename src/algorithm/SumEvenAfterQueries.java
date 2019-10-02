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
 
�Է� : A = [1,2,3,4], ���� = [[1,0], [-3,1], [-4,0], [2,3]]
��� : [8,6,2,4]
����:
ó���� �迭�� [1,2,3,4]�Դϴ�.
A [0]�� 1�� ���� �� �迭�� [2,2,3,4]�̰� ¦�� ���� ���� 2 + 2 + 4 = 8�Դϴ�.
A [1]�� -3�� ���� �� �迭�� [2, -1,3,4]�̰� ¦�� ���� ���� 2 + 4 = 6�Դϴ�.
A [0]�� -4�� ���� �� �迭�� [-2, -1,3,4]�̸� ¦�� ���� ���� -2 + 4 = 2�Դϴ�.
A [3]�� 2�� ���� �� �迭�� [-2, -1,3,6]�̰� ¦�� ���� ���� -2 + 6 = 4�Դϴ�.

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
		
//		int S = 0; // ¦���� ��
//		
//		// �ϴ� ¦���� �� ���Ѵ�
//		for(int x : A) {
//			if(x%2 == 0) {
//				S += x;
//			}
//		}
//		
//		int[] ans = new int[queries.length]; // ���ο� �迭
//		
//		for(int i = 0 ; i < queries.length; ++i) {
//			int val = queries[i][0], index = queries[i][1];
//			
//			if(A[index]% 2 ==0) {
//				S -= A[index];
//			}// index�� ¦���� �ϴ� �� ���� ���ش�
//			
//			// �� ������ �ش� �ε����� ���� ���� �����ش�
//			A[index] += val;
//			
//			// �׸��� ���� �װ� ¦���� �ٽ� S�� �� ���� ���Ѵ�
//			if(A[index] % 2 == 0) {
//				S += A[index];
//			}
//			
//			//¦�� ���� ���ο� �迭�� ����
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
