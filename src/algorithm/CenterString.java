/* https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * ���� ����
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
����� ��
s	return
abcde	c
qwer	we*/

package algorithm;

public class CenterString {

	public static void main(String[] args) {
		String s ="qwer";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
	      String answer = "";
	      
	      int idx = 0;
	      if(s.length()%2 != 0) {
		      idx = s.length()/2;
		      answer = Character.toString(s.charAt(idx));
	      }else {
	    	  idx = (s.length()/2) -1;
	    	  answer = answer.concat(Character.toString(s.charAt(idx))).concat(Character.toString(s.charAt(idx+1)));
	      }

	      
	      return answer;
	  }
}
