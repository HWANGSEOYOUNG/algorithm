/*https://programmers.co.kr/learn/courses/30/lessons/12917
 * ���� ����
���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
s	return
Zbcdefg	gfedcbZ*/

package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringDESC {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		
		ArrayList strToInt = new ArrayList();
		
		for (int i = 0; i < s.length(); i++) {
			strToInt.add(s.charAt(i));
		}
		
		//System.out.println(strToInt);
		
		Collections.sort(strToInt, Collections.reverseOrder());
		
		//System.out.println(strToInt);
		
		String answer = "";
		
		for (int i = 0; i < strToInt.size(); i++) {
			answer =answer.concat(Character.toString((char)strToInt.get(i)));
		}
		
		//System.out.println("answer>>" +answer);
		
	      return answer;
	  }
}
