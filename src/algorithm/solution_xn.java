/*https://programmers.co.kr/learn/courses/30/lessons/12954
 * ���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.
����� ��
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
 */

package algorithm;

import java.util.Arrays;

public class solution_xn {
	public static void main(String[] args) {
		int x = 0, n = 5;
		System.out.println(Arrays.toString(solution(x,n)));
	}
	
	public static long[] solution(int x, int n) {
		
	      long[] answer = new long[n];
	      
	      for (int i = 0; i < answer.length; i++) {
			answer[i] = x*(i+1);
		}
	      return answer;
	  }

}
