/*���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 5�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� 0���� �������� �ʽ��ϴ�.
����� ��
������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.*/

package algorithm;

public class StringToInt {
	
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
	
	public static int solution(String s) {
	      int answer = 0;
	      
	      if(s.charAt(0)=='-') {
	    	  String unsignS = s.substring(1);
	    	  answer = Integer.parseInt(unsignS);
	    	  answer = -answer;
	      }else {
	    	  answer = Integer.parseInt(s);
	      }
	      
	      
	      return answer;
	  }

}
