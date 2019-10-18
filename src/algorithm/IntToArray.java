/* https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * ���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
����� ��
n	return
12345	[5,4,3,2,1]*/

package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class IntToArray {
	
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(long n) {
	    
		  ArrayList<Integer> list = new ArrayList<Integer>(); 
	      int cnt = 0;
	      while(n !=0) {
	    	  list.add((int)(n%10));
	    	  n /= 10;
	    	  cnt++;
	      }
	      
	      int[] answer = new int[cnt];
	      
	      for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
	      
	      return answer;
	  }

}
