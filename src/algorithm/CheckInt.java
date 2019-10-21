/*https://programmers.co.kr/learn/courses/30/lessons/12918
 * ���� ����
���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
����� ��
s	return
a234	false
1234	true
 * */

package algorithm;

public class CheckInt {
	
	public static void main(String[] args) {
		String s = "1234";
		System.out.println(solution(s));
	}
	
	public static boolean solution(String s) {
	      
		if(s.length()!=4 && s.length()!=6) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) > '9') {
				return false;
			}
		}
	        
	    return true;
	  }

}
