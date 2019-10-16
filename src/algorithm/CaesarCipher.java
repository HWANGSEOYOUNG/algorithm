/* https://programmers.co.kr/learn/courses/30/lessons/12926
 * ���� ��ȣ
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
����� ��
s	n	result
AB	1	BC
z	1	a
a B z	4	e F d*/

package algorithm;

public class CaesarCipher {
	
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s,n));
	}
	
	public static String solution(String s, int n) {
	      String answer = "";
	      
	      for (int i = 0; i < s.length(); i++) {
			
	    	int num;
	    	if((int)s.charAt(i) != 32) {
		    	num = ((int)s.charAt(i))+ n;
	    	}else {
	    		num = 32;
	    	}
	    	
//			if( (65 <= (int)s.charAt(i) && 90 < num && 97 > (int)s.charAt(i) ) || (97 <= (int)s.charAt(i) && 122 <num)) {
//				num = num - 26;
//			}
			
			if( (90 < num && 97 > (int)s.charAt(i) ) || (122 < num)) {
				num = num - 26;
			}
			
			answer = answer.concat(Character.toString((char)num));
		}
	      
	      
	      return answer;
	  }
}
