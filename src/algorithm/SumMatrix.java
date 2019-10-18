/*https://programmers.co.kr/learn/courses/30/lessons/12950
 * ���� ����
����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
����� ��
arr1	arr2	return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	[[3],[4]]	[[4],[6]]*/

package algorithm;

import java.util.Arrays;

public class SumMatrix {
	
	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		
		System.out.println(Arrays.toString(solution(arr1,arr2)));
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
	    System.out.println(arr1.length); 
	    System.out.println(arr1[0].length);
		
	    int[][] answer = new int[arr1.length][arr1[0].length];
	      
	      for (int i = 0; i < answer.length; i++) {	    	  
	    	for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
	    
	
	      System.out.println(Arrays.toString(answer));
	      
	      return answer;
	  }

}
