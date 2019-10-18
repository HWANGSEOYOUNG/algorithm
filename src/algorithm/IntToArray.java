/* https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * 문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
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
