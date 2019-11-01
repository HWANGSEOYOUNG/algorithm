/*https://programmers.co.kr/learn/courses/30/lessons/12973
 * ���� ����
¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. �״���, �� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. ���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.

���� ���, ���ڿ� S = baabaa ���

b aa baa �� bb aa �� aa ��

�� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.

���ѻ���
���ڿ��� ���� : 1,000,000������ �ڿ���
���ڿ��� ��� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
����� ��
s	result
baabaa	1
cdcd	0
����� �� ����
����� �� #1
���� ���ÿ� �����ϴ�.
����� �� #2
���ڿ��� ���������� ¦���� ������ �� �ִ� ���ڿ��� �� �̻� �������� �ʱ� ������ 0�� ��ȯ�մϴ�.*/

package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CharRemove {
	
	public static void main(String[] args) {
		System.out.println(solution("cdcd"));
	}
	
	
	public static int solution(String s)
    {

		// map���� ī��Ʈ�� ���ָ� ���ӵ� �������� �˼� ����
//        HashMap <Character,Integer> map = new HashMap<Character, Integer>(); 
//        
//        for (int i = 0; i < s.length(); i++) {
//			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//		}
//        
//        for (char key : map.keySet()) {
//			if(map.get(key)%2 != 0) {
//				return 0;
//			}
//		}
		
	      int answer = 0;
	      if (s.length() % 2 == 1) {
	         return answer;
	      }
	      Stack<Character> stack = new Stack<Character>();
	      char[] Char = new char[s.length()];
	      
	      for(int i=0; i<Char.length;i++) {
	         Char[i] = s.charAt(i);
	      }
	      
	      for(int i=0; i<Char.length;i++) {
	         if(!stack.isEmpty() && Char[i] == stack.peek()) {
	            stack.pop();
	         }else {
	            stack.push(Char[i]);
	         }
	      }
	      if(stack.isEmpty()) {
	         return 1;
	      }
	      
	      return answer;
	      
		/*
		 * int answer = 0; Stack<Character> stack = new Stack<>();
		 * 
		 * for(char c : s.toCharArray()){ if(stack.size() == 0){ stack.push(c); } else
		 * if(stack.peek() == c){ stack.pop(); } else{ stack.push(c); } }
		 * 
		 * 
		 * return stack.size() > 0 ? 0 : 1;
		 */
    }

}
